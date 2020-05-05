package sample;

public interface ZombieBuilder {
    ZombieBuilder setName(String name);
    ZombieBuilder setType(Zombie.TYPE type);
    ZombieBuilder setHealthPoints(int healthPoints);
    ZombieBuilder setAttackPower(int attackPower);
    ZombieBuilder setDefenceRating(int defenceRating);
    ZombieBuilder setMovementSpeed(int movementSpeed);

    public String getName();
    public Zombie.TYPE getType();
    public int getHealthPoints();
    public int getAttackPower();
    public int getDefenceRating();
    public int getMovementSpeed();


    Zombie build();
}
