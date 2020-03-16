package ru.vitalo.base.lesson6;

public class Main {
        // Объекты
        // Все программф строятся из взаимодействия объектов
            // Библиотека:
            // можно добавлять книги по 1-ой или несколько сразу
            // можно взять книгу (указав автора) домой /для чтения в библиотеке
                // книги:
                // для каждой книги нужно указвать название:
                // количество страниц
                // автор (имя, фамилия)
                // можно ли брать домой
                // доступна ли для выдачи
        public static void main(String[] args) {
            Author author1 = new Author(); // вызов конструктора
  //          author1.name = "Брюс"; // записали имя
  //          System.out.println(author1.name); // прочитали имя

            // вызов метода
            author1.setName("Брюс");
            author1.setSurname("Экель");
            System.out.println(author1.getName());

            Author author2 = new Author();
    //        author2.name = "Роберт";
    //        System.out.println(author2.name);
            author2.setName("Роберт");
            author2.setSurname("Мартин");
            System.out.println(author2.getName());
            System.out.println(author2);



            Book book1 = new Book("Философия Java"); // Если мы в классе указали конструкторе с параметрами,
            // без параметров уже недоступно
            //ВСе инструкции которые нужно выполнить в момент создания объекта, описываются в конструкторе
            System.out.println(book1);
            book1.setPageCount(1350);
            book1.setAuthor(author1);
            book1.setForHome(true);
            System.out.println(book1);

            Book book2 = new Book("Чистый код", 500);
            System.out.println(book2);
            book1.setAuthor(author2);
            System.out.println(book2);

            String book1AuthorName = book1.getAuthor().getName();
            System.out.println(book1AuthorName);


            Book[] books = {book1, book2};
            //перебираем массив и выводим фамилию автора
            for (Book book: books){ // for each
                System.out.println(book.getAuthor().getSurname());
                }
            for (int i = 0; i < books.length; i++) { // тоже самое только fori
                System.out.println(books[i].getAuthor().getSurname());

            }

            Library l = new Library();

    }
}


