package com.IrvinGil.excercise;

public class ContactClass {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public ContactClass(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static ContactClass stageUserInfo(String name, String phoneNumber, String emailAddress){
        return new ContactClass(name,phoneNumber,emailAddress);
    }
}
