package Model;

import Main.CustomDice;

public class SpaceRunners extends StrategicGame{
    public SpaceRunners() {
        super(CustomDice.BLACK);
    }

    @Override
    public double getPrice() {
        return 199.99;
    }

    @Override
    public String getPrefix() {
        return "SR200";
    }

    @Override
    public int getStart() {
        return 98384;
    }
}
