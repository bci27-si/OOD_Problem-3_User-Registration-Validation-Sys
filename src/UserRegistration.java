public class UserRegistration {
    // hold the user inputs username, password, email, phonenumber

/*

Define UserRegistration Class:
Create a class UserRegistration to hold the user’s inputs
(username,
password,
email, and
phoneNumber).

 */

    private String username;
    private String password;
    private String email;
    private String phone;

    // put into constructor

    public UserRegistration(String username, String password, String email, String phone) {

        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
// create the classes one by one

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


}
