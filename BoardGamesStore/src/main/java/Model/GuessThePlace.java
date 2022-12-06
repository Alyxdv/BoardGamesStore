package Model;

import Main.CustomDice;
import Main.SideChangeEnum;

public class GuessThePlace extends FamilyGame{

    public GuessThePlace() {
        super(CustomDice.GOLD, SideChangeEnum.SIX);
    }

    @Override
    public double getPrice() {
        return 599.99;
    }

    @Override
    public String getPrefix() {
        return "GP123";
    }

    @Override
    public int getStart() {
        return 9813;
    }
}