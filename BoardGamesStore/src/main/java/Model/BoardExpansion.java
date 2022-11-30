package Model;

public class BoardExpansion extends ExpansionPack{

    public BoardExpansion(BoardGame game) {
        super(game);
    }

    @Override
    public String getExpansionName() {
        return "Board Expansion Upgrade";
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
}
