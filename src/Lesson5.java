import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        //Строки - ссылочный тип данных
        // Строки до 9 Java
        char charVar = 'e';
        String someStr = "jjd";

        char[] chars ={'j', 'j', 'd'};
        //Строки хранятся как массив
        // в кодировке UTF -16
        // Каждый символ занимает 2 байта

        //Строки (компактные строки)) с Java 9
        //строки хранятся как массив byte[]
        // UTF -16
        // LTIN -1

        //Строки создаются разными способами например
        String string = "some string";// варинат 1, это вариант наиболее предполчтительнее
        String string4 = "some string";

        String string2 = new String("some string");
        String string3 = new String("some string");

        // Сравнение строк
        System.out.println(string == string4);
        System.out.println(string2 == string3); //не предпочитаемый метод сранения

        System.out.println(string2.equals(string3)); //предпочитаемый способ сравнения, посимвольное сравнение строк, сравнивает изначально длины

        String newString = new String("new");
        String newString2 = newString.intern(); //Метод интерн. Помещает срочку в пул строк, и если там такая строка есть то он возвращается ссылка ссылку

        System.out.println(string2 == string3);
        System.out.println(string2.intern() == string3.intern());

        //Строчик в языке не менятся, любые модификации со строкой создают новую строчку
        //Строки неизмененны и потокобезопасны

        //Конкатенация строк(склеивание)
        String str1 = "строка 1";
        String str2 = "строка 2";
        String str3 = "строка 3";

        str1 = str1 + str2; // Первый варивант кокантинации строк
        System.out.println(str1);

        str2 = str2.concat(str3) //каждый плюсик и метод concat это созхдание новой строки
                .concat("Hello")
                .concat("STR");
        System.out.println(str2);
        System.out.println("SomeData"); //строчка все равно попадает в Пул строк

        str3 = String.join(" :: ", str1, str2, str3); //объединяет несколько строк через разделитель
        System.out.println(str3);

        str1 = "Строка ";
        for (int i = 0; i < 10; i++) {
            str1 += " итерация " + i;
        }
        System.out.println(str1);

        //не ииспользовании большого склеивания используется
        // возможность изменять строки дают объекты
        //Они дают возможность измения самого объекта (строоки)
        //StringBuilder работает быстрее, но его нельзя использоватиь в много поточных средах
        //StringBuffer потокобезопасен но при этом медленнее работает

        str1 = "Строка ";
        //StringBuilder sb = new StringBuilder(str1);
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("Hello"); // Здесь не происходит склейка строк, здесь в объект SB добоваляются два объекта

        for (int i = 0; i < 10; i++) {
            sb.append( " итерация ").append(i);
        }
        str1 = sb.toString(); // метод tostring превратил объект sb в string
        System.out.println(str1);

        char[] charsArr = {'q', 'w', 'e'}; //создали массив с последовательностью q w e
        String charStr = new String(charsArr); //создали из масиива строчку

        byte[] bytes = charStr.getBytes();// getByte создает массив байтов из строчек
        //Любую строчку мы можем представить как последовательность Byte
        //Из последовательности Byte мы можем собрать строчку также как из масива char
        // в обоих случаях мы можем пеердавть кодировку
        charStr = new String(bytes);

        //Методы работы по строкам
        //сравнение
        str1 = "Java";
        str2 = "java";

        System.out.println(str1.equals(str2)); // Сравнивает с учетом регистра. True/False
        System.out.println(str1.equalsIgnoreCase(str2)); //Сравнимвает без учета регистра True/False

        System.out.println(str1.compareTo(str2)); // сравнивает на положительное отрицательное или ноль, с учетом регистра
        System.out.println(str1.compareToIgnoreCase(str2)); // сравнивает на положительное отрицательное или ноль, без учета регистра, 0 это когда они равны

        System.out.println(str1.startsWith("Ja")); //Учитывается регистр, проверяет начало, True/False
        System.out.println(str1.startsWith("A")); //Учитывается регистр, проверяет окончание True/False

        str1 = str1.toLowerCase(); //Преведение к нижнему регистру
        System.out.println(str1);
        str1 = str1.toUpperCase(); // приведение к верхнему регистру
        System.out.println(str1);


        str1 = "       Строка Строка    ";
        System.out.println(str1);
        System.out.println(str1.length()); // определяют длину строки или массива
        System.out.println(str1.trim().length()); // метод убирает пробелы в начале и в конце, промежуточные остаются

        str1 = "Java";
        System.out.println(str1.replace("a", "AA")); // метод замены, сначала указываем что хотим поменять, потом на что

        str1 = "Java Junior";
        String[] strings = str1.split("\\s"); //берет строчку и разбивает по указанному разделителю, и получается массив
        System.out.println(Arrays.toString(strings));

        //

        //TODO Посмотреть
    }
}
