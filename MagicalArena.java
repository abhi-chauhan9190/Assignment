import java.util.Random;

public class MagicalArena {

    public String getReady(int maxhealth , int maxstrength , int maxattack) {

        String winner;
        
        // Making two objects of player class each representing each player
        Player playerA = new Player("A");
        Player playerB = new Player("B");



        System.out.println("Player A info:%n");
        System.out.printf("Health: %d, Attack: %d, Strength: %d%n",
                playerA.getHealth(), playerA.getAttack(), playerA.getStrength());

        
        System.out.println("Player B info:%n");
        System.out.printf("Health: %d, Attack: %d, Strength: %d%n",
                playerB.getHealth(), playerB.getAttack(), playerB.getStrength());

        winner = fight(playerA, playerB);

        return winner;
    }

    public String fight(Player attacker, Player defender) {
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
                return attacker.getName();
                
            }

            try {
            Thread.sleep(1000);
            }   
            catch (InterruptedException e) {
            e.printStackTrace();
            }
            
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}
