package Game;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Game {
    public void Start() {
        Warrior firstWarrior = InitWarrior();
        Warrior secondWarrior = InitWarrior();

        System.out.println(firstWarrior);
        System.out.println(secondWarrior);

        boolean shouldAtackFirstWarrior = true;

        while (true) {
            AtackResult result;
            if(shouldAtackFirstWarrior) {
                result = firstWarrior.Atack(secondWarrior);

                if(result == AtackResult.Killed) {
                    System.out.println("First warrior killed second warrior");
                    break;
                }

                shouldAtackFirstWarrior = false;
            } else {
                result = secondWarrior.Atack(firstWarrior);

                if(result == AtackResult.Killed) {
                    System.out.println("Second warrior killed first warrior");
                    break;
                }

                shouldAtackFirstWarrior = true;
            }
        }
    }

    private Warrior InitWarrior() {
        return  new Warrior(GetRandomWarriorName(),1000, GetRandomWeapon());
    }

    private Weapon GetRandomWeapon() {
        List<Weapon> weapons = new ArrayList<>();

        weapons.add(new Weapon("Huge Bowl", WeaponType.Bowl, 75));
        weapons.add(new Weapon("Large sward", WeaponType.Sward, 100));
        weapons.add(new Weapon("Small spear", WeaponType.Spear, 25));
        weapons.add(new Weapon("Large spear", WeaponType.Spear, 105));
        weapons.add(new Weapon("AK 41", WeaponType.GUN, 700));

        return weapons.get(new Random().nextInt(weapons.size()));
    }

    private String GetRandomWarriorName() {
        String[] names = new String[] {
                "Oleg", "Evan", "John", "Jack", "Ultimate soldier"
        };

        int rnd = new Random().nextInt(names.length);

        return names[rnd];
    }
}

