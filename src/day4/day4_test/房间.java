package day4.day4_test;

import day4.�˿�;

//JavaBean

public class ���� {

	// ˽�л�����
	private int max�˿�;
	private double price;
	private String ����;
	private �˿�[] cstms;

	public ����() {
		super();
	}

	public ����(int max�˿�, double price, String ����) {
		super();
		this.max�˿� = max�˿�;
		this.price = price;
		this.���� = ����;
	}

	public String ��ס(�˿�[] cstms) {
		if (cstms.length > max�˿�) {
			return "��סʧ�ܣ��������������������";

		}
		String �˿����� = "";
		for (�˿� csts : cstms) {
			�˿����� += csts.get����() + ",";
		}
		return �˿����� + "��ס�ɹ�";

	}

	// ʹ�ù�����getter/setter��¶������ֵ�ķ���
	public int getMax�˿�() {
		return max�˿�;
	}

	public void setMax�˿�(int max�˿�) {
		this.max�˿� = max�˿�;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public �˿�[] getCstms() {
		return cstms;
	}

	public void setCstms(�˿�[] cstms) {
		this.cstms = cstms;
	}

}
