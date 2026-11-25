public class PhoneNumberValidator implements Validator {

    // htis is OPTIONAL ACCORDING TO THE DOC
    private Validator nextValidator;

//Phone Number Validation:  validation to ensure the phone number:
//Has exactly 10 digits.
//Contains only numbers.

    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(UserRegistration data) {

        try{
            if (data.getPhone().length() != 10) {
                throw new Exception("Invalid phone number");
            }
            /*
            // make format specific error
            else if (data.getPhone().length() != 11) {
                throw new Exception("Invalid phone number");
            }
            // make error specific to ints

             */
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            // no next validator so return everything else.
        }

    }
}
