package com.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FileData> listOfFilesOne = new ArrayList<>();

        FileData filesOne = new FileData("Folder one", 3445667, "EntrySetOan");
        listOfFilesOne.add(filesOne);

        FileNavigator.getDirectory().put(filesOne.getPathToFile(), listOfFilesOne);

        FileData filesTwo = new FileData("Folder two", 9817409, "EntrySetOan");
        /*Виклик методу add у класі FileNavigator. Цей метод додає файл за вказаним шляхом. Якщо шлях вже існує, новий
        файл необхідно додати до списку, вже пов'язаному з відповідним шляхом. ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.*/
        FileNavigator.add(filesTwo);

        FileData filesThree = new FileData("Folder three", 1191391, "EntrySetTwo");
        /*Виклик методу add у класі FileNavigator. Цей метод додає файл за вказаним шляхом. Якщо шлях вже існує, новий
        файл необхідно додати до списку, вже пов'язаному з відповідним шляхом. ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.*/
        FileNavigator.add(filesThree);

        System.out.println("Результат після виклику методу add: " + FileNavigator.getDirectory() + "\n");

        // Виклик методу find у класі FileNavigator. Метод повертає список файлів, пов'язаних з шляхом переданим як параметр.
        List<FileData> filesFour = FileNavigator.find(filesOne.getPathToFile());
        System.out.println("Результат після виклику методу find: " + filesFour + "\n");

        // Виклик методу filterBySize у класі FileNavigator. Метод повертає список файлів, розмір (в байтах) яких не перевищує значення, передане як параметр.
        int parameter = 2545678;
        List<FileData> filesFive = FileNavigator.filterBySize(parameter);
        System.out.println("Результат після виклику методу filterBySize: " + filesFive + "\n");

        // Виклик методу remove у класі FileNavigator. Метод видаляє шлях і пов'язані з ним файли, виходячи з значення шляху, переданого як параметр.
        FileNavigator.remove(filesThree.getPathToFile());
        System.out.println("Результат після виклику методу remove: " + FileNavigator.getDirectory() + "\n");

        // Виклик методу sortBySize у класі FileNavigator. Метод сортує всі наявні файли за розміром (за зростанням), потім повертає список відсортованих файлів
        List<FileData> filesSix = FileNavigator.sortBySize();
        System.out.println("Результат після виклику методу ortBySiz: " + filesSix + "\n");

        String falseKey = "EntrySetThree";
        FileData filesSeven = new FileData("Folder seven", 4298104, "EntrySetOan");
        /*Виклик перевантаженого методу add у класі FileNavigator. Не дозволяти додавати значення і повідомити про це
        в консолі, при спробі додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
        Виклик перевантаженого методу add з помилковим ключем*/
        FileNavigator.add(filesSeven, falseKey);

        String trueKey = "EntrySetOan";
        FileData filesEight = new FileData("Folder eight", 9087100, "EntrySetOan");
        /*Виклик перевантаженого методу add у класі FileNavigator. Не дозволяти додавати значення і повідомити про це в
        консолі, при спробі додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
        Виклик перевантаженого методу add з вірним ключем*/
        FileNavigator.add(filesEight, trueKey);
        System.out.println("Результат після виклику перевантаженого методу add:" + FileNavigator.getDirectory());
    }
}
