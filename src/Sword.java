public class Sword implements IWeapon {
    @Override
    public int damage() {
        return 40;
    }

    public String toString() {
        return String.format("меч\n\tУрон: %d", this.damage());
    }

}
