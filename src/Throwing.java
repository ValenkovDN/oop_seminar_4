public abstract class Throwing implements IWeapon {
    int range;

    public Throwing(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Тип: метательное\n\tУрон: %d\n\tРасстояние: %d м", damage(), getRange());
    }
}
