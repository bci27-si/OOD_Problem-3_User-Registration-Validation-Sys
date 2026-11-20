import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidatorUi extends JFrame {

    /*Set Up the Java Swing UI:
Create a Java Swing form (JFrame) with fields for Username, Password, Email, and an optional Phone Number.
Add a Register button to submit the form.
Display validation error messages near each input field if validation fails.
*/
    JFrame frame = new JFrame();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,450);
    frame.setVisiblie(true);


//  register button
    JButton b =new JButton("Register");

    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            // ADD WHAT THE BUTTON ACTUALLY DOES HERE
            System.out.println("button acton");
        }
    }

    frame.add(b);

    //field for UserName
    JTextField user = new JTextField(50);
    frame.add(field);

    String userText = user.getText();
    user.setText("Username goes here");

    //field FOr password
    JTextField user = new JTextField(50);
    frame.add(field);

    String userText = user.getText();
    user.setText("Username goes here");

    //field for Email
    JTextField user = new JTextField(50);
    frame.add(field);

    String userText = user.getText();
    user.setText("Username goes here");

    //field for phone

    JTextField user = new JTextField(50);
    frame.add(field);

    String userText = user.getText();
    user.setText("Username goes here");




}
