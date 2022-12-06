package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public class CloudTravels extends RolePlayGame{
    public CloudTravels() {
        super(CustomDice.BLUE, SideChangeEnum.TWENTY);
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
