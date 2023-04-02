package ir.maktab92.onlineshop.base.domain;

import ir.maktab92.onlineshop.domain.Address;

public class User extends Entity {
    private String name;
    private String family;
    private String phoneNumber;
    private String  emailAddress;
    private  String password;
    private Address address;

    public User(long id,String name, String family, String phoneNumber, String emailAddress, String passWord, Address address) {
        super(id);
        this.name = name;
        this.family = family;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = passWord;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", passWord='" + password + '\'' +
                ", address=" + address +
                '}';
    }

}
