import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T> {
    List<T> personages = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers(T personage) {
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage : this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Максимальная дальность команды: %d", maxRange()));
        res.append(String.format("\nМаксимальный урон команды: %d", maxDamage()));
        res.append(String.format("\nМинимальная защита команды: %d", minDefence()));
        return res.toString();
    }

    public int maxRange() {
        int max = 0;
        for (T pers : this) {
            if (pers instanceof Archer) {
                Archer archer = (Archer) pers;
                if (archer.range() > max) {
                    max = archer.range();
                }
            }
        }
        return max;
    }

    public int maxDamage() {
        int max = 0;
        for (T pers : this) {
            if (pers instanceof Warrior) {
                if (((Warrior<?, ?>) pers).getWeapon().damage() > max) {
                    max = ((Warrior<?, ?>) pers).getWeapon().damage();
                }
            }
        }
        return max;
    }

    public int minDefence() {
        Warrior min_def_warrior = (Warrior) personages.get(0);
        int min = min_def_warrior.getShield().defend();
        for (T pers : this) {
            if (pers instanceof Warrior) {
                if (((Warrior<?, ?>) pers).getShield().defend() < min) {
                    min = ((Warrior<?, ?>) pers).getShield().defend();
                }
            }
        }
        return min;
    }
}
