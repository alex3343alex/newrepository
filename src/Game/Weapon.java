package Game;

public class Weapon {
    public int damage;
    public  String name;
    public WeaponType weaponType;

    public Weapon(String name, WeaponType weaponType, int damage) {
        this.name = name;
        this.weaponType = weaponType;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + "( " +
                "damage: " + damage + " " +
                "weaponType: " + weaponType + " )";
    }
}
