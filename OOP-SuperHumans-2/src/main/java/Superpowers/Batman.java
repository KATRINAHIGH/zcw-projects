package Superpowers;

public class Batman extends SuperHuman implements Movement, Attacker {
    public Batman() {
        super("Batman", 30 , "NonBinary", "Rich", "Batcave", "DCcomics.com", "7173245673", true, "Bruce Wayne", "Super Detective");
    }

    @Override
    public String attack() {
        return "Pow";
    }

    @Override
    public String move() {
        return "Batmobile";
    }
}
