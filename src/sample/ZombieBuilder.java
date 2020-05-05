package sample;

public interface ZombieBuilder {
    ZombieBuilder setName(String name);
    ZombieBuilder setType(Zombie.TYPE type);
    ZombieBuilder setHealthPoints(int healthPoints);
    ZombieBuilder setAttackPower(int attackPower);
    ZombieBuilder setDefenceRating(int defenceRating);
    ZombieBuilder setMovementSpeed(int movementSpeed);

    Zombie build();
}
