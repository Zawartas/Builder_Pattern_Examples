package sample;

public class Controller {

    Zombie doIt () {
        ZombieBuilder zb = new SimpleZombieBuilder();
        zb.setName("Adam");
        zb.setType(Zombie.TYPE.DECENT);
        zb.setAttackPower(10);
        zb.setDefenceRating(5);
        zb.setHealthPoints(21);
        zb.setMovementSpeed(2);
        return zb.build();
    }

    Monster createMonster() {
        return new Monster.MonsterBuilder()
                .setName("George")
                .setType(Monster.TYPE.STUPID)
                .setAttackPower(12)
                .setDefenceRating(5)
                .setHealthPoints(30)
                .setMovementSpeed(4)
                .build();
    }
}
