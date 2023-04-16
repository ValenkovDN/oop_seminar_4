public class HeavyShield extends Shield{

    private final String name;
    public HeavyShield(Boolean hasShield) {
        super(hasShield);
        this.name = "Тяжелый щит";
    }

    @Override
    public int defend() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Оборона: %s\n\tЗащита: %d", this.name, this.defend());
    }

}
