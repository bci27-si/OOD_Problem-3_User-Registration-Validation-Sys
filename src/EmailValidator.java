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

        try{
            if (!data.getEmail().contains("@")) {
                //probably should add logic for a minimum 1 letter  between @ and . before and after as well.
                if (!data.getEmail().contains(".")) {
                    // exception probably
                }
            }
            else{
                // throw an exception ? to avoid this being improperly validated ?
                nextValidator = null;
                throw new Exception("Email format not correct");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            if (nextValidator != null){
                nextValidator.validate(data);
            }

        }


    }
}
