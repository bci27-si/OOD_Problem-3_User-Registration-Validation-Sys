public class PasswordValidator implements Validator {
    //Password Validation: The password must:
    //Be at least 8 characters long.
    //Contain at least one uppercase letter.
    //Contain at least one lowercase letter.
    //Contain at least one digit.

    private Validator nextValidator;

    boolean hasLength = true; // might break, but should wok fine w current logic
    boolean hasLower = false;
    boolean hasUppercase = false;
    boolean hasDigit = false;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) {
        for (int i = 0; i < data.getPassword().length(); i++) {

            // need to put a for loop here tha goes over each digit of the password and checks it
            if (data.getPassword().length() < 8) {
                hasLength = false;
                break;
                //return false;
            }

            if (hasLower = false) {
                data.getPassword().contains();

            }

            if (hasUppercase = false) {
                data.getPassword().hasUpper(i);

            }

            // is digit and has digit don't work...
            if (data.getPassword().isDigit()) {
                hasDigit = true;

            }
        }

    }
}

