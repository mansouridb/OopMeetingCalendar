package org.example.models;


public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String userCredentials;
    private int count;

    public Person(int id, String firstName, String lastName, String email, String userCredentials) {
        this.id = getCount(count);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUserCredentials(userCredentials);
    }

    public int getCount(int count) {
        this.id = count++;
        return getCount(count);
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserCredentials() {
        return userCredentials;
    }

    public void setFirstName(String firstName) {
        if (firstName==null) throw new IllegalArgumentException("Please Enter the first name!!!");
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        if(lastName== null) throw new IllegalArgumentException("Please Enter the last name !!! ");
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email==null) throw  new IllegalArgumentException("Please Enter Email Address!!!");
        this.email = email;
    }

    public void setUserCredentials(String userCredentials) {
        this.userCredentials = userCredentials;
    }
}
