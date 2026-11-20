import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidatorUi extends JFrame {

    /*
    Set Up the Java Swing UI:
Create a Java Swing form (JFrame) with fields for Username, Password, Email, and an optional Phone Number.
Add a Register button to submit the form.
Display validation error messages near each input field if validation fails.
*/
    public ValidatorUi() {

        // created the window here

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,450);
        frame.setVisible(true);

        // new grid layout for more exact layout
        JPanel panel = new JPanel(new GridLayout());
        frame.add(panel);

        //panel.setVisible(true);

//  register button
        JButton b =new JButton("Register");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // ADD WHAT THE BUTTON ACTUALLY DOES HERE
                System.out.println("button acton");
            }
        });

        panel.add(b);

        //field for UserName
        JTextField user = new JTextField(50);
        panel.add(user);

        String userText = user.getText();
        user.setText("Username goes here");

        //field FOr password
        JTextField pass = new JTextField(50);
        panel.add(pass);

        String passText = pass.getText();
        pass.setText("Password goes here");

        //field for Email
        JTextField email = new JTextField(50);
        panel.add(email);

        String emailText = email.getText();
        email.setText("Email goes here");

        //field for phone

        JTextField phone = new JTextField(50);
        panel.add(phone);

        String phoneNumbers = phone.getText();
        phone.setText("Phone goes here");


    }
/*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ValidatorUi::new);
    }
*/
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ValidatorUi().setVisible(true);

            }
        });
    }



}

