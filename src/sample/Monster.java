package sample;

public class Monster {

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

    private Monster(MonsterBuilder monsterBuilder) {
        this.attackPower = monsterBuilder.getAttackPower();
        this.defenceRating = monsterBuilder.getDefenceRating();
        this.healthPoints = monsterBuilder.getHealthPoints();
        this.movementSpeed = monsterBuilder.getMovementSpeed();
        this.name = monsterBuilder.getName();
        this.type = monsterBuilder.getType();
    }

    public String getName() {
        return name;
    }

    public TYPE getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefenceRating() {
        return defenceRating;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public static class MonsterBuilder {

        private String name;
        private Monster.TYPE type;
        private int healthPoints;
        private int attackPower;
        private int defenceRating;
        private int movementSpeed;

        public MonsterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MonsterBuilder setType(Monster.TYPE type) {
            this.type = type;
            return this;
        }

        public MonsterBuilder setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
            return this;
        }

        public MonsterBuilder setAttackPower(int attackPower) {
            this.attackPower = attackPower;
            return this;
        }

        public MonsterBuilder setDefenceRating(int defenceRating) {
            this.defenceRating = defenceRating;
            return this;
        }

        public MonsterBuilder setMovementSpeed(int movementSpeed) {
            this.movementSpeed = movementSpeed;
            return this;
        }

        public Monster build() {
            return new Monster(this);
        }

        public String getName() {
            return name;
        }

        public Monster.TYPE getType() {
            return type;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public int getAttackPower() {
            return attackPower;
        }

        public int getDefenceRating() {
            return defenceRating;
        }

        public int getMovementSpeed() {
            return movementSpeed;
        }
    }
}
