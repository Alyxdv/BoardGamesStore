package Model;

import Main.CustomDice;

public class CardPackExpansion extends ExpansionPack{

    public CardPackExpansion(BoardGame game) {
        super(game);
        setColor();
    }

    @Override
    public String getExpansionName() {
        return "Card Expansion Upgrade";
    }

    @Override
    public double getExpansionAmount() {
        return 49.99;
    }

    @Override
    public double getPrice() {
        return gameWithExpansion.getPrice();
    }

    @Override
    public int getStart() {
        return gameWithExpansion.getStart();
    }

    @Override
    public String getPrefix() {
        return gameWithExpansion.getPrefix();
    }

    @Override
    public CustomDice getColor() {
        return CustomDice.GOLD;
    }

    private void setColor() {
        gameWithExpansion.paintDice(CustomDice.GOLD);
    }
}
