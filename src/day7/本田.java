package day7;

//������Ϊԭ�͵�����Ҫʵ��   �սӿ�Cloneable����ǣ�
public class ���� extends �������� implements Cloneable {

	// �������Ͳ���ֱ�ӱ���¡����Ҫ��ȿ�¡���
	public Wheels wheels;

	// 2.����Object��clone
	@Override
	public ���� clone() throws CloneNotSupportedException {
		// ��¡�Ĵ���
		���� newCar = (����) super.clone();
		// ��ȿ�¡
		newCar.wheels = wheels.clone();

		return newCar;
	}

	@Override
	public void run() {
		System.out.println("��������:" + getName() + "run as " + this.getSpeed()
				+ " mph");
	}

	@Override
	public void stop() {
		System.out.println("��������:" + getName() + "stop");

	}

}
