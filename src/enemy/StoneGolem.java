package enemy;

import hero.Hero;

public class StoneGolem extends Enemy {
    public StoneGolem(int health, int armour, int magicalResistance, int damage) {
        super(health, armour, magicalResistance, damage);
    }

    public StoneGolem() {
        super(100, 5, 1, 40);
    }

    @Override
    public void takeDamage(int physicalDamage, int magicalDamage, Hero hero) {
        if (Math.random() <= 0.5) { // chance to take less damage before armour calc
            physicalDamage = physicalDamage / 2;
        }
        super.setHealth(getHealth() - physicalDamage / this.armour);
        super.setHealth(getHealth() - magicalDamage / this.magicalResistance);
    }

    @Override
    public void attackHero(Hero hero) {
        super.attackHero(hero);
    }
}
