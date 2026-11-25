public class UsernameValidator implements Validator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    private Validator nextValidator;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) {
        System.out.println("developer check" + data.getUsername());
        if (data.getUsername() == null || data.getUsername().isEmpty()) {
            //System.out.println("Username is empty");
            nextValidator = null;

        }
// the sout statements don't print...
        if (data.getUsername().length() < 5) {
            //System.out.println("Username too short");
            nextValidator = null;

        }
        System.out.println("Username: " + data.getUsername()+ " is valid");

        if (nextValidator != null) {
            nextValidator.validate(data);
        }

    }
}
