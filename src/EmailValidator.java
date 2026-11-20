public class EmailValidator {

    // My design theory: validate the data and return a boolean. data as a paramater, return tru or false.

//Email Validation: The email should follow a standard format (e.g., username@domain.com).

    public boolean validateEmail(String email) {

        // first check for @, if its there, check for .com. this allows me to ensure the order is right.
        // my better idea

        if (email.contains("@")) {
            if (!email.contains(".")) {
                return false;
            }
            return false;
        }
        return true;

/*
        // this was filled in for me... im not sure if this checks order or not...
        if(email.contains("@") || email.contains(".com") || email.contains(".") || email.contains(".")) {

            System.out.println(email.contains("@"));
            System.out.println(email.contains("."));
            System.out.println(email.contains(""));
            System.out.println(email.contains(".com"));
            return true;

            return true;

        }
        return false;
    */
    }

}
