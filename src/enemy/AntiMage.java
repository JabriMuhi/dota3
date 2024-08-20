package enemy;

import hero.Hero;

public class AntiMage extends Enemy{
    public AntiMage(int health, int armour, int magicalResistance, int damage) {
        super(health, armour, magicalResistance, damage);
    }

    public AntiMage() {
        super(50, 1, 5, 20);
    }

    @Override
    public void takeDamage(int physicalDamage, int magicalDamage, Hero hero) {
        if (Math.random() <= 0.3) { // chance to reflect magical damage
            hero.takeDamage(magicalDamage);
            super.setHealth(getHealth() - physicalDamage / this.armour);
        } else {
            super.setHealth(getHealth() - physicalDamage / this.armour);
            super.setHealth(getHealth() - magicalDamage / this.magicalResistance);
        }
    }

    @Override
    public void attackHero(Hero hero) {
        super.attackHero(hero);
    }
}
