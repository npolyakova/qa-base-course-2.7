public class Hypo extends Animal {

    String name = "Dosya";

    //нуждается в смене воды
    private boolean needFreshWater = false;

    public boolean getNeedFreshWater() {
        return needFreshWater;
    }

    public void setNeedFreshWater(boolean needFreshWater) {
        this.needFreshWater = needFreshWater;
    }
}
