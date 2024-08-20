package hero;

import enemy.Enemy;

public class Archer extends Hero {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(this.damage / 2, this.damage / 2);
        System.out.printf("Лучник %s атакует противника \n", this.name);
    }
}
