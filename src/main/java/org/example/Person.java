package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    int size;
    boolean male;
    public Person(String firstName, String lastName, int age){
        this.firstName= firstName;
        this.lastName=lastName;
        this.age= age;
    }

    public Person(String firstName, String lastName, int age, String job, int size, boolean male){
        this.job= job;
        this.size= size;
        this.male= male;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen() {
      if (age> 13 && age<19){
          return true;
      } else {
          return false;
      }
    }
}
