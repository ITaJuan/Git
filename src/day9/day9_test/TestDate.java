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

		// ��������
		Date date = new Date();
		System.out.println(date);

		// ���ڸ�ʽ����
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(df.format(date));
		// ���ڸ�ʽ����
		DateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
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
	// Calendar����<------>Date����
	public void testCalendar() {

		// ȡ������
		Calendar cdr = Calendar.getInstance();
		Date date01 = cdr.getTime();
		System.out.println("date01=" + date01 + "," + cdr.getTimeInMillis());
	}

	@Test
	public void testCalendar����() {

		// ȡ������
		Calendar cdr = Calendar.getInstance();
		int year = cdr.get(Calendar.AUGUST);
		int month = cdr.get(Calendar.MONTH);
		int day = cdr.get(Calendar.DAY_OF_MONTH);
		int hour = cdr.get(Calendar.HOUR_OF_DAY);
		int d = cdr.get(Calendar.AM_PM);//Calendar.AM_PM: 0�����磬1������

		System.out.println(year);

		// System.out.println(year + "," + (month + 1) + "," +
		// day+","+hour+",");

	}

	@Test
	public void poke() {

		String puk[] = new String[54];
		String color[] = { "����", "����", "��ש", "÷��" };
		// ��ʼ���˿�
		int idx = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 10; j++) {
				puk[idx++] = color[i] + j;
			}
			puk[idx++] = color[i] + "J";
			puk[idx++] = color[i] + "Q";
			puk[idx++] = color[i] + "K";
		}
		puk[idx++] = "����";
		puk[idx++] = "С��";
		// for (int i = 0; i < puk.length; i++) {
		// System.out.println(puk[i] + ",");
		// }

		Random rdm = new Random();
		for (int i = 0; i < 3; i++) {
			int count = 0;
			System.out.print("��" + (i + 1) + "�����:\t");
			while (true) {

				int paiIndex = rdm.nextInt(54);
				if (puk[paiIndex] != null) {
					String һ���� = puk[paiIndex];
					System.out.print(һ���� + "\t");
					puk[paiIndex] = null;
					count++;// ��Ч����
				}
				if (count == 17) {
					break;
				}
			}
			System.out.println();
		}
		System.out.print("����: ");
		for (int i = 0; i < puk.length; i++) {
			if (puk[i] != null) {
				System.out.print(puk[i] + ",");
			}
		}
	}
}
