package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public abstract class FamilyGame extends BoardGame{
    public FamilyGame(CustomDice color, SideChangeEnum sides) {
        super(color, sides);
    }

    @Override
    public double getExpansionAmount() {
        return 0;
    }

    @Override
    public String getExpansionName() {
        return null;
    }
}
