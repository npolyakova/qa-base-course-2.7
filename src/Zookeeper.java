public class Zookeeper extends Human {

    //кормит
    public void feed(Animal animal) {
        animal.setHungry(false);
        System.out.println("Накормил " + animal.name);
    }

    //вычесывает кошек
    public void groom(Cats cat) {
        cat.setShaggy(false);
        System.out.println("Животное вычесано");
    }

    //меняет воду бегемоту
    public void changeWater(Hypo hypo) {
        hypo.setNeedFreshWater(false);
        System.out.println("Вода заменена");
    }
}
