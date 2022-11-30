package Model;

import Main.CustomDice;

public class GuessThePlace extends FamilyGame{

    public GuessThePlace() {
        super(CustomDice.GOLD);
    }

    @Override
    public double getPrice() {
        return 599.99;
    }

    @Override
    public String getPrefix() {
        return "GP123";
    }

    @Override
    public int getStart() {
        return 9813;
    }
}