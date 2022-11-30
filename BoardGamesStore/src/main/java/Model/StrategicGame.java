package Model;

import Main.CustomDice;

public abstract class StrategicGame extends BoardGame{

    public StrategicGame(CustomDice color) {
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
