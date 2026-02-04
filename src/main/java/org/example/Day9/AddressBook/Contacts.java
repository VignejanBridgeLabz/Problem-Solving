package org.example.Day9.AddressBook;

public class Contacts {
    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String zip;
    public Long phone;
    public String email;

    public Contacts(String firstName, String lastName, String address, String state, String city, String zip, Long phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        System.out.println();
        return "First Name : " + firstName +
                "\nLast Name  : " + lastName +
                "\nAddress    : " + address +
                "\nCity       : " + city +
                "\nState      : " + state +
                "\nZip        : " + zip +
                "\nPhone      : " + phone +
                "\nEmail      : " + email;
    }
}
