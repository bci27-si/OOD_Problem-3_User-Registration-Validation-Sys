import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// don't need to extend JFrame because two windows open... wonder how that works. anyway...
public class ValidatorUi {
    Validator validator;

    //UserRegistration usr;

    /*
    Set Up the Java Swing UI:
Create a Java Swing form (JFrame) with fields for Username, Password, Email, and an optional Phone Number.
Add a Register button to submit the form.
Display validation error messages near each input field if validation fails.
*/
    public ValidatorUi(Validator chain) {

        // created the window here

        JFrame frame = new JFrame();

        frame.setSize(600,550);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setVisible(true);

        // new grid layout for more exact layout; 5 rows, 1 column

        //***** not sure why, but everything except button location works when \/ is 0,1
        JPanel panel = new JPanel(new GridLayout(0,1));
        frame.add(panel);

        //panel.setVisible(true);


        JLabel l = new JLabel("Username");
        JLabel l2 = new JLabel("Password");
        JLabel l3 = new JLabel("Email");
        JLabel l4 = new JLabel("Phone Number");


        //  register button
        JButton b =new JButton("Register");


        panel.add(b,BorderLayout.SOUTH);// make sure my button is at the bottom so it doesn't mess u he fields


        //field for UserName
        JTextField user = new JTextField();
        panel.add(user);
        panel.add(l);

        // take user input after button is pressed and run through COR validators
        //user.

        String userText = user.getText();
        user.setText("Username goes here");


        //field FOr password
        JTextField pass = new JTextField();
        panel.add(pass);
        panel.add(l2);

        //FIXME how do i set this so it dissapears when the user selects the field?
        String passText = pass.getText();
        pass.setText("Password goes here");


        //field for Email
        JTextField email = new JTextField();
        panel.add(email);
        panel.add(l3);
        //email.

        String emailText = email.getText();
        email.setText("Email goes here");


        //field for phone

        JTextField phone = new JTextField();

        panel.add(phone);
        panel.add(l4);

        String phoneNumbers = phone.getText();
        phone.setText("Phone goes here");


        // button up top
        b.addActionListener(e -> {
            // ADD WHAT THE BUTTON ACTUALLY DOES HERE
            System.out.println("button pressed");
            //call and run the validators through / in the main

            try{
                //input

                // create new object, pass in data from text fields, then run the validator chain...
                validator.validate(new UserRegistration(userText,passText,emailText,phoneNumbers ));

                System.out.println("user registration attempted");

            }
            catch (Exception z){
                // show a popup error / display the try catch error
                System.out.println("Error caught");

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
