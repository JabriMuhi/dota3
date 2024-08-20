import enemy.AntiMage;
import enemy.Enemy;
import enemy.StoneGolem;
import hero.Archer;
import hero.Hero;
import hero.Mage;
import hero.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Warrior"); // 25hp 5dmg
        Hero archer = new Archer("Archer"); // 15hp 15dmg
        Hero mage = new Mage("Mage"); // 5hp 25dmg

        Enemy stoneGolem = new StoneGolem(); // 100hp 5-armour 1-mage_res 40dmg
        Enemy antiMage = new AntiMage(); // 50hp 1-armour 5-mage_res 20dmg

        warrior.attackEnemy(stoneGolem);
        System.out.println(stoneGolem.getHealth());
        archer.attackEnemy(stoneGolem);
        System.out.println(stoneGolem.getHealth());
        mage.attackEnemy(stoneGolem);
        System.out.println(stoneGolem.getHealth()); //67-66

        stoneGolem.attackHero(mage);
        System.out.println(mage.isAlive()); // false (mage is dead)

        archer.attackEnemy(stoneGolem);
        archer.attackEnemy(stoneGolem);
        archer.attackEnemy(stoneGolem);
        archer.attackEnemy(stoneGolem);
        archer.attackEnemy(stoneGolem);
        archer.attackEnemy(stoneGolem);
        System.out.println(stoneGolem.getHealth()); //21

        warrior.attackEnemy(stoneGolem);
        System.out.println(stoneGolem.isAlive()); // false (has been executed)

        antiMage.attackHero(archer);
        System.out.println(archer.isAlive()); // false
    }
}
