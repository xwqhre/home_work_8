package kg.geektech.game.players;

import kg.geeknech.game.RPG_Game;

public class Warrior extends Hero  {
            Boss boss;
            public Warrior(int health, int damage, String name) {
                super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
            }

            @Override
            public int applySuperPower(Boss boss, Hero[] heroes) {
                int attack = RPG_Game.random.nextInt(3)+1;
                boss.setHealth(boss.getHealth() - attack * this.getDamage());
                System.out.println("Warrior applied super ability " + attack * this.getDamage()); // умножил урон.

                return attack;
            }
        }

