package sample;

public class Zombie {

    public enum TYPE {
        STUPID,
        DECENT,
        CLEVER
    }
    private String name;
    private TYPE type;
    private int healthPoints;
    private int attackPower;
    private int defenceRating;
    private int movementSpeed;

    public Zombie(String name, TYPE type, int healthPoints, int attackPower, int defenceRating, int movementSpeed) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.defenceRating = defenceRating;
        this.movementSpeed = movementSpeed;
    }
}
