package hero;

import enemy.Enemy;

public abstract class Hero {
    String name;
    int damage;

    public Hero (String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
