package day4;


public class �˿� {

	private String ����;
	private boolean �Ա�;
	private String ���֤;

	// �����������췽��
	public �˿�() {// ���������������ͬ����û�з���ֵ����дvoid
		// ���������û�������������ΪĬ�Ϲ�����,���û�������������Ĺ�����������ʡ�Բ�д
		super();
		// ����="����";
	}

	public �˿�(String ����, boolean �Ա�, String ���֤) {
		// �ڷ����У�������ʾ����ȫ�ֱ���ʹ��this�ؼ���
		super();
		this.���� = ����;
		this.�Ա� = �Ա�;
		this.���֤ = ���֤;
	}

	public void ��ס() {

	}

	public void ����() {

	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public boolean is�Ա�() {
		return �Ա�;
	}

	public void set�Ա�(boolean �Ա�) {
		this.�Ա� = �Ա�;
	}

	public String get���֤() {
		return ���֤;
	}

	public void set���֤(String ���֤) {
		this.���֤ = ���֤;
	}
}
