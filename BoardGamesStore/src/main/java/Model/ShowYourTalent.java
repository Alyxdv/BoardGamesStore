package Model;

import Main.CustomDice;

public class ShowYourTalent extends FamilyGame{
    public ShowYourTalent() {
        super(CustomDice.RED);
    }

    @Override
    public double getPrice() {
        return 499.99;
    }

    @Override
    public String getPrefix() {
        return "ST001";
    }

    @Override
    public int getStart() {
        return 23987;
    }
}
