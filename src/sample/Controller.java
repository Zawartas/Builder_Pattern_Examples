package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private Button btnButton1;
    @FXML
    private Button btnButton2;
    @FXML
    private Button btnButton3;
    @FXML
    private TextArea textArea;

    @FXML
    private void onActionBtn1() {
        simpleZombieBuilder();
        textArea.appendText("Zombie created via simpleZombieBuilder()" + System.lineSeparator());
    }

    @FXML
    private void onActionBtn2() {
        encapsulatedMonsterCreator();
        textArea.appendText("Monster created via encapsulatedMonsterCreator()" + System.lineSeparator());
    }

    @FXML
    private void onActionBtn3() {
        anotherZombieCreator();
        textArea.appendText("Zombie created via anotherZombieCreator()" + System.lineSeparator());
    }

    private Zombie simpleZombieBuilder() {
        ZombieBuilder zb = new SimpleZombieBuilder();
        zb.setName("Adam");
        zb.setType(Zombie.TYPE.DECENT);
        zb.setAttackPower(10);
        zb.setDefenceRating(5);
        zb.setHealthPoints(21);
        zb.setMovementSpeed(2);
        return zb.build();
    }

    private Monster encapsulatedMonsterCreator() {
        return new Monster.MonsterBuilder()
                .setName("George")
                .setType(Monster.TYPE.STUPID)
                .setAttackPower(12)
                .setDefenceRating(5)
                .setHealthPoints(30)
                .setMovementSpeed(4)
                .build();
    }

    private Zombie anotherZombieCreator() {
        ZombieBuilder zb = new SimpleZombieBuilder();
        zb.setName("Aaaaargh");
        zb.setType(Zombie.TYPE.CLEVER);
        zb.setAttackPower(10);
        zb.setDefenceRating(5);
        zb.setHealthPoints(21);
        zb.setMovementSpeed(2);
        return new Zombie(zb);
    }
}
