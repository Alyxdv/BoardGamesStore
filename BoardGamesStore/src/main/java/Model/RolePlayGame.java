package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public abstract class RolePlayGame extends BoardGame{

    public RolePlayGame(CustomDice color, SideChangeEnum sides) {
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
