package Model;

import Main.CustomDice;

public abstract class RolePlayGame extends BoardGame{

    public RolePlayGame(CustomDice color) {
        super(color);
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
