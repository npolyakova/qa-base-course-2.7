public class Cats extends Animal {
    //type
    String type;

    //лохматые
    private boolean shaggy = false;

    public boolean getShaggy() {
        return shaggy;
    }

    public void setShaggy(boolean shaggy) {
        this.shaggy = shaggy;
    }

    public Cats(String type) {
        this.type = type;
    }
}
