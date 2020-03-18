package nasledovanie;

public interface CanRest {
    void rest();
    // если мы хотимм описать метод с реализацией, то это называется дфолтный defoult метод, начиная с 8 вресии
    // если класс реализцует метод из двух интерфейсов
    default void runFromField(){
        System.out.println("runFromField CanRest");
    }
}
