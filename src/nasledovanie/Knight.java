package nasledovanie;

public class Knight extends BattleUnit {
    private int horseSpeed;


    public Knight(int healthScore, int speed, int attackScore, int horseSpeed) {
        super(healthScore, speed, attackScore);
    }

    public int getHorseSpeed() {
        return horseSpeed;
    }

    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    @Override
    public void attack(BattleUnit unit) {
        System.out.println("Атака рыцаря");
        }

    @Override
    public void rest() {
        System.out.println("Рыцарь на отдыхе");

    }
}

