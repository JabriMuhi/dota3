package enemy;

import global.Mortal;
import hero.Hero;

public abstract class Enemy implements Mortal {
    private int health;
    int armour;
    int magicalResistance;
    int damage;
    private final int maxHealth;

    public Enemy(int health, int armour, int magicalResistance, int damage) {
        this.health = health;
        this.armour = armour;
        this.magicalResistance = magicalResistance;
        this.damage = damage;
        this.maxHealth = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean mayBeExecuted() {
        int percent = this.maxHealth / 100;
        return this.health / percent <= 30;
    }

    public abstract void takeDamage(int physicalDamage, int magicalDamage, Hero hero);

    public void attackHero(Hero hero) {
        if (!this.isAlive()) {
            System.out.printf("Враг %s мёртв \n", this.getClass().getSimpleName());
        } else if (!hero.isAlive()) {
            System.out.printf("Герой %s мёртв... \n", hero.getName());
        } else if (hero.isAlive() && this.isAlive()) {
            hero.takeDamage(this.damage);
            System.out.printf("Враг %s атакует героя %s \n", this.getClass().getSimpleName(), hero.getName());
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
