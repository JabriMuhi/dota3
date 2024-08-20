package hero;

import enemy.Enemy;
import global.Mortal;

public abstract class Hero implements Mortal {
    protected String name;
    int damage;
    private int health;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public abstract void attackEnemy(Enemy enemy);


    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
