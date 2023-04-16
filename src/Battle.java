public class Battle {
    private final Warrior attacker;
    private final Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public void battleRun() {
        while (true) {

            Warrior is_attacking = attacker;
            Warrior is_defending = defender;

            System.out.printf("\nВоин %s атакует:", is_attacking.getPersonageName());
            attack(is_attacking, is_defending);

            is_attacking = defender;
            is_defending = attacker;

            System.out.printf("\nВоин %s отвечает:", is_attacking.getPersonageName());
            attack(is_attacking, is_defending);

            if (defender.isAlive()) {
                System.out.printf("\nВоин %s погиб!\n", defender.getPersonageName());
                System.out.printf("\nПобедитель: %s", attacker);
                return;
            }

            if (attacker.isAlive()) {
                System.out.printf("\nВоин %s погиб\n", attacker.getPersonageName());
                System.out.printf("\nПобедитель: %s", defender);
                return;
            }
        }
    }

    public void attack(Warrior attacking, Warrior defending){

        int attack = attacking.harm();
        int defence = defending.shielded();

        if (attack == 0){
            System.out.printf("\n\tВоин %s промахнулся!\n", attacking.getPersonageName());
        }
        else {
            if (defence == 0) {
                defending.reduceHeelPoint(attack);
                System.out.printf("\n\tВоин %s не смог защититься!", defending.getPersonageName());
                System.out.printf("\n\tВоин %s наносит %d очков урона \n\tУ воина %s осталось %d hp\n",
                        attacking.getPersonageName(), attack, defending.getPersonageName(), defending.getHealPoint());
            } else {
                int resOfAttack = Math.max(attack - defence, 0);
                defender.reduceHeelPoint(resOfAttack);
                System.out.printf("\n\tВоин %s подставил щит и отразил %d очка урона!", defending.getPersonageName(), defence);
                System.out.printf("\n\tВоин %s наносит %d очков урона \n\tУ воина %s осталось %d hp\n",
                        attacking.getPersonageName(), resOfAttack, defending.getPersonageName(), defending.getHealPoint());
            }
        }

    }
}
