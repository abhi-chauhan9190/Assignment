import java.util.Random;

public class MagicalArena {

    public static void main(String[] args) {
        
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        
        fight(playerA, playerB);
    }

    public static void fight(Player attacker, Player defender) {
        Random random = new Random();

        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            
            int attackRoll = random.nextInt(6) + 1; // Roll a 6-sided die (1-6)
            int attackDamage = attacker.getAttack() * attackRoll;
            int defenseRoll = random.nextInt(6) + 1;
            int defenseStrength = defender.getStrength() * defenseRoll;

            int damageDealt = Math.max(0, attackDamage - defenseStrength);
            defender.setHealth(defender.getHealth() - damageDealt);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damageDealt + " damage (" + attacker.getName() + " roll: " + attackRoll + ", " + defender.getName() + " roll: " + defenseRoll + ")");

           
            if (defender.getHealth() <= 0) {
                System.out.println(attacker.getName() + " Wins!");
                break;
            }

            
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}
