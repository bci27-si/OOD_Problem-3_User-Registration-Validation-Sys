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
    public void validate(UserRegistration data) throws Exception {

        String email = data.getEmail();

        //at symbol
        int at = email.indexOf("@");
        int dot =  email.indexOf(".");
        // uses the index of the charachter to determine if its in the right place

        //probably should add logic for a minimum 1 letter  between @ and . before and after as well.

            if(email.length() <= 4){
                throw new Exception("Email too short");
            }

            if (!email.contains("@")) {
                throw new Exception("Address has no ' @ ' symbol ");

            }

            if (!email.contains(".")) {
                // exception probably
                throw new Exception("Address has no '.' after '@' ");
            }

            // add format exception

        // || = or seems to be the only way to write or in java
            if(at < 1 || at > dot || dot == email.length()){
                // throw an exception ? to avoid this being improperly validated ?
                throw new Exception("Email format Incorrect");
            }
            System.out.println("Email Works");

            // instaed of setting the validator to null, i throw an exception and break before its assessed
            if (nextValidator != null) {
                nextValidator.validate(data);
            }
        }


    }

