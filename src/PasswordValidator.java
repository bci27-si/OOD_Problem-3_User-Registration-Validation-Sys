public class PasswordValidator implements Validator {
    //Password Validation: The password must:
    //Be at least 8 characters long.
    //Contain at least one uppercase letter.
    //Contain at least one lowercase letter.
    //Contain at least one digit.

    private Validator nextValidator;

    //boolean hasLength = true; // might break, but should work fine w current logic
    private boolean hasLower = false;
    private boolean hasUppercase = false;
    private boolean hasDigit = false;
    // only accessible by code in this class. Obv otherwise through a getter or setter

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) throws Exception{
        // better idea; get passwrod, cast it to a string then i can do all my checks
        String pass = data.getPassword();

        // check the difference between is empty and is blank
        // i figured correct, blank involves whitespace characters, empty is for a string that is exactly 0 characters.

        if(pass.isBlank()){
            throw new Exception("Password is empty");
            //System.out.println("Password is empty");
                // needs to error out here

        }
            // need to put a for loop here tha goes over each digit of the password and checks it
        else if (pass.length() < 8) {
            throw new Exception("Password too short");
            //System.out.println("Password is too short");

        }

        for (int i = 0; i < pass.length(); i++) {

            char character = pass.charAt(i);

                //check for Uppercase
                // check only if the condition has not already been met
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }

                // check for loweCase
            if (Character.isLowerCase(character)) {
                hasLower = true;
            }

                // is digit and has digit don't work...
            if (Character.isDigit(character)) {
                    //hasDigit = true;
                hasDigit = true;

            }                //throw new Exception("Password does not meet requirements " );

        }

        // this allows for a more accurate explanation of why something broke

        if (!hasUppercase) {
            throw new Exception("Password contains No uppercase characters");

        }
        if (!hasLower) {
            throw new Exception("Password contains No lower case characters");
        }
        if (!hasDigit) {
            throw new Exception("Password contains No digit characters");
        }

        if (nextValidator != null) {
            nextValidator.validate(data);
        }

    }
}

/*
// (hasUppercase && hasDigit && hasLower) = true simplified to \/
        if (!(hasUppercase && hasDigit && hasLower)) {
            throw new Exception("Password is unacceptable");

            //System.out.println("Password looks good1");
            // attempting to fix the logic by checking for all bools after the entire string is read.
            // I didn't want this since it makes the program slower by some ultra tiny amount
            //break;
        }
*/