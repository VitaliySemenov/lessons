package nasledovanie;

public interface CanAttack { // в чем отличие от класса, на основе интерфесйса нельзя создать объект
    // до 8 версии в интрефейсе могут быть только методы без реализации
    void attack(BattleUnit enemy);

    default void runFromField() {
        System.out.println("runFromField CanRest");
    }
}