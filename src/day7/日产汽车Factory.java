package day7;

//������ϵͳ��Ӧ���ǵ���
public class �ղ�����Factory extends IBuildCarFactory {

	// 2.���� ���ഴ���Լ���ʵ��Ϊ�����
	private static �ղ�����Factory �Լ� = new �ղ�����Factory();

	// ׼������¡��ԭ��
	private ���� crv = null;

	// 1.���� ������˽��
	private �ղ�����Factory() {
		crv = new ����();
		crv.setName("CRV����SUV");
		crv.setSpeed(130);
		crv.wheels = new Wheels();
		crv.wheels.set��̥("�����̥245");
	}

	// 3.���� ������ȡ��ʵ���ķ���
	// ͬ������
	public static synchronized �ղ�����Factory getInstance() {
		return �Լ�;
	}

	// �ڹ����н�������
	public ICar buyCar(String ����) {

		ICar car = null;

		if ("����".equals(����)) { // �����з�װ��������ϸ��
			car = new �ղ�();
			car.setName("����");
			car.setSpeed(200);
		} else if ("����".equals(����)) {
			car = new �ղ�();
			car.setName("����");
			car.setSpeed(160);
		} else if ("����".equals(����)) {
			car = new �ղ�();
			car.setName("����");
			car.setSpeed(180);
		} else if ("CRV".equals(����)) {

			try {
				car = crv.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.err.println("�ͻ��´�");
		}

		return car;

	}

}
