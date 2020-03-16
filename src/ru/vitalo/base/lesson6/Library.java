package ru.vitalo.base.lesson6;


        // Объекты
        // Все программф строятся из взаимодействия объектов
        // Библиотека:
            // можно добавлять книги по 1-ой или несколько сразу
            // можно взять книгу (указав автора) домой /для чтения в библиотеке

public class Library{
    // добавление книги
    private String name = "Библиотека";
    // добавление нескольких книг
    private Book[] books = new Book[5];

    public String getName(){
        return name;
    }
    //добавление одной книги
    public void addBook(Book newBook){
       for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                newBook.setInLibrary(true);
                books[i] = newBook;
                break; //return
            }
        }
    }

    //добавление нескольких книг
    public void addBook(Book ...newBook){ //... переменное количество аргументов ... предполагает массив
    //TODO: реализация метода дома
    }
    //Метод возвращает по названиюю( нужно проверить, доступан ли для выдачи, и
    public Book getHome(String title){
        Book book = null;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null &&
            books[i].getTitle().equals(title) &&
            books[i].isForHome() &&
            books[i].isInLibrary()
            ){
                books[i].setInLibrary(false);
                book = books[i];
            }

        }
        return book;
    }

}


