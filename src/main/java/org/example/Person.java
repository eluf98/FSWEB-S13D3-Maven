package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;

    String email;
    String phoneNumber;
    String address;

    public Person(String firstname,String lastName, int age){
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
    }

    //Overloaded Constructor
    public Person(String firstname, String lastname, int age, String email, String phoneNumber, String address){
        this(firstname,lastname,age); // Calling constructor
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age>=13 && age <=19;
    }
}
