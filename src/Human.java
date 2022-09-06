public class Human {

    //могут быть покусаными
    boolean injured = false;

    //следит
    public void watch(Squirrel squirrel) {
        if (squirrel.getInCage()) {
            System.out.println("Белка в клетке");
        } else {
            System.out.println("Белка сбежала");
        }
    }

}
