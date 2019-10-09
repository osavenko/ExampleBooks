package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Заполняем список начальными значениями
        List<Book> list = startList();
        //Считываем строку поиска
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        //Фильтруем
        list.stream()
                .filter(book -> book.getGanre().toLowerCase().equals(search.toLowerCase()))
                .forEach(System.out::println);
    }

    public static List<Book> startList(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(14,"","анти-утопия"));
        list.add(new Book(143, "Робинзон Крузо","приключения"));
        list.add(new Book(324, "Справочник транзистор", "справочник"));
        list.add(new Book(344, "Преступление и наказание", "роман"));
        list.add(new Book(145, "Кайдашева сім`я", "повесть"));

        return list;
    }
}
