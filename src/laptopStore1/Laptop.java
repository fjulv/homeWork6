package laptopStore1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laptop {

    private String brand;
    private String model;
    private int ram;
    private int hardDisk;
    private String os;
    private double screenDiagonal;
    private String color;
    private int price;

    public Laptop(String brand, String model, int ram, int hardDisk, String os, double screenDiagonal, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.os = os;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.price = price;
    }

    public Laptop() {

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOs() {
        return os;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return (String.format("Brand: %s. Model: %s. RAM: %d. HardDisk: %d. OS: %s. Screen Diagonal: %f. Color: %s. Price: %d",
                brand, model, ram, hardDisk, os, screenDiagonal, color, price)).toString();
    }

    public boolean isMatchBrand(String inBrand) {
        return findString(brand, inBrand);
    }

    public boolean isMatchModel(String inModel) {
        return findString(model, inModel);
    }

    public boolean findRam(int minRam) {
        return ram >= minRam;
    }

    public boolean findHardDisk(int minVol) {
        return hardDisk >= minVol;
    }

    public boolean whichOS(String inOS) {
        return findString(os, inOS);
    }

    public boolean findScreenD(int inScreenD) {
        return screenDiagonal >= inScreenD;
    }

    public boolean findColor(String inColor) {
        return findString(color, inColor);
    }

    public boolean findPrice(int inMinPrice, int inMaxPrice) {
        return price >= inMinPrice && price <= inMaxPrice;
    }


    public boolean findString(String str, String inStr) {
        Pattern pattern = Pattern.compile(inStr.replace(" ", "").toLowerCase());
        Matcher matcher = pattern.matcher(str.replace(" ", "").toLowerCase());
        return matcher.find();
    }
}
