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
	 * 编程题:
	 * 
	 * 有一个数组(请不要更改数组中的元素):
	 * 
	 * String[] name =
	 * {"Ken","Apple","Kate","Tomcat","Tim","Peter","Howard","Ken"
	 * ,"Jack","Jason","Jeffery","John Snow","Ann","Kate"};
	 * 
	 * 
	 * 第一部分: 1) 使用ArrayList去装载数组中的元素. 然后给ArrayList定义一种范型. 使用3种方式打印出ArrayList中的值:
	 * 提示 - 可以是for,foreach,while,do-while,Iterator中的任意3种方式.
	 * 
	 * 2) 对这个ArrayList使用以下方法: add(E e) set(int index, E element) remove(E e)
	 * clear()
	 * 
	 * 3) 在ArrayList集合中查看是否含有这个字符串: "John Snow",使用至少3种API定义的方法查找.
	 * 最后使用方法删除之.删除之后打印出该集合的大小.
	 * 
	 * 提示 - 用法可以查看API
	 */

	@Test
	public void test1() {

		String[] name = { "Ken", "Apple", "Kate", "Tomcat", "Tim", "Peter",
				"Howard", "Ken", "Jack", "Jason", "Jeffery", "John Snow",
				"Ann", "Kate" };
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);// 使用ArrayList去装载数组中的元素
		}

		// list.add("Teluo");
		// list.set(14, "Monkey");
		// list.remove("Monkey");
		// list.clear();
		// foreach打印
		for (String string : list) {
			System.out.print(string + ",");
		}
		// // Iterator打印
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// System.out.print(iterator.next() + ",");
		// }
		// // for打印
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }
		System.out.println(list.contains("John Snow"));
		System.out.println(list.indexOf("John Snow"));
		System.out.println(list.lastIndexOf("John Snow"));
		// one
		if (list.contains("John Snow")) {
			list.remove("John Snow");
			System.out.println(list.size());// 删除之后打印出该集合的大小
		}
		// two
		else if (list.indexOf("John Snow") != -1) {
			list.remove(list.indexOf("John Snow"));
			System.out.println(list.size());// 删除之后打印出该集合的大小
		}
		// three
		else if (list.lastIndexOf("John Snow") != -1) {
			list.remove(list.lastIndexOf("John Snow"));
			System.out.println(list.size());// 删除之后打印出该集合的大小
		} else {
			System.out.println("列表中没有此元素");
		}
	}

	/*
	 * 第二部分: 1) 使用HashSet和ArrayList分别的一个实现类去装载下面数组中的元素.
	 * 
	 * String[] name = { "Ken", "Apple", "Kate", "Tomcat", "Tim", "Peter",
	 * "Howard", "Ken", "Jack", "Jason", "Jeffery", "John Snow", "Ann", "Kate"
	 * };
	 * 
	 * 
	 * 2) 然后给HashSet定义一种范型.然后获取HashSet集合的大小, 并与ArrayList集合的大小进行比较,
	 * 使用Iterator迭代出集合元素多的那个集合的每个元素.
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
		System.out.println(set.size());// Set不能装载重复的元素，List可以
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list.size());
		Iterator<String> listIterator = list.iterator();
		Iterator<String> setIterator = set.iterator();
		if (list.size() > set.size()) {
			System.out.println("list的集合大");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}

		} else if (list.size() < set.size()) {
			System.out.println("set的集合大");
			while (setIterator.hasNext()) {
				System.out.println(setIterator.next());
			}
		} else {
			System.out.println("list集合与set集合一样大");
		}

	}

}
