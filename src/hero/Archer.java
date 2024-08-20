package hero;

import enemy.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Archer(String name) {
        super(name, 15, 15);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive() && super.isAlive()){
            enemy.takeDamage(this.damage / 2, this.damage / 2, this);
            System.out.printf("Лучник %s атакует противника %s \n", this.name, enemy.getClass().getSimpleName());
        } else if (!enemy.isAlive()) {
            System.out.printf("Противник %s мёртв... \n", enemy.getClass().getSimpleName());
        } else {
            System.out.printf("Лучник %s мёртв... \n", this.name);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }
}
