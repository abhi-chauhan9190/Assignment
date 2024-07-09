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

    public void getRandomHealth(int max ,int min) {
        
        this.health = random.nextInt(max - min + 1) + min;
    }

    public void getRandomStrength(int max ,int min) {
        
        this.strength = random.nextInt(max - min + 1) + min;
    }

    public void getRandomAttack(int max ,int min) {
        
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
