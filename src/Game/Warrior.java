package Game;

public class Warrior {
    public int HP;
    public String name;
    public Weapon weapon;

    public Warrior(String name, int HP, Weapon weapon) {
        this.name = name;
        this.HP = HP;
        this.weapon = weapon;
    }

    public Actions Atack(Warrior warrior) {
        if(warrior.HP - this.weapon.damage <= 0) {
            return Actions.KILLED;
        } else  {
            warrior.HP = warrior.HP - this.weapon.damage;
            return Actions.NOTKILLED;
        }
    }

    @Override
    public String toString() {
        return "Warrior with name " + name + " " +
                "with HP: " + HP + " " +
                "with weapon: " + weapon + "\n";
    }
}
