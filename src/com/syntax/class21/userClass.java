package com.syntax.class21;

public class userClass {

    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

}
class userInfo extends userClass {
    String address;

    public userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }
    void userDetails() {
        System.out.println(name + " " + mobileNumber + " " + address);
    }
}
 class userTest {
     public static void main(String[] args) {
        userInfo tester = new userInfo("Andrew", "555-444-1234", "21 Jump St");
        tester.userDetails();
      }
  }

