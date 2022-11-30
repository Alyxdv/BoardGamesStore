package Model;

public class Avatars implements PriceInterface{

    private double price;
    private String name;

    public Avatars(String itemName, double price) {
        this.name = itemName;
        this.price = price;
    }

    public String getItemName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}