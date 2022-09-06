public class Animal {

    //имя
    String name;

    //быть больными
    private boolean healthy = true;

    public boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    //быть в карантине
    private boolean isolated = false;

    public boolean getIsolated() {
        return isolated;
    }

    public void setIsolated(boolean isolated) {
        this.isolated = isolated;
    }

    //быть голодными
    private boolean hungry = false;

    public boolean getHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    //кусаться

}
