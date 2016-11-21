package day4.day4_test;

import day4.顾客;

public class test {

	public static void main(String[] args) {
		// 创建并初始化房间
		房间 room301 = new 房间(2, 235, "303");
		String msg = room301.入住(new 顾客[] { new 顾客("Jack", true, "123"),
				new 顾客("Tom", true, "789"), new 顾客("Jun", true, "456") });
		System.out.println(msg);
	}
}
