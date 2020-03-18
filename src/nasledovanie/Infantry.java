package nasledovanie;

public class Infantry extends BattleUnit {
    private int Infantry;

    public Infantry(int healthScore, int speed, int attackScore, int armor) {
        super(healthScore, speed, attackScore);
    }

    public int getInfantry() {
        return Infantry;
    }

    public void setInfantry(int infantry) {
        Infantry = infantry;
    }

    @Override
    public void attack(BattleUnit unit) {
        System.out.println("Пехота атака");
        unit.healthScore += healthScore;

    }

    @Override
    public void rest() {
        System.out.println("Пехота на отдыхе");

    }
}
