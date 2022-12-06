package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public abstract class BoardGame implements PriceInterface, BoardGameInterface {
    private CustomDice color;
    private SideChangeEnum sides;
    private String model;

    public BoardGame(CustomDice color, SideChangeEnum sides) {
        this.color = color;
        this.setSides(sides);
    }

    public CustomDice getColor() {
        return color;
    }

    public SideChangeEnum getSides() {
        return sides;
    }

    public abstract double getPrice();

    public abstract int getStart();

    public abstract String getPrefix();

    public abstract String getExpansionName();
    public abstract double getExpansionAmount();

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void paintDice(CustomDice color) {
        this.color = color;
    }

    public void changeSides(SideChangeEnum sides) {
        this.setSides(sides);
    }

    @Override
    public void checkForDefects() {
        System.out.println("We try to check each and every piece for any defect. If by chance you receive " +
                "a defective product, we will replace the defective products. " +
                "Just reach out through our Customer Service line.");
    }

    @Override
    public void assembleComponents() {
        System.out.println("We assemble the pieces and components prior to shipping.");
    }

    @Override
    public void provideTutorial() {
        System.out.println("We provide web links to instructional videos on how to play our Board Games.");
    }

    @Override
    public String toString() {
        String price = String.format("%24s", "$" + getPrice());
        return "  " + getClass().getSimpleName() + price;
    }

    public void setSides(SideChangeEnum sides) {
        this.sides = sides;
    }
}
