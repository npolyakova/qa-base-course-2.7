public class Veterinarian extends Human {

    //проверяет здоровье
    public void checkHealth(Animal animal) {
        if (!animal.getHealthy()) {
            isolate(animal);
        } else if(animal.getIsolated()) {
            returnFromIsolation(animal);
        } else
            System.out.println("Животное здорово");
    }

    //помещает в карантин
    public void isolate(Animal animal) {
        animal.setIsolated(true);
        System.out.println("Животное помещено в карантин");
    }

    //возвращает из карантина
    public void returnFromIsolation(Animal animal) {
        animal.setIsolated(false);
        System.out.println("Животное помещено в карантин");
    }

    //накладывает повязку

}
