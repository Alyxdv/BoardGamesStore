package Main;

import Controller.InventoryGenerator;
import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleOrder {

    private ArrayList<BoardGame> boardGameOrder;
    private ArrayList<AvatarTemplate> avatarOrder;
    private Scanner userIn;
    private InventoryGenerator inventory;
    private BoardGame boardGameChoice;
    private AvatarTemplate boardGameExtra;

    public SampleOrder() {
        boardGameOrder = new ArrayList<>();
        avatarOrder = new ArrayList<>();
        userIn = new Scanner(System.in);
        inventory = new InventoryGenerator();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to The Board Game Store!");
        System.out.println("The place for Board Games and Avatars");
        buySomething();
    }

    private void buySomething() {
        System.out.println("What kind of Board Games would you like?");
        System.out.println("Your options are :\n1 for Avatars \n2 for a Board Game");
        String type = userIn.next();
        validateSomething(type);
    }

    private void buyBoardGame() {
        System.out.println("Are you here to buy Avatars or a Board Game or both?");
        System.out.println("Your options are : \nc - Guess The Place\n" +
                "d - Show YOur Talent\nt - Space Runners\nv - Pirates Ocean" +
                "d - Gryphons and Chimeras\nt - Cloud Travels\n");
        String type = userIn.next();
        validateBoardGameType(type);
        customDiceOffer(boardGameChoice);
        offerUpgrades();
        boardGameOrder.add(boardGameChoice);
        anotherBoardGame();
        orderDone();
    }

    private void orderDone() {
        new SampleReceipt(boardGameOrder, avatarOrder);
    }

    private void anotherBoardGame() {
        System.out.println("Do you want to add any other Board Games? yes or no");
        String answer = userIn.next();
        validateAnotherBoardGame(answer);
    }

    private void offerAvatars() {
        System.out.println("Do you want to buy any custom Avatars?");
        String answer = userIn.next();
        validateOffer(answer);
    }

    private void buyAvatars() {
        System.out.println("What Avatars are you interested in ?");
        System.out.print("Choose from the lists below to build your personalized avatar!");
        boardGameExtra = new AvatarTemplate();
        chooseSpecies();
        classificationType();
        hairColor();
        armorColor();
        weaponsChoice();
        armorType();
        avatarOrder.add(boardGameExtra);
        moreAvatars();
    }//validateAvatar(item.toLowerCase());

    private void chooseSpecies() {
        System.out.print("Would you like to build a:\n1. Human\n2. Elf\n3. Dwarf\n4. Halfling\n5. Dragonkind\n");
        String species = userIn.next();
        validateSpecies(species.toLowerCase());
    }

    private void classificationType() {
        System.out.print("What class is your avatar?");
        System.out.print("Your choices are:\n1. Fighter\n2. Rogue\n3. Mage\n4. Ranger\n5. Necromancer\n");
        String type = userIn.next();
        validateClassification(type.toLowerCase());
    }

    private void armorType() {
        System.out.println("What type of armor would you like your avatar to have?");
        System.out.println("Your choices are:\n1. Leather\n2. Chainmail\n3. Platearmor\n");
        String type = userIn.next();
        validateArmorType(type.toLowerCase());
    }

    private void weaponsChoice() {
        System.out.println("What type of weapon would you like your avatar to have?");
        System.out.println("Your choices are:\n1. Sword\n2. Staff\n3. Dagger\n" +
                "4. Bow\n5. Shield\n");
        String type = userIn.next();
        validateWeaponsChoice(type.toLowerCase());
    }

    private void armorColor() {
        System.out.println("What color armor would you like your avatar to have?");
        System.out.println("Your choices are:\n1. Blue\n2. Red\n3. Black\n" +
                "4. Green\n5. Brown\n6. Gold\n7. Orange\n8. Silver.");
        String type = userIn.next();
        validateArmorColor(type.toLowerCase());
    }

    private void hairColor() {
        System.out.println("What color hair would you like your avatar to have?");
        System.out.println("Your choices are:\n1. Blue\n2. Red\n3. Black\n" +
                "4. Green\n5. Brown\n6. Gold\n7. Orange\n8. Silver.");
        String type = userIn.next();
        validateHairColor(type.toLowerCase());
    }

    private void anotherAvatar() {
        System.out.print("Did you want to add another custom Avatar to your order? Yes or no");
        String answer = userIn.next();
        validateAnotherAvatar(answer);
    }

    private void offerUpgrades() {
        System.out.println("We offer upgrades for your Dices besides dice color.");
        System.out.println("We offer the following:\nCE - Card Expansion\nBE - Board Expansion" +
                "\nDE - Dice Side Count Changes\nnone - for no upgrades");
        String upgrade = userIn.next();
        validateUpgrade(upgrade);
    }

    private void customDiceOffer(BoardGame boardGame) {
        System.out.println("Our Dices come with a default paint color.");
        System.out.println("Your current dice color is " + boardGame.getColor().toString().toLowerCase());
        System.out.println("Would you like this dice with a different color. yes or no");
        String choice = userIn.next();
        switch (choice.toLowerCase()) {
            case "yes":
                customDiceChange(boardGame);
                break;
            case "no":
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                customDiceOffer(boardGame);
        }
    }

    private void customDiceChange(BoardGame boardGame) {
        System.out.println("What dice color would you like?");
        System.out.println("Your choices are:\nbk - black\nbl - blue\n +" +
                "ch - chrome\ngr - green\nrd - red\ngd - gold (extra charge)");
        String color = userIn.next();
        validateColorChoice(color);

    }

    private void validateColorChoice(String color) {
        switch(color) {
            case "bk":
                boardGameChoice.paintDice(CustomDice.BLACK);
                break;
            case "bl":
                boardGameChoice.paintDice(CustomDice.BLUE);
                break;
            case "ch":
                boardGameChoice.paintDice(CustomDice.CHROME);
                break;
            case "gr":
                boardGameChoice.paintDice(CustomDice.GREEN);
                break;
            case "rd":
                boardGameChoice.paintDice(CustomDice.RED);
                break;
            default:
                System.out.println("You have entered an incorrect color.");
                customDiceChange(boardGameChoice);
        }
    }

    private void moreAvatars() {
        System.out.println("Do you want to add more Avatars? yes or no");
        String val = userIn.next();

        switch (val) {
            case "yes":
                boardGameExtra = null;
                buyAvatars();
                break;
            case "no":
                orderDone();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                moreAvatars();
        }
    }

    private void validateOffer(String answer) {
        switch(answer) {
            case "yes":
                buyAvatars();
                break;
            case "no":
                break;
            default:
                System.out.println("You have entered an invalid choice");
                offerAvatars();
        }
    }

    private void validateAnotherBoardGame(String answer) {
        switch(answer.toLowerCase()) {
            case "yes":
                boardGameChoice = null;
                buyBoardGame();
                break;
            case "no":
                offerAvatars();
                // offer Avatars
                break;
            default:
                System.out.println("You have entered an invalid choice");
                anotherBoardGame();
        }
    }

    private void validateUpgrade(String upgrade) {
        switch (upgrade.toLowerCase()) {
            case "CE":
                boardGameChoice = new CardPackExpansion(boardGameChoice);
                break;
            case "BE":
                boardGameChoice = new BoardExpansion(boardGameChoice);
                break;
            case "DE":
                boardGameChoice = new DiceSides(boardGameChoice);
                break;
            case "none":
                break;
            default:
                System.out.println("You have made an invalid choice");
                offerUpgrades();
        }
    }

    private void validateBoardGameType(String type) {
        switch (type) {
            case "c":
                boardGameChoice = inventory.getCloudTravelsList().get(0);
                inventory.getCloudTravelsList().remove(0);
                break;
            case "d":
                boardGameChoice = inventory.getGuessThePlaceList().get(0);
                inventory.getGuessThePlaceList().remove(0);
                break;
            case "t":
                boardGameChoice = inventory.getShowYourTalentList().get(0);
                inventory.getShowYourTalentList().remove(0);
                break;
            case "v":
                boardGameChoice = inventory.getPiratesOceansList().get(0);
                inventory.getPiratesOceansList().remove(0);
                break;
            default:
                System.out.println("You have entered an incorrect type");
                buyBoardGame();
        }
    }

   /* private void validateAvatar (String choice) {
        switch (choice) {
            case "h":
                boardGameExtra = new Avatars("Helmet", 29.99);
                break;
            case "g":
                boardGameExtra = new Avatars("Gloves", 19.99);
                break;
            case "b":
                boardGameExtra = new Avatars("Bell", 9.99);
                break;
            case "bk":
                boardGameExtra = new Avatars("Basket", 29.99);
                break;
            case "t":
                boardGameExtra = new Avatars("Tire Pump", 39.99);
                break;
            case "bh":
                boardGameExtra = new Avatars("Bottle & Holder", 34.99);
                break;
            case "l":
                boardGameExtra = new Avatars("Gloves", 36.99);
                break;
            default:
                System.out.println("You have entered an invalid choice");
                buyAvatars();
        }
    }*/

    private void validateSomething(String type) {
        switch (type) {
            case "1":
                buyAvatars();
                break;
            case "2":
                buyBoardGame();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                buySomething();
        }
    }

    private void validateAnotherAvatar(String answer) {
        switch (answer.toLowerCase()){
            case "yes":
                boardGameExtra = null;
                chooseSpecies();
                break;
            case "no":
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                anotherAvatar();
        }
    }

    private void validateClassification(String type) {
        switch (type) {
            case "1":
                boardGameExtra.setClassification(AvatarClassificationEnum.FIGHTER);
                break;
            case "2":
                boardGameExtra.setClassification(AvatarClassificationEnum.ROGUE);
                break;
            case "3":
                boardGameExtra.setClassification(AvatarClassificationEnum.MAGE);
                break;
            case "4":
                boardGameExtra.setClassification(AvatarClassificationEnum.RANGER);
                break;
            case "5":
                boardGameExtra.setClassification(AvatarClassificationEnum.NECROMANCER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                classificationType();
        }
    }


    private void validateSpecies(String species) {
        switch (species) {
            case "1":
                boardGameExtra.setSpecies(AvatarSpeciesEnum.HUMAN);
                break;
            case "2":
                boardGameExtra.setSpecies(AvatarSpeciesEnum.ELF);
                break;
            case "3":
                boardGameExtra.setSpecies(AvatarSpeciesEnum.DWARF);
                break;
            case "4":
                boardGameExtra.setSpecies(AvatarSpeciesEnum.HALFLING);
                break;
            case "5":
                boardGameExtra.setSpecies(AvatarSpeciesEnum.DRAGONKIND);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                chooseSpecies();
        }
    }

    private void validateHairColor(String hair) {
        switch (hair) {
            case "1":
                boardGameExtra.setHairColor(AvatarColorEnum.BLUE);
                break;
            case "2":
                boardGameExtra.setHairColor(AvatarColorEnum.RED);
                break;
            case "3":
                boardGameExtra.setHairColor(AvatarColorEnum.BLACK);
                break;
            case "4":
                boardGameExtra.setHairColor(AvatarColorEnum.GREEN);
                break;
            case "5":
                boardGameExtra.setHairColor(AvatarColorEnum.BROWN);
                break;
            case "6":
                boardGameExtra.setHairColor(AvatarColorEnum.GOLD);
                break;
            case "7":
                boardGameExtra.setHairColor(AvatarColorEnum.ORANGE);
                break;
            case "8":
                boardGameExtra.setHairColor(AvatarColorEnum.SILVER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                hairColor();
        }
    }

    private void validateArmorColor(String armorColor) {
        switch (armorColor) {
            case "1":
                boardGameExtra.setArmorColor(AvatarColorEnum.BLUE);
                break;
            case "2":
                boardGameExtra.setArmorColor(AvatarColorEnum.RED);
                break;
            case "3":
                boardGameExtra.setArmorColor(AvatarColorEnum.BLACK);
                break;
            case "4":
                boardGameExtra.setArmorColor(AvatarColorEnum.GREEN);
                break;
            case "5":
                boardGameExtra.setArmorColor(AvatarColorEnum.BROWN);
                break;
            case "6":
                boardGameExtra.setArmorColor(AvatarColorEnum.GOLD);
                break;
            case "7":
                boardGameExtra.setArmorColor(AvatarColorEnum.ORANGE);
                break;
            case "8":
                boardGameExtra.setArmorColor(AvatarColorEnum.SILVER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                armorColor();
        }
    }

    private void validateWeaponsChoice(String weaponsChoice) {
        switch (weaponsChoice) {
            case "1":
                boardGameExtra.setWeaponChoice(AvatarWeaponsEnum.SWORD);
                break;
            case "2":
                boardGameExtra.setWeaponChoice(AvatarWeaponsEnum.STAFF);
                break;
            case "3":
                boardGameExtra.setWeaponChoice(AvatarWeaponsEnum.DAGGER);
                break;
            case "4":
                boardGameExtra.setWeaponChoice(AvatarWeaponsEnum.BOW);
                break;
            case "5":
                boardGameExtra.setWeaponChoice(AvatarWeaponsEnum.SHIELD);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                weaponsChoice();
        }
    }

    private void validateArmorType(String armorType) {
        switch (armorType) {
            case "1":
                boardGameExtra.setArmorType(AvatarArmorTypeEnum.LEATHER);
                break;
            case "2":
                boardGameExtra.setArmorType(AvatarArmorTypeEnum.CHAINMAIL);
                break;
            case "3":
                boardGameExtra.setArmorType(AvatarArmorTypeEnum.PLATE);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                armorType();
        }
    }
}
