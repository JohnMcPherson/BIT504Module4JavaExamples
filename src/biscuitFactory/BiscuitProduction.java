package biscuitFactory;

// CHECK should we use static methods on a Singleton?

public class BiscuitProduction {

    private static BiscuitProduction instance = null;
    private int biscuitSize;
    private int productionSpeed;
    private int chocolateChipAmount;

    private BiscuitProduction() {

    }

    public static BiscuitProduction getInstance() {
        if(instance == null) {
            instance = new BiscuitProduction();
        }
        return instance;
    }

    public static int getBiscuitSize() {
        return getInstance().biscuitSize;
    }

    public static void setBiscuitSize(int biscuitSize) {
        BiscuitProduction.getInstance().biscuitSize = biscuitSize;
    }

    public static int getProductionSpeed() {
        return BiscuitProduction.getInstance().productionSpeed;
    }

    public static void setProductionSpeed(int productionSpeed) {
        BiscuitProduction.getInstance().productionSpeed = productionSpeed;
    }

    public static int getChocolateChipAmount() {
        return BiscuitProduction.getInstance().chocolateChipAmount;
    }

    public static void setChocolateChipAmount(int chocolateChipAmount) {
        BiscuitProduction.getInstance().chocolateChipAmount = chocolateChipAmount;
    }
}
