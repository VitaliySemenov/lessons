package nasledovanie;

abstract public class BattleUnit //abstract класс на его основе мы не можем создать объекты, у них могут быть методы как с реализацией
                        // так и без нее.
        extends Unit  //extend - наследуем от Unit. Множественное наследование классов запрещено, только от одного класса
        implements CanAttack{ // BattleUnit имплементирует CanAttack. класс заключает контракт на реализацию всех методов интерфейса
    // имплетацию нескольких методов допускается через запятую
    protected int attackScore;

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed); // super - вызов конструктора родительского класса
        setAttackScore(attackScore); // так как нету в родительском класе
    }

    public int getAttackScore() {
        return attackScore;

    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }


    @Override
    public void runFromField() {
        System.out.println("runFromField CanAttack");
    }

    // knight / doctor / infantry
    public static BattleUnit getBattleUnit(String type) {
        BattleUnit battleUnit = null;

        if ("knight".equals(type)) {
            //int healthScore от 2-12,
            // int speed, 1-8
            // int attackScore 1-9,
            // int horseSpeed 3-16
            battleUnit = new Knight(
                    (int) Math.random() * 10 + 2, (int) Math.random() * 7 + 1, (int) Math.random() * 8 + 1, (int) Math.random() * 13 + 3);
        } else if ("doctor".equals(type)) {
            battleUnit = new Doctor(
                    (int) Math.random() * 10 + 2,(int) Math.random() * 7 + 1, (int) Math.random() * 8 + 1,(int) Math.random() * 13 + 3);
        } else if ("infantry".equals(type)) {
            battleUnit = new Infantry(
                    (int) Math.random() * 10 + 2, (int) Math.random() * 7 + 1, (int) Math.random() * 8 + 1, (int) Math.random() * 13 + 3);

        }

        return battleUnit;
    }

}

