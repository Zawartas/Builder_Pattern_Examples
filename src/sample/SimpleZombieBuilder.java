package sample;

import sample.Zombie.TYPE;

public class SimpleZombieBuilder implements ZombieBuilder {
    private String name;
    private TYPE type;
    private int healthPoints;
    private int attackPower;
    private int defenceRating;
    private int movementSpeed;

    public SimpleZombieBuilder() {
    }

    @Override
    public SimpleZombieBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SimpleZombieBuilder setType(TYPE type) {
        this.type = type;
        return this;
    }

    @Override
    public SimpleZombieBuilder setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        return this;
    }

    @Override
    public SimpleZombieBuilder setAttackPower(int attackPower) {
        this.attackPower = attackPower;
        return this;
    }

    @Override
    public SimpleZombieBuilder setDefenceRating(int defenceRating) {
        this.defenceRating = defenceRating;
        return this;
    }

    @Override
    public SimpleZombieBuilder setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public TYPE getType() {
        return type;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public int getDefenceRating() {
        return defenceRating;
    }

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public Zombie build() {
        return new Zombie(name, type, healthPoints, attackPower, defenceRating, movementSpeed);
    }
}
