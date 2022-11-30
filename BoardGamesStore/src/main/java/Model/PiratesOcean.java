package Model;

import Main.CustomDice;

public class PiratesOcean extends StrategicGame{

    public PiratesOcean() {
        super(CustomDice.CHROME);
    }

    @Override
    public double getPrice() {
        return 399.99;
    }

    @Override
    public String getPrefix() {
        return "PO101";
    }

    @Override
    public int getStart() {
        return 203938;
    }
}
