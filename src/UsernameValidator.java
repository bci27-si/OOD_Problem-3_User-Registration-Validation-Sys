public class UsernameValidator {
    //Username Validation: The username must be non-empty and at least 5 characters long.

    public boolean VerifyUsername(String username) {

        if (username.isEmpty()) {
            System.out.println("Username is empty");
            return false;

        }

        if (username.length() < 5) {
            System.out.println("Username too short");
            return false;
        }
        System.out.println("Username: " + username + " is valid");
        return true;
    }


}
