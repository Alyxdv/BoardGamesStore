package Model;

import Main.AvatarClassificationEnum;
import Main.AvatarColorEnum;
import Main.AvatarSpeciesEnum;
import Main.AvatarWeaponsEnum;
import Main.AvatarArmorTypeEnum;


public class AvatarTemplate implements PriceInterface{

    private AvatarColorEnum hairColor;
    private AvatarColorEnum armorColor;
    private AvatarWeaponsEnum weaponChoice;
    private AvatarClassificationEnum classification;
    private AvatarSpeciesEnum species;
    private AvatarArmorTypeEnum armorType;
    private double price;
    private String name;



    public AvatarTemplate( AvatarSpeciesEnum species, AvatarClassificationEnum classification,
                          AvatarColorEnum hairColor, AvatarColorEnum armorColor,
                          AvatarWeaponsEnum weaponChoice, AvatarArmorTypeEnum armorType, double price) {
        this.setClassification(classification);
        this.setSpecies(species);
        this.setHairColor(hairColor);
        this.setArmorColor(armorColor);
        this.setWeaponChoice(weaponChoice);
        this.setArmorType(armorType);
        this.price = price;
    }


    public AvatarTemplate() {
        this(AvatarSpeciesEnum.HUMAN, AvatarClassificationEnum.FIGHTER,
                AvatarColorEnum.BLACK, AvatarColorEnum.BROWN, AvatarWeaponsEnum.DAGGER,
                AvatarArmorTypeEnum.LEATHER, 35.00);
    }

    @Override
    public double getPrice() {
        return 35.00;
    }

    public String toString() {
        String price = String.format("%24s", "$" + getPrice());
        return "  " + price;
    }


    public AvatarColorEnum getHairColor() {
        return hairColor;
    }

    public void setHairColor(AvatarColorEnum hairColor) {
        this.hairColor = hairColor;
    }

    public AvatarColorEnum getArmorColor() {
        return armorColor;
    }

    public void setArmorColor(AvatarColorEnum armorColor) {
        this.armorColor = armorColor;
    }

    public AvatarWeaponsEnum getWeaponChoice() {
        return weaponChoice;
    }

    public void setWeaponChoice(AvatarWeaponsEnum weaponChoice) {
        this.weaponChoice = weaponChoice;
    }

    public AvatarClassificationEnum getClassification() {
        return classification;
    }

    public void setClassification(AvatarClassificationEnum classification) {
        this.classification = classification;
    }

    public AvatarSpeciesEnum getSpecies() {
        return species;
    }

    public void setSpecies(AvatarSpeciesEnum species) {
        this.species = species;
    }

    public AvatarArmorTypeEnum getArmorType() {
        return armorType;
    }

    public void setArmorType(AvatarArmorTypeEnum armorType) {
        this.armorType = armorType;
    }
}
