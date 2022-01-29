package biscuitFactory;

public class Main {

    public static void main(String[] args) {
        BiscuitProduction.setBiscuitSize(5);        // Setting size in centimeters
        System.out.println("Current biscuit size being produced: " + BiscuitProduction.getBiscuitSize());
        BiscuitProduction.setProductionSpeed(1200);    // Setting amount of biscuits produced per minute
        System.out.println("Current biscuits produced per minute: " + BiscuitProduction.getProductionSpeed());
        BiscuitProduction.setChocolateChipAmount(20);
        System.out.println("Chocolate chip amount: " + BiscuitProduction.getChocolateChipAmount());
    }

}
