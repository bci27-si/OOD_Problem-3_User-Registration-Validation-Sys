public class PasswordValidator {

    //Password Validation: The password must:
    //Be at least 8 characters long.
    //Contain at least one uppercase letter.
    //Contain at least one lowercase letter.
    //Contain at least one digit.

    boolean lowercase = false;
    boolean lowercase = false;
    boolean lowercase = false;
    boolean lowercase = false;

    public boolean validate(String password) {

        if (password.length() < 8) {
            return false;
        }
        if (password.hasLower()) {
            return true;


        }

    }




}
