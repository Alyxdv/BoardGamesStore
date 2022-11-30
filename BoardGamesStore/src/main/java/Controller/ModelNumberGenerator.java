package Controller;

public class ModelNumberGenerator {

    private static ModelNumberGenerator generate;
    private String modelNumber;
    private int start;

    public static synchronized ModelNumberGenerator getInstance() {
        if(generate == null) {
            generate = new ModelNumberGenerator();
        }
        return generate;
    }
    private ModelNumberGenerator() {}

    public synchronized void startGeneration(String model, int startNumber) {
        modelNumber = model;
        start = startNumber;
    }

    public synchronized String getNextSerial() {
        return modelNumber + (++start);
    }

    public synchronized  int getRecentNumber() {
        return start;
    }
}
