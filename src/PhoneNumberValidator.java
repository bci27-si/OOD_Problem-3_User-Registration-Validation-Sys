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
    public void validate(UserRegistration test) {
        if (test.getPhone().length() != 10) {
            System.out.println("Invalid phone number");
        }

    }
}
/*
    if (phoneNumber.contains()) {
        return false;
    }

    return true;

}
*/
