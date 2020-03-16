package ru.vitalo.base.lesson6;

public class Author {
    // свойства
    // по сути это переменные которые описываютя внутри
    private String name; // privite - это модификатор доступа, который запрещает прямой доступ извне
    // Если не можем, то создает методы, которые называются септоры
    // Чтобы создала среда Alt+ins(создавание стандарнтых методов, наиболее частых
    private String surname;



    //Методы - если через свойство присваиваем значения свойтство то это сеттер
    //public - означает что мы можем обращаться к нему из любого места
    //setName - имя метода
    // String - тип данных
    // name - имя
    public void setName(String name) { // void - означает просто выполняет, ничего не возвращает
        // return можно использовать, для прекращения работы метода
        // сделаем проверку чтобы длина быфла не менее 2 символов
        if (name.length() >= 2) // && !"".equals(name) - так же проверка сходная что написана или name != null
            this.name = name;
        // this - ссылка на текущий объект

        // Пример проверки
        // String someVar;
        // someVar.equals("java"); - неправильная проверка
        // "java".equals(someVar); - правильная проверка

    }
//  Геттеры - возвращает значение свойства
    public String getName() {
        return name; // возвращает из метода какое то значение, все что после, исполняться не будет, он заканчивает работу метода
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
