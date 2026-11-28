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
    public void validate(UserRegistration data) throws Exception {

        String phone = data.getPhone();

        if (phone.length() != 10) {
            throw new Exception("Phone Must be 10 Digits");
        }
            // make format specific error
        // check for numbers only
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                throw new Exception("Numbers only here");
            }
        }
            // make error specific to ints

    }
}
