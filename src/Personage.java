public abstract class Personage {
    private final String personageName;
    private int healPoint;

    public Personage(String name, int healPoint) {
        this.personageName = name;
        this.healPoint = healPoint;
    }

    public boolean isAlive() {
        return healPoint <= 0;
    }

    public String getPersonageName() {
        return personageName;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void reduceHeelPoint(int damage) {
        this.healPoint -= damage;
        if (this.healPoint < 0) {
            this.healPoint = 0;
        }
    }
}
