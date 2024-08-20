import enemy.StoneGolem;
import hero.Archer;
import hero.Hero;
import hero.Mage;
import hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero heroArcher = new Archer("JabriMuhi_archer");
        heroArcher.attackEnemy(new StoneGolem(0, 10, 10, 10));

        Hero heroWarrior = new Warrior("JabriMuhi_warrior");
        heroWarrior.attackEnemy(new StoneGolem(10, 10, 10, 10));

        Hero heroMage = new Mage("JabriMuhi_mage");
        heroMage.attackEnemy(new StoneGolem(10, 10, 10, 10));
    }
}
