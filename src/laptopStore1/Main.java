package laptopStore1;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
        “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Store store = new Store();

        System.out.println("Введите критерий, по которому хотите найти ноутбук.\n" +
                "1 - брэнд\n" +
                "2 - модель\n" +
                "3 - объем оперативной памяти\n" +
                "4 - объем жесткого диска\n" +
                "5 - операционная система\n" +
                "6 - диагональ экрана\n" +
                "7 - цвет корпуса\n" +
                "8 - цена");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Доступные на данный момент брэнды: ");
                store.toStringBrand();
                System.out.println("Введите брэнд, который Вас интересует");
                String brand = sc.next();
                store.searchByBrand(brand);
            }
            case 2 -> {
                System.out.println("Доступные на данный момент модели: ");
                store.toStringModel();
                System.out.println("Введите модель, которая Вас интересует");
                String model = sc.next();
                store.searchByModel(model);
            }
            case 3 -> {
                System.out.println("Введите минимальный объем оперативной памяти, который Вас интересует ");
                int ram = sc.nextInt();
                store.searchByRam(ram);
            }
            case 4 -> {
                System.out.println("Введите минимальный объем жесткого диска, который Вас интересует ");
                int hd = sc.nextInt();
                store.searchByHardDisk(hd);
            }
            case 5 -> {
                System.out.println("Доступные на данный момент операционные системы: ");
                store.toStringOS();
                System.out.println("Введите операционную систему, которая Вас интересует");
                String os = sc.next();
                store.searchByOS(os);
            }
            case 6 -> {
                System.out.println("Введите минимальную диагональ экрана, которая Вас интересует ");
                int sd = sc.nextInt();
                store.searchByScreenDiagonal(sd);
            }
            case 7 -> {
                System.out.println("Доступные на данный момент цвета корпуса: ");
                store.toStringColor();
                System.out.println("Введите цвет корпуса, который Вас интересует");
                String col = sc.next();
                store.searchByColor(col);
            }
            case 8 -> {
                System.out.println("Введите минимальную цену, которая Вас интересует: ");
                int min = sc.nextInt();
                System.out.println("Введите максимальную цену, которая Вас интересует: ");
                int max = sc.nextInt();
                store.searchByPrice(min, max);
            }
            default -> System.out.println("Введен неверный номер параметра. Повторите попытку.");
        }
    }
}
