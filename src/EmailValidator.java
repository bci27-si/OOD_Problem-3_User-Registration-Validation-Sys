public class EmailValidator implements Validator {

    private Validator nextValidator;

    // My design theory: validate the data and return a boolean. data as a paramater, return tru or false.

//Email Validation: The email should follow a standard format (e.g., username@domain.com).

    // first check for @, if its there, check for .com. this allows me to ensure the order is right.
    // my better idea

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;

    }

    @Override
    public void validate(UserRegistration test) {

        if (test.getEmail().contains("@")) {
            if (!test.getEmail().contains(".")) {

            }

        }

    }
}
