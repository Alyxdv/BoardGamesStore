package Controller;

import Main.*;
import Model.AvatarTemplate;

import java.util.ArrayList;
import java.util.Scanner;

public class AvatarBuilder {
    // Reference SampleOrder for validation

    private Scanner userIn;
    private AvatarTemplate avatarChoice;
    public ArrayList<AvatarTemplate> avatarOrder;

    public AvatarBuilder() { // find out where you are SUPPOSED to call this
        avatarChoice = new AvatarTemplate();
        avatarOrder = new ArrayList<>();
        userIn = new Scanner(System.in);
    }



    public void avatarBuildWelcome() {
        System.out.print("Welcome to the Avatar Builder");
        System.out.print("Choose from the lists below to build your personalized avatar!");
        chooseSpecies();
    }

    private void chooseSpecies() {
        System.out.print("Would you like to build a:\n1. Human\n2. Elf\n3. Dwarf\n4. Halfling\n5. Dragonkind\n");
        String species = userIn.next();
        validateSpecies(species);
        classificationType();
    }

    private void classificationType() {
        System.out.print("What class is your avatar?");
        System.out.print("Your choices are:\n1. Fighter\n2. Rogue\n3. Mage\n4. Ranger\n5. Necromancer\n");
        String type = userIn.next();
        validateClassification(type.toLowerCase());
        hairColor();
        armorColor();
        weaponsChoice();
        armorType();
        avatarOrder.add(avatarChoice);
        anotherAvatar();
        orderDone();
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

    private void orderDone() {
        /*new SampleReceipt(avatarOrder);*/
        System.out.print(avatarOrder);
    }

    private void anotherAvatar() {
        System.out.print("Did you want to add another custom Avatar to your order? Yes or no");
        String answer = userIn.next();
        validateAnotherAvatar(answer);
    }

    private void validateAnotherAvatar(String answer) {
        switch (answer.toLowerCase()){
            case "yes":
                avatarChoice = null;
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
                avatarChoice.classification(AvatarClassificationEnum.FIGHTER);
                break;
            case "2":
                avatarChoice.classification(AvatarClassificationEnum.ROGUE);
                break;
            case "3":
                avatarChoice.classification(AvatarClassificationEnum.MAGE);
                break;
            case "4":
                avatarChoice.classification(AvatarClassificationEnum.RANGER);
                break;
            case "5":
                avatarChoice.classification(AvatarClassificationEnum.NECROMANCER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                classificationType();
        }
    }


    private void validateSpecies(String species) {
        switch (species) {
            case "1":
                avatarChoice.species(AvatarSpeciesEnum.HUMAN);
                break;
            case "2":
                avatarChoice.species(AvatarSpeciesEnum.ELF);
                break;
            case "3":
                avatarChoice.species(AvatarSpeciesEnum.DWARF);
                break;
            case "4":
                avatarChoice.species(AvatarSpeciesEnum.HALFLING);
                break;
            case "5":
                avatarChoice.species(AvatarSpeciesEnum.DRAGONKIND);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                chooseSpecies();
        }
   }

    private void validateHairColor(String hair) {
        switch (hair) {
            case "1":
                avatarChoice.hairColor(AvatarColorEnum.BLUE);
                break;
            case "2":
                avatarChoice.hairColor(AvatarColorEnum.RED);
                break;
            case "3":
                avatarChoice.hairColor(AvatarColorEnum.BLACK);
                break;
            case "4":
                avatarChoice.hairColor(AvatarColorEnum.GREEN);
                break;
            case "5":
                avatarChoice.hairColor(AvatarColorEnum.BROWN);
                break;
            case "6":
                avatarChoice.hairColor(AvatarColorEnum.GOLD);
                break;
            case "7":
                avatarChoice.hairColor(AvatarColorEnum.ORANGE);
                break;
            case "8":
                avatarChoice.hairColor(AvatarColorEnum.SILVER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                hairColor();
        }
    }

    private void validateArmorColor(String armorColor) {
        switch (armorColor) {
            case "1":
                avatarChoice.armorColor(AvatarColorEnum.BLUE);
                break;
            case "2":
                avatarChoice.armorColor(AvatarColorEnum.RED);
                break;
            case "3":
                avatarChoice.armorColor(AvatarColorEnum.BLACK);
                break;
            case "4":
                avatarChoice.armorColor(AvatarColorEnum.GREEN);
                break;
            case "5":
                avatarChoice.armorColor(AvatarColorEnum.BROWN);
                break;
            case "6":
                avatarChoice.armorColor(AvatarColorEnum.GOLD);
                break;
            case "7":
                avatarChoice.armorColor(AvatarColorEnum.ORANGE);
                break;
            case "8":
                avatarChoice.armorColor(AvatarColorEnum.SILVER);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                armorColor();
        }
    }

    private void validateWeaponsChoice(String weaponsChoice) {
        switch (weaponsChoice) {
            case "1":
                avatarChoice.weaponChoice(AvatarWeaponsEnum.SWORD);
                break;
            case "2":
                avatarChoice.weaponChoice(AvatarWeaponsEnum.STAFF);
                break;
            case "3":
                avatarChoice.weaponChoice(AvatarWeaponsEnum.DAGGER);
                break;
            case "4":
                avatarChoice.weaponChoice(AvatarWeaponsEnum.BOW);
                break;
            case "5":
                avatarChoice.weaponChoice(AvatarWeaponsEnum.SHIELD);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                weaponsChoice();
        }
    }

    private void validateArmorType(String armorType) {
        switch (armorType) {
            case "1":
                avatarChoice.armorType(AvatarArmorTypeEnum.LEATHER);
                break;
            case "2":
                avatarChoice.armorType(AvatarArmorTypeEnum.CHAINMAIL);
                break;
            case "3":
                avatarChoice.armorType(AvatarArmorTypeEnum.PLATEARMOR);
                break;
            default:
                System.out.print("You have entered an invalid choice.");
                armorType();
        }
    }
}
