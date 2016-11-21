package day9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import org.junit.Test;

import day8.pojo.Student;
import day9.pojo.Wheels;

public class test {

	@Test
	public void testTreeSet() {

		// String[] puk = һ��ȫ�µ��˿���();
		// ����();
//		String[] puk = ����().length;
		System.out.println(����().clone());
		
		// ʹ��TreeSet����
		// String[] �ҵ��� = "÷��6,÷��7,÷��8,÷��9,÷��10,÷��J,÷��Q,÷��K,÷��1,÷��2,÷��3,÷��4,÷��5"
		// .split(",");
		// �Զ�������ȽϹ���
		Set<String> set = new TreeSet(new PaiComparator());
		
		// for (int i = 0; i < �ҵ���.length; i++) {
		// set.add(�ҵ���[i]);
		// }

		for (String string : set) {
			System.out.println(string + ",");
		}
		System.out.println();
		System.out.println(set.size());
	}

	public void testSet() {

		List<Wheels> list = new ArrayList<Wheels>();
		Wheels w0 = new Wheels("���01");
		list.add(w0);
		list.add(w0);
		list.add(w0);
		list.add(w0);

		System.out.println(list.size());

		// Set��,
		Set<Student> set = new HashSet<>();
		Student stu0 = new Student();
		stu0.setStuName("Tom");
		stu0.setStuAge(18);

		Student stu1 = new Student();
		stu1.setStuName("Tommy");
		stu1.setStuAge(21);

		Student stu2 = new Student();
		stu2.setStuName("Jack");
		stu2.setStuAge(20);

		Student stu3 = new Student();
		stu3.setStuName("Jerry");
		stu3.setStuAge(19);

		// ��ӵ���Set
		set.add(stu0);
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		// Set�����ظ����� ,s0.equals.(s0)
		set.add(stu0);
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);

		for (Student student : set) {
			System.out
					.println(student.getStuName() + "," + student.getStuAge());
		}
	}

	// @Test
	public void testList() {
		// ���Ϸŵ��Ƕ���
		// �����б����ݽṹ����֯����������ȡ����
		// List<Wheels> list = new ArrayList<>();
		// �����ص����޸ģ����ӣ�ɾ�����޸ģ��ٶȿ�
		List<Wheels> list = new LinkedList<>();

		int x = 0;
		list.add(new Wheels("������" + (x++)));
		list.add(new Wheels("������" + (x++)));
		list.add(new Wheels("������" + (x++)));
		list.add(new Wheels("������" + (x++)));
		list.add(1, new Wheels("������" + (x++)));
		list.remove(2);

		Stack<Wheels> stk = new Stack<>();
		int count = 0;
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		list.addAll(stk);
		for (Wheels wheels : list) {
			System.out.println(wheels.get��̥());
		}
		Wheels a = stk.pop();
		Wheels b = list.get(list.size() - 1);
		System.out.println(a.equals(b));

		Wheels[] ws = (Wheels[]) list.toArray();
		for (Wheels wheels : ws) {
			System.out.println(wheels.get��̥() + ",");
		}
	}

	/*
	 * public void name() { String[] puk = һ��ȫ�µ��˿���();
	 * 
	 * // for (int i = 0; i < puk.length; i++) { // System.out.print(puk[i] +
	 * ","); // if ((i + 1) % 13 == 0) { // System.out.println(); // } // } //
	 * System.out.println();
	 * 
	 * // ����(); // ����(puk); }
	 */

	public void ����(String[] puk) {
		System.out.print("���ƣ� ");
		for (int i = 0; i < puk.length; i++) {
			if (puk[i] != null) {
				System.out.print(puk[i] + " ");
			}
		}
		System.out.println();
	}

	public String[] ����() {
		String[] puk = һ��ȫ�µ��˿���();
		Random random = new Random();
		// for (int i = 0; i < 3; i++) {
		// System.out.print(player + "����:" + "\t");
		int count = 0;
		while (true) {
			int idx = random.nextInt(54);
			if (puk[idx] != null) {
				String pai = puk[idx];
				// System.out.print(pai + ",");
				puk[idx] = null;
				count++;
			}
			if (count == 17) {
				break;
			}
		}
		System.out.println();
		// }
		// ����(puk);
		return puk;
	}

	public String[] һ��ȫ�µ��˿���() {
		String[] puk = new String[54];
		String[] color = { "����", "����", "����", "÷��" };
		int index = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 10; j++) {
				puk[index++] = color[i] + j;
			}
			puk[index++] = color[i] + "J";
			puk[index++] = color[i] + "Q";
			puk[index++] = color[i] + "K";
		}
		puk[index++] = "����";
		puk[index++] = "С��";
		return puk;
	}

	// @Test
	public void t() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	// @Test
	public void TestStackQueue() {
		Stack<Wheels> stk = new Stack<>();
		int count = 0;
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		stk.push(new Wheels("������" + (count++)));
		System.out.println(stk.size());
		System.out.println(stk.pop().get��̥());
		System.out.println(stk.peek().get��̥());// ��ջ��Ԫ��
		System.out.println(stk.size());

		Iterator<Wheels> iterator = stk.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().get��̥());
		}
	}

}

class PaiComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// �Ƚϣ� 0-->��ȣ�1��o1>o2 -1:o1<02

		String o1str = o1.toString();
		String o2str = o2.toString();

		String o1strǰ�� = o1str.substring(0, 2);
		String o2strǰ�� = o2str.substring(0, 2);

		int o1Ȩ�� = 0;
		int o2Ȩ�� = 0;

		if ("����".equals(o1strǰ��)) {
			o1Ȩ�� = 100;
		} else if ("����".equals(o1strǰ��)) {
			o1Ȩ�� = 200;
		} else if ("÷��".equals(o1strǰ��)) {
			o1Ȩ�� = 300;
		} else if ("����".equals(o1strǰ��)) {
			o1Ȩ�� = 400;
		} else if ("С��".equals(o1strǰ��)) {
			o1Ȩ�� = 500;
		} else {
			o1Ȩ�� = 600;
		}

		if ("����".equals(o2strǰ��)) {
			o2Ȩ�� = 100;
		} else if ("����".equals(o2strǰ��)) {
			o2Ȩ�� = 200;
		} else if ("÷��".equals(o2strǰ��)) {
			o2Ȩ�� = 300;
		} else if ("����".equals(o2strǰ��)) {
			o2Ȩ�� = 400;
		} else if ("С��".equals(o2strǰ��)) {
			o2Ȩ�� = 500;
		} else {
			o2Ȩ�� = 600;
		}
		if (o1str.length() > 2) {// ����С���ų�
			String tmp0 = o1str.substring(2);// 1,2,3,4,5,6,7,8,9,10,J,Q,K
			try {
				o1Ȩ�� += Integer.parseInt(tmp0);// ��J��ʱ��ᱨ�����ָ�ʽ��һ������Ҫ�׳��쳣
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				if ("J".equals(tmp0)) {
					o1Ȩ�� += 11;
				} else if ("Q".equals(tmp0)) {
					o1Ȩ�� += 12;
				} else if ("K".equals(tmp0)) {
					o1Ȩ�� += 13;
				}
			}
		}
		if (o2str.length() > 2) { // ����С���ų�
			String tmp0 = o2str.substring(2); // 1,2,3,4,5,6,7,8,10,J,Q,K
			try {
				o2Ȩ�� += Integer.parseInt(tmp0);
			} catch (NumberFormatException e) {
				if ("J".equals(tmp0)) {
					o2Ȩ�� += 11;
				} else if ("Q".equals(tmp0)) {
					o2Ȩ�� += 12;
				} else if ("K".equals(tmp0)) {
					o2Ȩ�� += 13;
				}
			}
		}
		return o1Ȩ�� > o2Ȩ�� ? 1 : (o1Ȩ�� == o2Ȩ�� ? 0 : -1);
	}

}