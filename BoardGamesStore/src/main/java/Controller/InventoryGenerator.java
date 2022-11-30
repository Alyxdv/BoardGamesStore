package Controller;

import Model.*;

import java.util.ArrayList;

public class InventoryGenerator {
    private ArrayList<GuessThePlace> guessThePlaceList;
    private ArrayList<ShowYourTalent> showYourTalentList;
    private ArrayList<SpaceRunners> spaceRunnersList;
    private ArrayList<PiratesOcean> piratesOceansList;
    private ArrayList<GryphonsAndChimeras>gryphonsAndChimerasList;
    private ArrayList<CloudTravels>cloudTravelsList;
    private ModelNumberGenerator generator;

    public InventoryGenerator() {
        generator = ModelNumberGenerator.getInstance();
        guessThePlaceList = buildGuessThePlaceInventory(new ArrayList<>());
        showYourTalentList = buildShowYourTalentInventory(new ArrayList<>());
        spaceRunnersList = buildSpaceRunnersInventory(new ArrayList<>());
        piratesOceansList = buildPiratesOceansInventory(new ArrayList<>());
        gryphonsAndChimerasList = buildGryphonsAndChimerasInventory(new ArrayList<>());
        cloudTravelsList = buildCloudTravelsInventory(new ArrayList<>());
    }

    public ArrayList<GuessThePlace> getGuessThePlaceList() {
        return guessThePlaceList;
    }

    public ArrayList<ShowYourTalent> getShowYourTalentList() {
        return showYourTalentList;
    }

    public ArrayList<SpaceRunners> getSpaceRunnersList() {
        return spaceRunnersList;
    }

    public ArrayList<PiratesOcean> getPiratesOceansList() {
        return piratesOceansList;
    }

    public ArrayList<GryphonsAndChimeras> getGryphonsAndChimerasList() {
        return gryphonsAndChimerasList;
    }

    public ArrayList<CloudTravels> getCloudTravelsList() {
        return cloudTravelsList;
    }

    private ArrayList<GuessThePlace> buildGuessThePlaceInventory(ArrayList<GuessThePlace> boardGameList) {
        GuessThePlace boardGame = new GuessThePlace();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new GuessThePlace();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }

    private ArrayList<ShowYourTalent> buildShowYourTalentInventory(ArrayList<ShowYourTalent> boardGameList) {
        ShowYourTalent boardGame = new ShowYourTalent();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new ShowYourTalent();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }

    private ArrayList<SpaceRunners> buildSpaceRunnersInventory(ArrayList<SpaceRunners> boardGameList) {
        SpaceRunners boardGame = new SpaceRunners();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new SpaceRunners();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }

    private ArrayList<PiratesOcean> buildPiratesOceansInventory(ArrayList<PiratesOcean> boardGameList) {
        PiratesOcean boardGame = new PiratesOcean();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new PiratesOcean();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }

    private ArrayList<GryphonsAndChimeras> buildGryphonsAndChimerasInventory(ArrayList<GryphonsAndChimeras> boardGameList) {
        GryphonsAndChimeras boardGame = new GryphonsAndChimeras();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new GryphonsAndChimeras();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }

    private ArrayList<CloudTravels> buildCloudTravelsInventory(ArrayList<CloudTravels> boardGameList) {
        CloudTravels boardGame = new CloudTravels();
        generator.startGeneration(boardGame.getPrefix(), boardGame.getStart());

        for(int i = 0; i < 10; i++) {
            boardGame = new CloudTravels();
            boardGame.setModel(generator.getNextSerial());
            boardGameList.add(i, boardGame);
        }
        return boardGameList;
    }
}
