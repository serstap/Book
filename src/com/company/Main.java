package com.company;

public class Main {

    public static void main(String[] args) {
        Publish izd1 = new Publish("Проспект", "Москва" );
        Publish izd2 = new Publish("Питер", "Санкт-Петербург");
        Publish izd3 = new Publish("БХВ", "Санкт-Петебург");
        Publish izd4 = new Publish("Диалектика", "Киев");

        Book[] books = {
            new Book("Computer Science: Основы программирования на Java, ООП, алгоритмы и структуры данных ", izd2, 2018, new String[]{"Седжвик Роберт ", "Уэйн Кевин "}),
            new Book("Разработка требований к программному обеспечениия. 3-е издание, дополненное ", izd3, 2019, "Вигер Карл "),
            new Book("Java Полное руководство. 10 издание ", izd4, 2018, "Шилдт Герберт"),
            new Book("С/С++. Процедурное программирование ", izd3,2017, "Полубенцева М.И."),
            new Book( "Конституция РФ ", izd1, 2020),
        };

        Book.printAll(books);
        izd3.setTown("Санкт-Петербург");
        Book.printAll(books); //Строки поменялись из-за неправильного написания города Санкт-Петербург
    };

}



