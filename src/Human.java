public class Human {

    //����� ���� ����������
    boolean injured = false;

    //������
    public void watch(Squirrel squirrel) {
        if (squirrel.getInCage()) {
            System.out.println("����� � ������");
        } else {
            System.out.println("����� �������");
        }
    }

}
