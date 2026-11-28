public class UsernameValidator implements Validator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    private Validator nextValidator;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }


    @Override
    public void validate(UserRegistration data) throws Exception {
        // updated logic to shorrten statements
        String user = data.getUsername();

        // is empty check for every kind of charachter, even blanks.
        if (user == null || user.isEmpty()) {
                //System.out.println("Username is empty");
            throw new Exception("Username is empty");// throw the default exception...

        }
        //()

        // the sout statements don't print...
        if (user.length() < 5) {
                //System.out.println("Username too short");
            throw new Exception("Username too short");

        }

        //System.out.println("Validating username: " + nextValidator.toString());
        if (nextValidator != null) {
            nextValidator.validate(data);
        }
    }
}

