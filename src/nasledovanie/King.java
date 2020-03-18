package nasledovanie;

public class King extends Unit {
    private int gold;

    public King(int healthScore, int speed) {
        super(healthScore, speed);
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public void rest() {
        System.out.println("Король на отдыхе");

    }
}

