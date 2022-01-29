package biscuitFactory;

// This is supposed to be a Singleton - but it isn't set up like one!!!
// It uses static variables, instead of referring to instance variables

public class BiscuitProduction {

    private static BiscuitProduction instance = null;
    private static int biscuitSize;
    private static int productionSpeed;
    private static int chocolateChipAmount;

    private BiscuitProduction() {

    }

    public static BiscuitProduction getInstance() {
        if(instance == null) {
            instance = new BiscuitProduction();
        }
        return instance;
    }

    public static int getBiscuitSize() {
        return biscuitSize;
    }

    public static void setBiscuitSize(int biscuitSize) {
        BiscuitProduction.biscuitSize = biscuitSize;
    }

    public static int getProductionSpeed() {
        return productionSpeed;
    }

    public static void setProductionSpeed(int productionSpeed) {
        BiscuitProduction.productionSpeed = productionSpeed;
    }

    public static int getChocolateChipAmount() {
        return chocolateChipAmount;
    }

    public static void setChocolateChipAmount(int chocolateChipAmount) {
        BiscuitProduction.chocolateChipAmount = chocolateChipAmount;
    }
}
