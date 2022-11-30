package Model;

import Main.CustomDice;

public abstract class FamilyGame extends BoardGame{
    public FamilyGame(CustomDice color) {
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
