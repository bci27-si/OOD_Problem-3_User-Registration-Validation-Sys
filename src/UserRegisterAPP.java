import javax.swing.SwingUtilities;

public class UserRegisterAPP {

    /**
     * Fixed ui problem by goint to JDK Default instaed of letting it stay set to 26...
     * @param args
     */
    // check to find the null error;
    //UserRegistration u;


    static void main(String[] args) {

        // create the validator objects
        Validator UsernameValidator = new UsernameValidator();
        Validator PasswordValidator = new PasswordValidator();
        Validator EmailValidator = new EmailValidator();
        Validator phoneNumberValidator = new PhoneNumberValidator();

        // validators connected properly for user > pass > email > phone
        UsernameValidator.setNextValidator(PasswordValidator);
        PasswordValidator.setNextValidator(EmailValidator);
        EmailValidator.setNextValidator(phoneNumberValidator);

        // start swing
        SwingUtilities.invokeLater(()-> new ValidatorUi(UsernameValidator));
        // FIXME add the call for button to check all the fields

    }
}
        /*
                java: invalid source release 26 with --enable-preview
            (preview language features are only supported for release 27)
         */

        // set up everything here
        // for connetiong the ui to validators
/*
        username;
        password;
        email;
        phone;

    start the ui here get data from the fields, then
    create the swing ui IN A SEPERATE CLASS

       Set Up and Test the Validation Chain:
In your main class, set up the validators in sequence and link them using the CoR pattern.
When the Register button is clicked, initiate validation, and display a success message if all fields are valid.
     */

