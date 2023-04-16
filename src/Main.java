public class Main {
    public static void main(String[] args) {

        Team<Archer> archersTeam = new Team<>();
        Team<Thief> thievesTeam = new Team<>();
        Team<Knight> knightsTeam = new Team<>();

        archersTeam.addPers(new Archer("Робин", 100, new Bow(20), new LightShield(true)))
                .addPers(new Archer("Гуд", 100, new Bow(15), new LightShield(false)));

        thievesTeam.addPers(new Thief("Джек", 150, new Knife(), new LightShield(true)))
                .addPers(new Thief("Потрошитель", 150, new Knife(), new LightShield(false)));

        knightsTeam.addPers(new Knight("Айвенго", 150, new Sword(), new HeavyShield(true)))
                .addPers(new Knight("Семен", 120, new Sword(), new HeavyShield(true)));


        System.out.println(archersTeam);
        System.out.println();
        System.out.println(thievesTeam);
        System.out.println();
        System.out.println(knightsTeam);
        System.out.println();

        Archer robin = new Archer("Робин", 50, new Bow(20), new LightShield(true));
        Archer gud = new Archer("Гуд", 50, new Bow(50), new LightShield(false));
        Battle fight = new Battle(robin,gud);
        fight.battleRun();
    }
}