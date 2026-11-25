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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            // no next validator so return everything else.
        }


        // add a check that tries to add 1 to a digit
        // and detects whether it is or isnt a number


    }
}
/*
    if (phoneNumber.contains()) {
        return false;
    }

    return true;
}
*/
