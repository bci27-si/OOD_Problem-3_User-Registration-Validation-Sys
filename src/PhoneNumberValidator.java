public class PhoneNumberValidator {

    // htis is OPTIONAL ACCORDING TO THE DOC

//Phone Number Validation:  validation to ensure the phone number:
//Has exactly 10 digits.
//Contains only numbers.

    public boolean validatePhoneNumber(String phoneNumber) {

        if (phoneNumber.length() != 10) {
            return false;
        }
        return true;
    }
}
/*
    if (phoneNumber.contains()) {
        return false;
    }

    return true;

}
*/
