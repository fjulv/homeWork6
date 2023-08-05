package laptopStore1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    public Store() {
        laptops.add(new Laptop("Apple", "MacBook Pro", 16, 520, "MacOS", 16.0, "silver", 800000));
        laptops.add(new Laptop("Apple", "MacBook Pro", 16, 1024, "MacOS", 14.0, "silver", 650000));
        laptops.add(new Laptop("Apple", "MacBook Air", 32, 1024, "MacOs", 16.0, "silver", 440000));
        laptops.add(new Laptop("ASUS", "TUF FA507", 8, 520, "Windows", 15.5, "black", 40000));
        laptops.add(new Laptop("ASUS", "Vivobook", 16, 520, "Windows", 16.0, "silver", 65000));
        laptops.add(new Laptop("ASUS", "R565JF", 16, 520, "Windows", 15.3, "blue", 83000));
        laptops.add(new Laptop("DELL", "G15-5510", 8, 252, "Windows", 17.0, "black", 120000));
        laptops.add(new Laptop("DELL", "Inspirion 5502", 16, 520, "Linux", 17.5, "blue", 101000));
        laptops.add(new Laptop("DELL", "Inspirion 3583", 32, 1024, "Linux", 16.0, "silver", 73000));
        laptops.add(new Laptop("Lenovo", "IdeaPad L340", 8, 252, "Windows", 14.0, "black", 30000));
        laptops.add(new Laptop("Lenovo", "IdeaPad L3", 16, 520, "Linux", 17.5, "black", 49000));
        laptops.add(new Laptop("Lenovo", "IdeaPad3", 8, 520, "Linux", 19, "black", 64000));
        laptops.add(new Laptop("Acer", "Aspire 3", 8, 520, "Windows", 16.0, "silver", 35000));
        laptops.add(new Laptop("Acer", "Aspire 5", 8, 252, "Windows", 15.5, "blue", 42000));
        laptops.add(new Laptop("Acer", "Swift 5", 16, 520, "Windows", 17.3, "black", 55000));
    }

    List<Laptop> laptops = new ArrayList<>();

    @Override
    public String toString() {
        for (int i = 0; i < laptops.size(); i++) {
            System.out.println("Store{" +
                    "laptops=" + laptops.get(i) +
                    "}\n");
        }
        return "Выведен полный список ноутбуков";
    }

    public void toStringBrand() {
        List<String> brands = new ArrayList<>();
        for (int i = 0; i < laptops.size(); i++) {
            if (!brands.contains(laptops.get(i).getBrand())) {
                brands.add(laptops.get(i).getBrand());
                ;
            }
        }
        System.out.println(brands);
    }

    public void toStringColor() {
        List<String> colors = new ArrayList<>();
        for (int i = 0; i < laptops.size(); i++) {
            if (!colors.contains(laptops.get(i).getColor())) {
                colors.add(laptops.get(i).getColor());
                ;
            }
        }
        System.out.println(colors);
    }

    public void toStringOS() {
        List<String> oses = new ArrayList<>();
        for (int i = 0; i < laptops.size(); i++) {
            if (!oses.contains(laptops.get(i).getOs())) {
                oses.add(laptops.get(i).getOs());
                ;
            }
        }
        System.out.println(oses);
    }

    public void toStringModel() {
        List<String> models = new ArrayList<>();
        for (int i = 0; i < laptops.size(); i++) {
            if (!models.contains(laptops.get(i).getModel())) {
                models.add(laptops.get(i).getModel());
                ;
            }
        }
        System.out.println(models);
    }

    public void searchByBrand(String brand) {
        for (Laptop laptop : laptops) {
            if (laptop.isMatchBrand(brand)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByPrice(int minPrice, int maxPrice) {
        for (Laptop laptop : laptops) {
            if (laptop.findPrice(minPrice, maxPrice)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByColor(String color) {
        for (Laptop laptop : laptops) {
            if (laptop.findColor(color)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByScreenDiagonal(int diag) {
        for (Laptop laptop : laptops) {
            if (laptop.findScreenD(diag)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByOS(String os) {
        for (Laptop laptop : laptops) {
            if (laptop.whichOS(os)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByHardDisk(int volHD) {
        for (Laptop laptop : laptops) {
            if (laptop.findHardDisk(volHD)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByRam(int ram) {
        for (Laptop laptop : laptops) {
            if (laptop.findRam(ram)) {
                System.out.println(laptop);
            }
        }
    }

    public void searchByModel(String model) {
        for (Laptop laptop : laptops) {
            if (laptop.isMatchModel(model)) {
                System.out.println(laptop);
            }
        }
    }
}
