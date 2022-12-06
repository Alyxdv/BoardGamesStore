package Main;

import Model.*;

import java.util.ArrayList;

public class SampleReceipt implements BoardGameInterface {
    private double total = 0.0;

    ArrayList<BoardGame> boardGameCart;
    ArrayList<AvatarTemplate> avatarCart;

    public SampleReceipt(ArrayList<BoardGame> boardGameList, ArrayList<AvatarTemplate> avatarList) {
        this.boardGameCart = boardGameList;
        this.avatarCart = avatarList;
        showTitle();
        showColumnHeader();
        showBoardGameCart();
        showAvatarCart();
        showShipping();
        //prep for sale below
        assembleComponents();
        provideTutorial();
        checkForDefects();
    }

    private void showTitle() {
        String company = String.format("%30s", "The Board Game Store");
        String address = String.format("%33s", "123 Main St, City, St, zip");
        String phone = String.format("%27s", "(000) 000 - 0000");
        System.out.println(company.toUpperCase());
        System.out.println(address);
        System.out.println(phone);
        showStars();
        String cash = String.format("%25s", "MONEY RECEIPT");
        System.out.println(cash);
        showStars();
    }

    private void showColumnHeader() {
        String price = String.format("%23s |\n", "| Price");
        System.out.print("\n| Description |");
        System.out.println(price);
    }

    private void showAvatarCart() {
        if(avatarCart.size() > 0) {
            for(AvatarTemplate avatarChoice: avatarCart) {
                System.out.print("  Avatar: " + avatarChoice.getSpecies().toString().toLowerCase()
                        +" "+ avatarChoice.getClassification().toString().toLowerCase());
                System.out.println(" with " + avatarChoice.getHairColor().toString().toLowerCase() +" hair, ");
                System.out.println("  "+ avatarChoice.getArmorColor().toString().toLowerCase() +" "+
                        avatarChoice.getArmorType().toString().toLowerCase() + " armor, and a "+
                        avatarChoice.getWeaponChoice().toString().toLowerCase());
                String price = String.format("%42s", "$" + avatarChoice.getPrice());
                System.out.print(price);
                System.out.println();
                total += avatarChoice.getPrice();
            }
        }
    }

    private void showBoardGameCart() {
        if(boardGameCart.size() > 0) {
            for(BoardGame boardGame: boardGameCart) {
                System.out.println(boardGame);
                System.out.println("  Dice Color: " + boardGame.getColor());
                System.out.println("  Dice Type: " + boardGame.getSides().toString().toLowerCase() + " sided.");
                System.out.println("  Serial #: " + boardGame.getModel());
                total += boardGame.getPrice();
                if (boardGame.getStart() == 98384 || boardGame.getStart() == 203938 ) {
                    System.out.println("Your game comes with\n: a box,\n playing surface,\n standard cards,\n " +
                            "dice,\n avatar pieces,\n a timer,\n and\n a set of instructions." );
                } else {
                    System.out.println("Your game comes with\n: a box\n, playing surface\n, standard cards\n, " +
                            "dice\n, avatar pieces\n and\n a set of instructions" );
                }
                if(boardGame.getExpansionName() != null) {
                    String customPrice = String.format("%15s", "$" + boardGame.getExpansionAmount());
                    System.out.print("  " + boardGame.getExpansionName());
                    System.out.print(customPrice);
                    total += boardGame.getExpansionAmount();
                }
                System.out.println();
            }
        }
    }

    private void showShipping() {
        double ship = 49.99;
        showStars();
        System.out.print("Sub Total");
        System.out.printf("%27s %.2f%n", "$", total);
        System.out.print("Shipping Cost");
        System.out.printf("%23s %.2f%n", "$", ship);
        System.out.print("Total");
        double totalShip = total + ship;
        System.out.printf("%30s %.2f%n", "$", totalShip);
    }

    private void showStars() {
        for(int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public void assembleComponents() {
        System.out.println("All games and Avatars come are checked\n to ensure no pieces are missing before sale.");
        System.out.println();
    }

    @Override
    public void provideTutorial() {
        System.out.println("All boardgames come with printed instructions,\n" +
                "or you can find further instruction online at" +
                "www.theboardgamestore.com\\instructions.");
        System.out.println();
    }

    @Override
    public void checkForDefects() {
        System.out.println("Every item is checked for defects before sale.");
        System.out.println();
    }

    @Override
    public String getModel() {
        return null;
    }
}
