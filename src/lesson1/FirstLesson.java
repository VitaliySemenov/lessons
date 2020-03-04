package lesson1;

import java.util.Scanner;

public class FirstLesson {
    //    ctrl + / - комментарий
/* ctrl + Shift + / - многострочный
   комментарий */
//  psvm точка входа в приложение
    public static void main(String[] args) {
//  Типы данных:
//1. Примитивные типы данных
//2. Ссылочные типы данных

        //1. Примитивные типы данных
//        byte  - 1 байт, от -128 до +127
        byte byteVar; // объявление переменной
        byte byteVar1, byteVar2;
        byte byteVar3 = 35; // объявление переменной и присваивание значения
        byte byteVar4 = 20, byteVar5 = 17;
        byteVar = 10; // присваивание  значения
        byteVar = 12;

//        short - 2 байта от -32768 до +32767
        short shortVar1 = 300;
        short shortVar2 = 200;
//        short shortVar3 = shortVar1 + shortVar2;
        int shortVar3 = shortVar1 + shortVar2;

//        int - 4 байта
        int intVar1 = 1000;
        int intVar2 = 2_000_000;
//        int zeroDivision = intVar1 / 0;

//        long - 8 байт
//        long longVar = 30000000000;  запись воспринимается как int,
        // поэтому следует использовать запись вида:
        long longVar = 30000000000L;

//        float - 4 байта
        float floatVar = 5.7f;
        float floatVar1 = floatVar / 0;
        // sout
        System.out.println(floatVar1); // Infinity

//        double - 8 байт
        double doubleVar = -3.12;
        double doubleVar1 = doubleVar / 0;
        System.out.println(doubleVar1); // -Infinity

        // TODO:
        // FIXME:

        // char - 2 байта
        // хранит номер символа в таблице Unicode (кодировка UTF-16)
        // от 0 до 65536

        // boolean true / false
        boolean isActive = true;
        boolean isClosed = false;

        // приведение типов:
        // 1. автоматическое приведение типов
        byte someByte = 10;
        int someInt = someByte;

        // 2. явное приведение типов
        someInt = 100;
        someByte = (byte) someInt;

        // операторы
        // операторы присваивания
        // = | += | -= | *= | /= | %=
        int a = 10;
        a += 7; // a = a + 7;

        // арифметические операторы
        // + | - | * | / | % - взятие остатка от деления
        // 7 % 2 = 1
        // 7 / 2 = 3

        a = 12;
        int b = 7;

        int c = a / b;
        System.out.println(c);
        double c1 = a / b;
        System.out.println(c1);

        // операторы сравнения
        // результат работы операторов сравнения - true / false
        // > | < | >= | <= | != (неравенство) | == (равенство)
        /*8 > 10 false
        18 < 10 false
        8 >= 8 true
        6 != 0 true
        15 == 15 true    */

        // инкремент (увеличивает на 1)
        // i++ (постфиксная форма) ++i (префиксная форма)
        // декремент (уменьшает на 1)
        // i-- (постфиксная форма) --i (префиксная форма)
        a = 2;
        int aRes = a++ - ++a + a++ + a++ + a;
        System.out.println(aRes);

        // Консольный вывод
        System.out.println("выводимая информация");
        // souf
        System.out.printf("Форматированный вывод %s \n", "данных");
        // %f для вывода чисел с плавающей точкой
        // %d для вывода целых чисел
        // %s для вывода строк

        // Консольный ввод
        Scanner in = new Scanner(System.in); // Alt + Enter
        System.out.println("Введите число");
        int num = in.nextInt();
        int num2 = in.nextInt();
        System.out.printf("Вы ввели %d, %d", num, num2);
//        System.out.println(num);

        // логические операторы
        // применяются к boolean переменным или выражениям

        // && И
        // || ИЛИ
        // ! НЕ
        // ^ Исключающее или

        // тернарный оператор
        // переменная = (условие) ? выражение 1 : выражение 2;
        a = 2;
        b = 3;
        c = (a < b) ? a + b : a - b;
        System.out.println(c);

        // дана переменная типа int
        // четное -> / 2
        // нечетное -> * 2
        // результат вывести в консоль

        int result = (a % 2 == 0) ? a / 2 : a * 2;
        System.out.println(result);

    }
}
