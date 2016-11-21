package day8.Test;

import org.junit.Test;

import day8.biz.List;
import day8.biz.Queue;
import day8.pojo.Wheels;

public class TestQueue {
	// @Test
	public void test() {

		Queue<Wheels> queue = new Queue<>(6);
		int x = 0;

		queue.add(new Wheels("AAA" + (x++)));
		queue.add(new Wheels("AAA" + (x++)));
		queue.add(new Wheels("AAA" + (x++)));
		queue.add(new Wheels("AAA" + (x++)));
		queue.add(new Wheels("AAA" + (x++)));
		queue.add(new Wheels("AAA" + (x++)));

		Wheels temp = null;
		while ((temp = queue.get()) != null) {
			System.out.println(temp.get��̥());
		}
		System.out.println(queue.canUse());
		queue.add(new Wheels("BBB" + (x++)));
		queue.add(new Wheels("BBB" + (x++)));
		queue.add(new Wheels("BBB" + (x++)));
		System.out.println(queue.size());
		System.out.println(((Wheels) queue.get()).get��̥());
		// Wheels temp = (Wheels) queue.get();
		// System.out.println(temp.get��̥());
	}

	@Test
	public void testList() {
		List list = new List(8);
		int x = 0;

		list.add(new Wheels("CCCC" + (x++)));
		list.add(new Wheels("CCCC" + (x++)));
		list.add(new Wheels("CCCC" + (x++)));
		Wheels w3 = (Wheels) list.get();
		System.out.println(w3.get��̥());
		
		list.add(2, (new Wheels("CCCC" + (x++))));
	}

}
