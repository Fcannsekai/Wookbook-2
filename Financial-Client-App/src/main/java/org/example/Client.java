package org.example;

public class Client {

    String firstName;
    String lastName;
    String businessName;
    String phoneNumber;
    String emailAddress;

    // Constructor
    // To design and create new clients this is a requirment
    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.emailAddress = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFormattedName() {
        return firstName + " " + lastName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

}
