package day9.day9_HomeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import org.junit.Test;

public class day9_HomeWork {

	/*
	 * �����:
	 * 
	 * ��һ������(�벻Ҫ���������е�Ԫ��):
	 * 
	 * String[] name =
	 * {"Ken","Apple","Kate","Tomcat","Tim","Peter","Howard","Ken"
	 * ,"Jack","Jason","Jeffery","John Snow","Ann","Kate"};
	 * 
	 * 
	 * ��һ����: 1) ʹ��ArrayListȥװ�������е�Ԫ��. Ȼ���ArrayList����һ�ַ���. ʹ��3�ַ�ʽ��ӡ��ArrayList�е�ֵ:
	 * ��ʾ - ������for,foreach,while,do-while,Iterator�е�����3�ַ�ʽ.
	 * 
	 * 2) �����ArrayListʹ�����·���: add(E e) set(int index, E element) remove(E e)
	 * clear()
	 * 
	 * 3) ��ArrayList�����в鿴�Ƿ�������ַ���: "John Snow",ʹ������3��API����ķ�������.
	 * ���ʹ�÷���ɾ��֮.ɾ��֮���ӡ���ü��ϵĴ�С.
	 * 
	 * ��ʾ - �÷����Բ鿴API
	 */

	@Test
	public void test1() {

		String[] name = { "Ken", "Apple", "Kate", "Tomcat", "Tim", "Peter",
				"Howard", "Ken", "Jack", "Jason", "Jeffery", "John Snow",
				"Ann", "Kate" };
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);// ʹ��ArrayListȥװ�������е�Ԫ��
		}

		// list.add("Teluo");
		// list.set(14, "Monkey");
		// list.remove("Monkey");
		// list.clear();
		// foreach��ӡ
		for (String string : list) {
			System.out.print(string + ",");
		}
		// // Iterator��ӡ
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// System.out.print(iterator.next() + ",");
		// }
		// // for��ӡ
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }
		System.out.println(list.contains("John Snow"));
		System.out.println(list.indexOf("John Snow"));
		System.out.println(list.lastIndexOf("John Snow"));
		// one
		if (list.contains("John Snow")) {
			list.remove("John Snow");
			System.out.println(list.size());// ɾ��֮���ӡ���ü��ϵĴ�С
		}
		// two
		else if (list.indexOf("John Snow") != -1) {
			list.remove(list.indexOf("John Snow"));
			System.out.println(list.size());// ɾ��֮���ӡ���ü��ϵĴ�С
		}
		// three
		else if (list.lastIndexOf("John Snow") != -1) {
			list.remove(list.lastIndexOf("John Snow"));
			System.out.println(list.size());// ɾ��֮���ӡ���ü��ϵĴ�С
		} else {
			System.out.println("�б���û�д�Ԫ��");
		}
	}

	/*
	 * �ڶ�����: 1) ʹ��HashSet��ArrayList�ֱ��һ��ʵ����ȥװ�����������е�Ԫ��.
	 * 
	 * String[] name = { "Ken", "Apple", "Kate", "Tomcat", "Tim", "Peter",
	 * "Howard", "Ken", "Jack", "Jason", "Jeffery", "John Snow", "Ann", "Kate"
	 * };
	 * 
	 * 
	 * 2) Ȼ���HashSet����һ�ַ���.Ȼ���ȡHashSet���ϵĴ�С, ����ArrayList���ϵĴ�С���бȽ�,
	 * ʹ��Iterator����������Ԫ�ض���Ǹ����ϵ�ÿ��Ԫ��.
	 */

	@Test
	public void test2() {

		String[] name = { "Ken", "Apple", "Kate", "Tomcat", "Tim", "Peter",
				"Howard", "Ken", "Jack", "Jason", "Jeffery", "John Snow",
				"Ann", "Kate" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < name.length; i++) {
			set.add(name[i]);
		}
		System.out.println(set.size());// Set����װ���ظ���Ԫ�أ�List����
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list.size());
		Iterator<String> listIterator = list.iterator();
		Iterator<String> setIterator = set.iterator();
		if (list.size() > set.size()) {
			System.out.println("list�ļ��ϴ�");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}

		} else if (list.size() < set.size()) {
			System.out.println("set�ļ��ϴ�");
			while (setIterator.hasNext()) {
				System.out.println(setIterator.next());
			}
		} else {
			System.out.println("list������set����һ����");
		}

	}

}
