package Model;

public abstract class ExpansionPack extends BoardGame{
    protected BoardGame gameWithExpansion;

    public ExpansionPack(BoardGame game) {
        super(game.getColor(), game.getSides());
        gameWithExpansion = game;
    }

    public abstract String getExpansionName();
    public abstract double getExpansionAmount();

    @Override
    public String getModel() {
        return gameWithExpansion.getModel();
    }

    @Override
    public String toString() {
        String price = String.format("%24s", "$" + getPrice());
        return "  " + gameWithExpansion.getClass().getSimpleName() + price;
    }
}