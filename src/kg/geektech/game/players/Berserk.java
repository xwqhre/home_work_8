package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int saveDamage;

    private Boss boss;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getDamage() != 0) {
            setBlockedDamage(RPG_Game.random.nextInt(boss.getDamage() + 1));
            if (boss.getHealth() > 0 && this.getHealth() > 0) {
                this.setHealth(boss.getHealth() - saveDamage);
                boss.setHealth(boss.getHealth() - saveDamage + this.getDamage());
                System.out.println("Berserk used super power ");
            }
        }
        return 0;
    }

    public void setBlockedDamage(int saveDamage) {
        this.saveDamage = saveDamage;
    }
}
