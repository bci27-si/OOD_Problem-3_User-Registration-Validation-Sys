public class UserRegisterAPP {


    public static void main(String[] args) {

        // create the validator objects
        Validator UsernameValidator = new UsernameValidator();
        Validator PasswordValidator = new PasswordValidator();
        Validator EmailValidator = new EmailValidator();
        Validator phoneNumberValidator = new PhoneNumberValidator();

        // validators connected properly for user > pass > email > phone
        UsernameValidator.setNextValidator(PasswordValidator);
        PasswordValidator.setNextValidator(EmailValidator);
        EmailValidator.setNextValidator(phoneNumberValidator);


        // set up everything here
        // for connetiong the ui to validators


/*
        username;
        password;
        email;
        phone;
        */
        //start the ui here get data from the fields, then
    }


    // create the swing ui IN A SEPERATE CLASS
    /*

       Set Up and Test the Validation Chain:
In your main class, set up the validators in sequence and link them using the CoR pattern.
When the Register button is clicked, initiate validation, and display a success message if all fields are valid.


     */
}
