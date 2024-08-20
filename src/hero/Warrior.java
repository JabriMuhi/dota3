package hero;

import enemy.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Warrior(String name){
        super(name, 25, 5);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (enemy.isAlive() && super.isAlive()){
            if (enemy.mayBeExecuted()){ // can execute enemy on 30%hp
                enemy.setHealth(0);
                System.out.printf("Воин %s казнил противника %s \n", this.name, enemy.getClass().getSimpleName());
            } else {
                enemy.takeDamage(this.damage, 0, this);
                System.out.printf("Воин %s атакует противника %s \n", this.name, enemy.getClass().getSimpleName());
            }
        } else if (!enemy.isAlive()){
            System.out.printf("Противник %s мёртв... \n", enemy.getClass().getSimpleName());
        } else {
            System.out.printf("Воин %s мёртв... \n", this.name);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }
}