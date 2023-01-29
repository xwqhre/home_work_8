package kg.geektech.game.players;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        int attac = RPG_Game.random.nextInt(4) + 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i] && boss.getDefence() != SuperAbility.BOOST) {
                heroes[i].setDamage(heroes[i].getDamage() + attac);
            }
        }
        System.out.println("Magic working " + attac);
        return attac;
    }
}
