package com.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FileData> listOfFilesOne = new ArrayList<>();

        FileData filesOne = new FileData("folder one", 3445667, "/path/to/file");
        listOfFilesOne.add(filesOne);

        FileNavigator.getDirectory().put(filesOne.getPathToFile(), listOfFilesOne);

        FileData filesTwo = new FileData("folder two", 9817409, "/path/to/file");
        // Виклик методу add у класі FileNavigator. Цей метод додає файл за вказаним шляхом. Якщо шлях вже існує, новий файл необхідно додати до списку, вже пов'язаному з відповідним шляхом. ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.
        FileNavigator.add(filesTwo);

        FileData filesThree = new FileData("folder three", 1191391, "/path/not/file");
        // Виклик методу add у класі FileNavigator. Цей метод додає файл за вказаним шляхом. Якщо шлях вже існує, новий файл необхідно додати до списку, вже пов'язаному з відповідним шляхом. ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.
        FileNavigator.add(filesThree);

        System.out.println(FileNavigator.getDirectory());

        // Виклик методу find у класі FileNavigator. Метод повертає список файлів, пов'язаних з шляхом переданим як параметр.
        List<FileData> filesFour = FileNavigator.find(filesOne.getPathToFile());
        System.out.println(filesFour);

        // Виклик методу FileNavigator. Метод повертає список файлів, розмір (в байтах) яких не перевищує значення, передане як параметр.
        int parameter = 2545678;
        List<FileData> filesFive = FileNavigator.filterBySize(parameter);
        System.out.println(filesFive);

        // Виклик методу remove у класі FileNavigator. Метод видаляє шлях і пов'язані з ним файли, виходячи з значення шляху, переданого як параметр.
        FileNavigator.remove(filesThree.getPathToFile());
        System.out.println(FileNavigator.getDirectory());

        // Виклик методу ortBySize у класі FileNavigator. Метод сортує всі наявні файли за розміром (за зростанням), потім повертає список відсортованих файлів
        List<FileData> filesSix = FileNavigator.sortBySize();
        System.out.println(filesSix);

        String falseKey = "/path/oto/file";
        FileData filesSeven = new FileData("folder seven", 4298104, "/path/to/file");
        // Виклик перевантаженого методу add у класі FileNavigator. Не дозволяти додавати значення і повідомити про це в консолі, при спробі додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
        // Виклик перевантаженого методу add з помилковим ключем
        FileNavigator.add(filesSeven, falseKey);

        String trueKey = "/path/to/file";
        FileData filesEight = new FileData("folder eight", 9087100, "/path/to/file");
        // Виклик перевантаженого методу add у класі FileNavigator. Не дозволяти додавати значення і повідомити про це в консолі, при спробі додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
        // Виклик перевантаженого методу add з вірним ключем
        FileNavigator.add(filesEight, trueKey);
        System.out.println(FileNavigator.getDirectory());
    }
}
