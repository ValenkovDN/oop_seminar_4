public class Bow extends Throwing {
    private final String name;

    public Bow(int range) {
        super(range);
        this.name = "лук";
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
