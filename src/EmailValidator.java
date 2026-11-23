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
    public void validate(UserRegistration data) {

        if (!data.getEmail().contains("@")) {
            if (!data.getEmail().contains(".")) {
                // exception probably
            }
        }

        else{
            // throw an exception ? to avoid this being improperly validated ?
        }

        if (nextValidator != null){
            nextValidator.validate(data);
        }

    }
}
