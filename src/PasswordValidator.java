public class PasswordValidator implements Validator {
    //Password Validation: The password must:
    //Be at least 8 characters long.
    //Contain at least one uppercase letter.
    //Contain at least one lowercase letter.
    //Contain at least one digit.

    private Validator nextValidator;

    //boolean hasLength = true; // might break, but should work fine w current logic
    boolean hasLower = false;
    boolean hasUppercase = false;
    boolean hasDigit = false;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) {
        // better idea; get passwrod, cast it to a string then i can do all my checks
        String pass = data.getPassword();

        // check the difference between is empty and is blank
        // i figured correct, blank involves whitespace characters, empty is for a string that is exactly 0 characters.
        if(pass.isBlank()){
            System.out.println("Password is empty");
            // needs to error out here

        }
        // need to put a for loop here tha goes over each digit of the password and checks it
        if (pass.length() < 8) {
            System.out.println("Password is too short");
            //FIXME needs to error out here
            //return false;
        }

        for (int i = 0; i < pass.length(); i++) {

            char character = pass.charAt(i);

            //check for Uppercase
            // check only if the condition has not already been met
            if (hasUppercase && Character.isUpperCase(character)) {
                hasUppercase = true;
            }

            // check for loweCase
            if (hasLower && Character.isLowerCase(character)) {
                hasLower = true;
            }

            // is digit and has digit don't work...
            if (hasDigit && Character.isDigit(character)) {
                //hasDigit = true;
                hasDigit = true;

            }

            if (hasUppercase && hasDigit && hasLower) {
                System.out.println("Password looks good1");
                break;

            }
        }

        if (nextValidator != null) {
            nextValidator.validate(data);
        }

    }
}
