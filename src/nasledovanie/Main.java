package nasledovanie;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первого юнита");
        BattleUnit  unit1 = BattleUnit.getBattleUnit(scanner.nextLine());

        System.out.println("Введите второго юнита");
        BattleUnit unit2 = BattleUnit.getBattleUnit(scanner.nextLine());

        unit1.attack(unit2);
    }
}
