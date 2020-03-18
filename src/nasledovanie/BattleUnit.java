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
}
