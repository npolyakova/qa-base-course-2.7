public class Zookeeper extends Human {

    //������
    public void feed(Animal animal) {
        animal.setHungry(false);
        System.out.println("�������� " + animal.name);
    }

    //���������� �����
    public void groom(Cats cat) {
        cat.setShaggy(false);
        System.out.println("�������� ��������");
    }

    //������ ���� ��������
    public void changeWater(Hypo hypo) {
        hypo.setNeedFreshWater(false);
        System.out.println("���� ��������");
    }
}
