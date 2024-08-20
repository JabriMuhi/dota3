package hero;

import enemy.Enemy;

public class Mage extends Hero{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(0, this.damage);
        System.out.printf("Маг %s атакует противника \n", this.name);
    }
}
