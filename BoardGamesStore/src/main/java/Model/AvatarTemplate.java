package Model;

import Main.*;

public class AvatarTemplate {
//add price interface
    public AvatarColorEnum hairColor;
    public AvatarColorEnum armorColor;
    public AvatarWeaponsEnum weaponChoice;
    public AvatarClassificationEnum classification;
    public AvatarSpeciesEnum species;
    public AvatarArmorTypeEnum armorType;

    public AvatarTemplate( AvatarSpeciesEnum species, AvatarClassificationEnum classification,
                          AvatarColorEnum hairColor, AvatarColorEnum armorColor,
                          AvatarWeaponsEnum weaponChoice, AvatarArmorTypeEnum armorType) {
        this.classification = classification;
        this.species = species;
        this.hairColor = hairColor;
        this.armorColor = armorColor;
        this.weaponChoice = weaponChoice;
        this.armorType = armorType;
    }

    public AvatarTemplate() {
        this(AvatarSpeciesEnum.HUMAN, AvatarClassificationEnum.FIGHTER,
                AvatarColorEnum.BLACK, AvatarColorEnum.BROWN, AvatarWeaponsEnum.DAGGER,
                AvatarArmorTypeEnum.LEATHER);
    }

    public void classification(AvatarClassificationEnum classification) {
        this.classification = classification;
    }

    public void species(AvatarSpeciesEnum species) {
        this.species = species;
    }

    public void hairColor(AvatarColorEnum hairColor) {
        this.hairColor = hairColor;
    }

    public void armorColor(AvatarColorEnum armorColor) {
        this.armorColor = armorColor;
    }

    public void weaponChoice(AvatarWeaponsEnum weaponChoice) {
        this.weaponChoice = weaponChoice;
    }

    public void armorType(AvatarArmorTypeEnum armorType) {
        this.armorType = armorType;
    }
}
