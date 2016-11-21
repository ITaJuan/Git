package day9.day9_test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

public class TestDate {

	// @Test
	public void test01() {

		// 日期类型
		Date date = new Date();
		System.out.println(date);

		// 日期格式化类
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(df.format(date));
		// 日期格式化类
		DateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		System.out.println(sdf.format(date));

		try {
			Date date2 = df.parse("2009-3-1 11:11:11");
			System.out.println("date2=" + date2);
			long times = date.getTime() - date2.getTime();
			System.out.println(times / (1000 * 60 * 60 * 24));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// @Test
	// Calendar日历<------>Date互换
	public void testCalendar() {

		// 取得日历
		Calendar cdr = Calendar.getInstance();
		Date date01 = cdr.getTime();
		System.out.println("date01=" + date01 + "," + cdr.getTimeInMillis());
	}

	@Test
	public void testCalendar计算() {

		// 取得日历
		Calendar cdr = Calendar.getInstance();
		int year = cdr.get(Calendar.AUGUST);
		int month = cdr.get(Calendar.MONTH);
		int day = cdr.get(Calendar.DAY_OF_MONTH);
		int hour = cdr.get(Calendar.HOUR_OF_DAY);
		int d = cdr.get(Calendar.AM_PM);//Calendar.AM_PM: 0是上午，1是下午

		System.out.println(year);

		// System.out.println(year + "," + (month + 1) + "," +
		// day+","+hour+",");

	}

	@Test
	public void poke() {

		String puk[] = new String[54];
		String color[] = { "红桃", "黑桃", "方砖", "梅花" };
		// 初始化扑克
		int idx = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 10; j++) {
				puk[idx++] = color[i] + j;
			}
			puk[idx++] = color[i] + "J";
			puk[idx++] = color[i] + "Q";
			puk[idx++] = color[i] + "K";
		}
		puk[idx++] = "大王";
		puk[idx++] = "小王";
		// for (int i = 0; i < puk.length; i++) {
		// System.out.println(puk[i] + ",");
		// }

		Random rdm = new Random();
		for (int i = 0; i < 3; i++) {
			int count = 0;
			System.out.print("第" + (i + 1) + "个玩家:\t");
			while (true) {

				int paiIndex = rdm.nextInt(54);
				if (puk[paiIndex] != null) {
					String 一张牌 = puk[paiIndex];
					System.out.print(一张牌 + "\t");
					puk[paiIndex] = null;
					count++;// 有效发牌
				}
				if (count == 17) {
					break;
				}
			}
			System.out.println();
		}
		System.out.print("底牌: ");
		for (int i = 0; i < puk.length; i++) {
			if (puk[i] != null) {
				System.out.print(puk[i] + ",");
			}
		}
	}
}
