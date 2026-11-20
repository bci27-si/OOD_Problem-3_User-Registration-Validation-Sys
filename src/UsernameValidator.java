public class UsernameValidator implements Validator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    private Validator nextValidatoralidator;

    public boolean ValidateUsername(String username) {


    }


    @Override
    public void setNextvalidator(Validator nextvalidator) {
        this.nextvalidator = nextvalidator;

    }

    @Override
    public void validate(UserRegistration test) {
        if (test.isEmpty()) {
            System.out.println("Username is empty");

        }

        if (test.length() < 5) {
            System.out.println("Username too short");

        }
        System.out.println("Username: " + test.getUsername()+ " is valid");

    }
}
