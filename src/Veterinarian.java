public class Veterinarian extends Human {

    //��������� ��������
    public void checkHealth(Animal animal) {
        if (!animal.getHealthy()) {
            isolate(animal);
        } else if(animal.getIsolated()) {
            returnFromIsolation(animal);
        } else
            System.out.println("�������� �������");
    }

    //�������� � ��������
    public void isolate(Animal animal) {
        animal.setIsolated(true);
        System.out.println("�������� �������� � ��������");
    }

    //���������� �� ���������
    public void returnFromIsolation(Animal animal) {
        animal.setIsolated(false);
        System.out.println("�������� �������� � ��������");
    }

    //����������� �������

}
