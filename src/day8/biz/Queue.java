package day8.biz;

//队列	FIFO
public class Queue<T> {

	private int maxSize = 16; // 默认的容量
	private int first = -1; // 队头
	private int last = -1; // 队尾

	private Object[] datas; // 数据的容器，装对象


	public Queue() {
		datas = new Object[maxSize];
	}

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		datas = new Object[maxSize];
	}

	// 取得当前对象的数量
	public int size() {
		int s = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] != null) {
				s++;
			}
		}
		return s;
	}

	// 可用的数量
	public int canUse() {
		return maxSize - size();
	}

	// 添加数据 ：队列只能在队尾添加数据
	public boolean add(T obj) {
		// 空队列
		if (size() == 0) {
			this.first = 0;
			this.last = 0;
			datas[0] = obj;
		} else {
			// 满了没有
			if (size() == maxSize) {
				System.err.println("队列已满");
				return false;
			} else {// 还有空位
				if ((last + 1) == maxSize) {// 如果还有空位，但last已经在队尾。再添加数据要到0（掉头哦）
					last = 0;
					datas[last] = obj;
				} else {
					datas[++last] = obj;
				}
			}
		}
		return true;
	}

	// 出队
	public T get() {

		Object rtVal = null;
		// 有数据
		if (size() > 0) {
			rtVal = datas[first];
			datas[first] = null;

			// 当last小于first(last已经掉头过了），且first在队尾，发生出队first也要掉头
			if (last < first && (first + 1) == maxSize) {
				first = 0;

			} else {
				first++;
			}
		}
		return (T) rtVal;

	}

}
