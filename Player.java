import java.util.Random;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    Random random = new Random();

    public Player(String name) {
        this.name = name;
    }

    public void setattributes(int maxhealth , int maxstrength , int maxattack){
          getRandomHealth(20, maxhealth);
          getRandomStrength(5, maxstrength);
          getRandomAttack(10, maxattack);
    }

    public void getRandomHealth(int min, int max) {
        
        this.health = random.nextInt(max - min + 1) + min;
    }

    public void getRandomStrength(int min, int max) {
        
        this.strength = random.nextInt(max - min + 1) + min;
    }

    public void getRandomAttack(int min, int max) {
        
        this.attack = random.nextInt(max - min + 1) + min;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
}
