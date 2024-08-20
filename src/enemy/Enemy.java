package enemy;

import global.Mortal;

public class Enemy implements Mortal {
    int health;
    int armour;
    int magicalResistance;

    public Enemy(int health, int armour, int magicalResistance){
        this.health = health;
        this.armour = armour;
        this.magicalResistance = magicalResistance;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int physicalDamage, int magicalDamage){
        this.health -= physicalDamage / this.armour;
        this.health -= magicalDamage / this.magicalResistance;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
