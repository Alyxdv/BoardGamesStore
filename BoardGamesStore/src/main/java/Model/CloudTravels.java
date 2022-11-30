package Model;

import Main.CustomDice;

public class CloudTravels extends RolePlayGame{
    public CloudTravels() {
        super(CustomDice.BLUE);
    }

    @Override
    public double getPrice() {
        return 499.99;
    }

    @Override
    public String getPrefix() {
        return "CT987";
    }

    @Override
    public int getStart() {
        return 487300;
    }
}
