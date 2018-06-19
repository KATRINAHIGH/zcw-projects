package Superpowers;

public class Joker extends SuperHuman implements Movement, Attacker {
    public Joker() {
        super("Joker", 25 , "NonBinary", "Terrorist", "Gotham", "EvilDCcomics.com", "7173244444", false, "The Clown Prince of Crime", "Poison Immunity");
    }


    @Override
    public String attack() {
        return "Airborne Agent";
    }

    @Override
    public String move() {
        return "lamborghini vaydor";
    }
}
