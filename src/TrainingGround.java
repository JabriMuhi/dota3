import enemy.Enemy;
import hero.Archer;
import hero.Hero;
import hero.Mage;
import hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero heroArcher = new Archer("JabriMuhi_archer", 10);
        heroArcher.attackEnemy(new Enemy(10, 10, 10));

        Hero heroWarrior = new Warrior("JabriMuhi_warrior", 10000);
        heroWarrior.attackEnemy(new Enemy(10, 10, 10));

        Hero heroMage = new Mage("JabriMuhi_mage", 1);
        heroMage.attackEnemy(new Enemy(10, 10, 10));
    }
}
