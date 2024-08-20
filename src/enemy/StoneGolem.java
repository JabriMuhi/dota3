package enemy;

public class StoneGolem extends Enemy{
    public StoneGolem(int health, int armour, int magicalResistance) {
        super(health, armour, magicalResistance);
    }

    @Override
    public void takeDamage(int physicalDamage, int magicalDamage) {
        if (Math.random() <= 0.5){
            physicalDamage = physicalDamage / 2;
        }
        super.takeDamage(physicalDamage, magicalDamage);
    }
}
