package ru.vitalo.base.lesson6;
// Объекты
// Все программф строятся из взаимодействия объектов
// Библиотека:
// можно добавлять книги по 1-ой или несколько сразу
// можно взять книгу (указав автора) домой /для чтения в библиотеке
// книги:
// для каждой книги нужно указв название:
// количество страниц
// автор (имя, фамилия)
// можно ли брать домой
// доступна ли для выдачи

public class Book {
    private String title; //По умолчанию, если не задали ничего, то будет null
    private int pageCount; //По умолчанию, если не задали ничего, то будет 0
    private Author author; //По умолчанию, если не задали ничего, то будет null
    private boolean isForHome; //По умолчанию, если не задали ничего, то будет false
    private boolean isInLibrary; //По умолчанию, если не задали ничего, то будет false

    public Book(){} // это по умолчанию, если нам он необходим то можно его написать иначе не нужно

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isForHome() {
        return isForHome;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }

    public void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", isForHome=" + isForHome +
                ", isInLibrary=" + isInLibrary +
                '}';
    }
}
