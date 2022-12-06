package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public class PiratesOcean extends StrategicGame{

    public PiratesOcean() {
        super(CustomDice.CHROME, SideChangeEnum.SIX);
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
