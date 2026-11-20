public class UsernameValidator implements Validator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    private Validator nextValidator;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration test) {
        if (test.getUsername() == null || test.getUsername().equals("")) {
            System.out.println("Username is empty");

        }

        if (test.getUsername().length() < 5) {
            System.out.println("Username too short");

        }
        System.out.println("Username: " + test.getUsername()+ " is valid");

    }
}
