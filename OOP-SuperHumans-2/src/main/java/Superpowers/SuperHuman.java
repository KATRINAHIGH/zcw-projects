package Superpowers;

import java.util.Formatter;

public class SuperHuman extends Human {

    private Boolean isGood;
    private String heroName;
    private String superAbility;
    //Do more research on nullary constructor
    public SuperHuman() {
    }

    public SuperHuman(String name, int age, String gender, String occupation, String address, String email, String phoneNumber) {
        super(name, age, gender, occupation, address, email, phoneNumber);
    }

    public SuperHuman(String name, int age, String gender, String occupation, String address, String email, String phoneNumber,
                      Boolean isGood, String heroName, String superAbility){
        super(name, age, gender, occupation, address, email, phoneNumber);
        this.isGood = isGood;
        this.heroName = heroName;
        this.superAbility = superAbility;

    }

    public Boolean getGood() {
        return isGood;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    @Override
    public String toString(){

        Formatter outPut = new Formatter();
        outPut.format("Name: %s%nAge: %s%nGender: %s%nOccupation: %s%nAddress: %s%nEmail: %s%nPhoneNumber: %s%nHeroName: %s%n" +
                        "isGood: %s%nsuperAbility: %s",
                this.name, this.age, this.gender, this.occupation, this.address, this.email, this.phoneNumber,
                this.heroName, this.isGood, this.superAbility);
        return outPut.toString();
    }
}
 /**
         As before, create methods for retrieving field data and printing to screen. */