package hero;

import enemy.Enemy;

public class Mage extends Hero{
    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Mage(String name){
        super(name, 5, 25);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (enemy.isAlive() && super.isAlive()){
            enemy.takeDamage(0, this.damage, this);
            System.out.printf("Маг %s атакует противника %s \n", this.name, enemy.getClass().getSimpleName());
        }else if (!enemy.isAlive()){
            System.out.printf("Противник %s мёртв... \n", enemy.getClass().getSimpleName());
        } else{
            System.out.printf("Маг %s мёртв... \n", this.name);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }
}
