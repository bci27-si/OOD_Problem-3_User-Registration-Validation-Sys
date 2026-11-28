public class UsernameValidator implements Validator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    private Validator nextValidator;

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) {

        try {
            // is empty check for every kind of charachter, even blanks.
            if (data.getUsername() == null || data.getUsername().isEmpty()) {
                //System.out.println("Username is empty");
                throw new Exception("Username is empty");// throw the default exception...

            }//()
// the sout statements don't print...
            else if (data.getUsername().length() < 5) {
                //System.out.println("Username too short");
                throw new Exception("Username too short");
            }
    }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println("Invalid username");

        }

        finally{
            System.out.println("Validating username: " + nextValidator.toString());

            if (nextValidator != null) {
                nextValidator.validate(data);
            }

        }
    }
}

