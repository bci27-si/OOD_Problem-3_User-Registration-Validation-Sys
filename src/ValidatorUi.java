import javax.swing.*;
import java.awt.*;

// don't need to extend JFrame because two windows open... wonder how that works. anyway...
public class ValidatorUi {
    Validator validator;
    JButton b;
    /*
    Set Up the Java Swing UI:
Create a Java Swing form (JFrame) with fields for Username, Password, Email, and an optional Phone Number.
Add a Register button to submit the form.
Display validation error messages near each input field if validation fails.
*/
    public ValidatorUi(Validator chain) {
//THIS CAUSED A NULL ERROR. IT MUST BE HERE
        this.validator = chain;
        // created the window here

        JFrame frame = new JFrame();
        frame.setSize(600,550);

        //frame.setVisible(true);
        // new grid layout for more exact layout; 9 rows, 1 column

        JPanel panel = new JPanel(new GridLayout(9,1));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Username");
        JLabel l2 = new JLabel("Password");
        JLabel l3 = new JLabel("Email");
        JLabel l4 = new JLabel("Phone Number");

        //field for UserName
        JTextField user = new JTextField();
        panel.add(l);
        panel.add(user);

        // take user input after button is pressed and run through COR validators
        //user. construcor ONLY RUNS ONCE get methods placed into button try loop*****

        //field FOr password
        JTextField pass = new JTextField();
        panel.add(l2);
        panel.add(pass);

        //field for Email
        JTextField email = new JTextField();
        panel.add(l3);
        panel.add(email);

        //field for phone
        JTextField phone = new JTextField();
        panel.add(l4);
        panel.add(phone);
        //phone.setText("Phone goes here");

        // not sure why but i had this and it didn't work with only this being different and no JButton b; line...
        /*
        JButton b = new JButton("Register");
         */

        // ui components are added in order of display
        //  register button
        b = new JButton("Register");
        panel.add(b);// make sure my button is at the bottom so it doesn't mess u he fields

        // button up top
        b.addActionListener(e -> {
            // ADD WHAT THE BUTTON ACTUALLY DOES HERE
            //call and run the validators through / in the main

            try{
                //input
                UserRegistration input = new UserRegistration(
                    user.getText(),pass.getText(),email.getText(),phone.getText()

                );

                // create new object, pass in data from text fields, then run the validator chain...
                validator.validate(input);
            }
            catch (Exception z){
                // show a popup error / display the try catch error
                System.out.println("Error caught " + z.getMessage());

            }
        });

        //frame.pack();
        frame.setVisible(true);
        // the ui does not seem affected whether or not this is at the top or bottom... pack seems to collide with gridlayout.
    }

/*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ValidatorUi::new);
    }
*/

}
