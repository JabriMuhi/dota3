package hero;

import enemy.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(this.damage, 0);
        System.out.printf("Воин %s атакует противника \n", this.name);
    }
}