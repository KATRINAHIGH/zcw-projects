package Superpowers;
import java.util.Formatter;
/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    //Why are some of the instance variables in our program instiantated and not in others.
    //Why do we create an instance of an array here but always instiate in the constructor.
    protected String name;
    protected int age;
    protected String gender;
    protected String occupation;
    protected String address;
    protected String email;
    protected String phoneNumber;

    //Do more research on nullary constructors. The most important thing is creates object.
    public Human() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.gender = "";
        this.occupation = "";
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public Human(String name, int age, String gender, String occupation, String address, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public String getGender() {

        return gender;
    }

    public String getOccupation() {

        return occupation;
    }

    public String getAddress() {

        return address;
    }

    public String getEmail() {

        return address;
    }

    public String getPhoneNumber() {

        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setOccupation(String occupation) {

        this.occupation = occupation;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setEmail() {

        this.email = email;
    }

    public void setPhoneNumber() {

        this.phoneNumber = phoneNumber;
    }

    //the default object has a toString method. Every java object should be able to return a string representation of itself.
    //This is the convention when printing an object. If I'm passing around the object to print it will have tooString attached
    //to it. The override changes the format of the output from toString
    @Override
    public String toString(){

        Formatter outPut = new Formatter();
         outPut.format("Name: %s%nAge: %s%nGender: %s%nOccupation: %s%nAddress: %s%nEmail: %s%nPhoneNumber: %s",
        this.name, this.age, this.gender, this.occupation, this.address, this.email, this.phoneNumber);
         return outPut.toString();
    }


}

