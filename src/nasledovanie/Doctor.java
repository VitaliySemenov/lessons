package nasledovanie;

public class Doctor extends BattleUnit{
    private int medicineScore;

    public Doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
    }


    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    public int getMedicineScore() {
        return medicineScore;
    }

    @Override //переопределяем какой то родительский метод, либо реализацию интерфейса. Без него программа тоже будет работать,
    // но это и указатель к компилятору что мы переопредялем метод, не меняем аргументы..
    public void attack(BattleUnit unit) {
        System.out.println("Атака доктора");
        unit.healthScore += attackScore + medicineScore;
        }

    @Override
    public void rest() {
        System.out.println("Доктор на отдыхе");
    }
}
