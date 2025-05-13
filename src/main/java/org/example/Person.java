package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;

    public Person(String firstname,String lastname,int age) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;

    }
    public Person(String firstname,String lastname,int age,double salary,boolean isMarried,String[] hobbies){
        this(firstname, lastname, age);
        this.salary=salary;
        this.hobbies=hobbies;
        this.isMarried=isMarried;
    }

    public String getFirstName(){
       return this.firstname;
    }

    public String getLastName(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return this.age>=13 && this.age<=19;
    }

}
