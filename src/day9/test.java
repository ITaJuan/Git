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

		// String[] puk = 一副全新的扑克牌();
		// 发牌();
//		String[] puk = 发牌().length;
		System.out.println(发牌().clone());
		
		// 使用TreeSet理牌
		// String[] 我的牌 = "梅花6,梅花7,梅花8,梅花9,梅花10,梅花J,梅花Q,梅花K,梅花1,梅花2,梅花3,梅花4,梅花5"
		// .split(",");
		// 自定义排序比较规则
		Set<String> set = new TreeSet(new PaiComparator());
		
		// for (int i = 0; i < 我的牌.length; i++) {
		// set.add(我的牌[i]);
		// }

		for (String string : set) {
			System.out.println(string + ",");
		}
		System.out.println();
		System.out.println(set.size());
	}

	public void testSet() {

		List<Wheels> list = new ArrayList<Wheels>();
		Wheels w0 = new Wheels("横滨01");
		list.add(w0);
		list.add(w0);
		list.add(w0);
		list.add(w0);

		System.out.println(list.size());

		// Set集,
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

		// 添加到集Set
		set.add(stu0);
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		// Set不存重复数据 ,s0.equals.(s0)
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
		// 集合放的是对象
		// 数组列表：数据结构在组织，迭代（读取）快
		// List<Wheels> list = new ArrayList<>();
		// 链表：特点是修改（增加，删除和修改）速度快
		List<Wheels> list = new LinkedList<>();

		int x = 0;
		list.add(new Wheels("固特异" + (x++)));
		list.add(new Wheels("固特异" + (x++)));
		list.add(new Wheels("固特异" + (x++)));
		list.add(new Wheels("固特异" + (x++)));
		list.add(1, new Wheels("固特异" + (x++)));
		list.remove(2);

		Stack<Wheels> stk = new Stack<>();
		int count = 0;
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		list.addAll(stk);
		for (Wheels wheels : list) {
			System.out.println(wheels.get轮胎());
		}
		Wheels a = stk.pop();
		Wheels b = list.get(list.size() - 1);
		System.out.println(a.equals(b));

		Wheels[] ws = (Wheels[]) list.toArray();
		for (Wheels wheels : ws) {
			System.out.println(wheels.get轮胎() + ",");
		}
	}

	/*
	 * public void name() { String[] puk = 一副全新的扑克牌();
	 * 
	 * // for (int i = 0; i < puk.length; i++) { // System.out.print(puk[i] +
	 * ","); // if ((i + 1) % 13 == 0) { // System.out.println(); // } // } //
	 * System.out.println();
	 * 
	 * // 发牌(); // 底牌(puk); }
	 */

	public void 底牌(String[] puk) {
		System.out.print("底牌： ");
		for (int i = 0; i < puk.length; i++) {
			if (puk[i] != null) {
				System.out.print(puk[i] + " ");
			}
		}
		System.out.println();
	}

	public String[] 发牌() {
		String[] puk = 一副全新的扑克牌();
		Random random = new Random();
		// for (int i = 0; i < 3; i++) {
		// System.out.print(player + "的牌:" + "\t");
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
		// 底牌(puk);
		return puk;
	}

	public String[] 一副全新的扑克牌() {
		String[] puk = new String[54];
		String[] color = { "红桃", "黑桃", "方块", "梅花" };
		int index = 0;
		for (int i = 0; i < color.length; i++) {
			for (int j = 1; j <= 10; j++) {
				puk[index++] = color[i] + j;
			}
			puk[index++] = color[i] + "J";
			puk[index++] = color[i] + "Q";
			puk[index++] = color[i] + "K";
		}
		puk[index++] = "大王";
		puk[index++] = "小王";
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
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		stk.push(new Wheels("米其林" + (count++)));
		System.out.println(stk.size());
		System.out.println(stk.pop().get轮胎());
		System.out.println(stk.peek().get轮胎());// 看栈顶元素
		System.out.println(stk.size());

		Iterator<Wheels> iterator = stk.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().get轮胎());
		}
	}

}

class PaiComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 比较： 0-->相等，1：o1>o2 -1:o1<02

		String o1str = o1.toString();
		String o2str = o2.toString();

		String o1str前面 = o1str.substring(0, 2);
		String o2str前面 = o2str.substring(0, 2);

		int o1权重 = 0;
		int o2权重 = 0;

		if ("黑桃".equals(o1str前面)) {
			o1权重 = 100;
		} else if ("红桃".equals(o1str前面)) {
			o1权重 = 200;
		} else if ("梅花".equals(o1str前面)) {
			o1权重 = 300;
		} else if ("方块".equals(o1str前面)) {
			o1权重 = 400;
		} else if ("小王".equals(o1str前面)) {
			o1权重 = 500;
		} else {
			o1权重 = 600;
		}

		if ("黑桃".equals(o2str前面)) {
			o2权重 = 100;
		} else if ("红桃".equals(o2str前面)) {
			o2权重 = 200;
		} else if ("梅花".equals(o2str前面)) {
			o2权重 = 300;
		} else if ("方块".equals(o2str前面)) {
			o2权重 = 400;
		} else if ("小王".equals(o2str前面)) {
			o2权重 = 500;
		} else {
			o2权重 = 600;
		}
		if (o1str.length() > 2) {// 大王小王排除
			String tmp0 = o1str.substring(2);// 1,2,3,4,5,6,7,8,9,10,J,Q,K
			try {
				o1权重 += Integer.parseInt(tmp0);// 到J的时候会报错，数字格式不一样，需要抛出异常
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				if ("J".equals(tmp0)) {
					o1权重 += 11;
				} else if ("Q".equals(tmp0)) {
					o1权重 += 12;
				} else if ("K".equals(tmp0)) {
					o1权重 += 13;
				}
			}
		}
		if (o2str.length() > 2) { // 大王小王排除
			String tmp0 = o2str.substring(2); // 1,2,3,4,5,6,7,8,10,J,Q,K
			try {
				o2权重 += Integer.parseInt(tmp0);
			} catch (NumberFormatException e) {
				if ("J".equals(tmp0)) {
					o2权重 += 11;
				} else if ("Q".equals(tmp0)) {
					o2权重 += 12;
				} else if ("K".equals(tmp0)) {
					o2权重 += 13;
				}
			}
		}
		return o1权重 > o2权重 ? 1 : (o1权重 == o2权重 ? 0 : -1);
	}

}