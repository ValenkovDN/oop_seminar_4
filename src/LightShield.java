public class LightShield extends Shield {

    private final String name;
    public LightShield(Boolean hasShield) {
        super(hasShield);
        this.name = "Легкий щит";
    }

    @Override
    public int defend() {
        return 10;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("Оборона: %s\n\tЗащита: %d", this.name, this.defend());
    }
}
