class Registration {

    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if (email.contains("Yahoo")){
            System.out.println(email + " - email is valid");
        } else {
            System.out.println(email + " email is invalid");
        }

    }

    void setUserName(String userName){
        this.userName = userName;

        if (userName.isEmpty()){
            System.out.println("Username cannot be empty");
        } else if (userName.length() < 6) {
            System.out.println("Username must be greater than 6 characters");
        }else {
            System.out.println("Username "+userName+" is valid");
        }
    }

    void setPassword (String password) {
        this.password = password;

        if (password.isEmpty()){
            System.out.println("Password cannot be empty");
        } else if (password.length() < 6) {
            System.out.println("Password must be greater than 6 characters");
        } else if (password.contains(userName)){
            System.out.println("Password must not contain Username");
        } else {
            System.out.println("Password is valid");
        }
    }

}

public class EmailRegistration {
    public static void main (String[] args){

        Registration user1 = new Registration();

        user1.setEmail("billybobthornton@yahoo.com");
        user1.setUserName("billybobsantaclaus");
        user1.setPassword("ThisIsAPassword123!!");

    }
}
