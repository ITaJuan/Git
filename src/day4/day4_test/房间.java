package day4.day4_test;

import day4.顾客;

//JavaBean

public class 房间 {

	// 私有化属性
	private int max顾客;
	private double price;
	private String 房号;
	private 顾客[] cstms;

	public 房间() {
		super();
	}

	public 房间(int max顾客, double price, String 房号) {
		super();
		this.max顾客 = max顾客;
		this.price = price;
		this.房号 = 房号;
	}

	public String 入住(顾客[] cstms) {
		if (cstms.length > max顾客) {
			return "入住失败，超过房间最大人数限制";

		}
		String 顾客姓名 = "";
		for (顾客 csts : cstms) {
			顾客姓名 += csts.get姓名() + ",";
		}
		return 顾客姓名 + "入住成功";

	}

	// 使用公开的getter/setter暴露对属性值的访问
	public int getMax顾客() {
		return max顾客;
	}

	public void setMax顾客(int max顾客) {
		this.max顾客 = max顾客;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String get房号() {
		return 房号;
	}

	public void set房号(String 房号) {
		this.房号 = 房号;
	}

	public 顾客[] getCstms() {
		return cstms;
	}

	public void setCstms(顾客[] cstms) {
		this.cstms = cstms;
	}

}
