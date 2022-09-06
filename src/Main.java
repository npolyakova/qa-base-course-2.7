public class Main {

    public static void main(String[] args) {
        Veterinarian gosha = new Veterinarian();
        Zookeeper vasya = new Zookeeper();
        Cats kuzya = new Cats("lion");
        kuzya.name = "Kuzya";
        Cats zhora = new Cats("tiger");
        zhora.name = "Zhora";
        Hypo dosya = new Hypo();
        Squirrel strelka = new Squirrel();
        strelka.name = "Strelka";
        Squirrel lovkach = new Squirrel();
        lovkach.name = "Lovkach";

        vasya.feed(kuzya);
        vasya.feed(zhora);
        vasya.feed(dosya);
        vasya.changeWater(dosya);
        vasya.watch(strelka);
        vasya.feed(strelka);
        vasya.feed(lovkach);

        System.out.println();
        gosha.checkHealth(kuzya);
        zhora.setHealthy(false);
        gosha.checkHealth(zhora);
        gosha.watch(strelka);
        gosha.checkHealth(strelka);
        gosha.checkHealth(lovkach);
        gosha.checkHealth(dosya);

    }
}
