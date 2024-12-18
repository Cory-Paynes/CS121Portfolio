package weekTen.labTen;

public abstract class Character {
    public static final int max_health = 100;
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = Math.min(health, max_health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, max_health)); // Ensure health is within bounds
    }

    public boolean isAlive(int health) {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void attack();
}
