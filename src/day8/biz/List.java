package day8.biz;

//链表 ：双向链表  		集合：对象的容器
public class List {

	private int maxSize;

	private int first = -1;// 表头
	private int last = -1; // 表尾
	private int pos = -1; // 当前位置

	private Object[] datas;

	// 数据之间的链接 datas[0]----->next[0]=1;
	private int next[];

	public List() {
		datas = new Object[maxSize];
		next = new int[maxSize];
	}

	public List(int maxSize) {
		this.maxSize = maxSize;
		datas = new Object[maxSize];
		next = new int[maxSize];
	}

	public int getMaxSize() {
		return maxSize;
	}

	public int size() {
		int x = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] != null) {
				x++;
			}
		}
		return x;
	}

	public int canUse() {
		return maxSize - size();
	}

	// 找到空位
	private int findFreePosi() {
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] == null) {
				return i;
			}
		}
		// 满了
		return -1;
	}

	/*
	 * 插入数据 1.表头插入新数据，新数据对应的next指向原来的first 2.表尾插入新数据，last指向新数据 3.在中间插入新数据，
	 * 3.1.插入位置前面的数据的next指向新数据的位置 3.2.新数据next指向插入位置后面的数据的位置
	 */

	// 默认只从表尾插入数据
	public boolean add(Object obj) {

		// 链表为空
		if (first == -1) {
			datas[++first] = obj;
			last = 0;

		} else {
			// 找空位
			pos = this.findFreePosi();
			if (pos != -1) {
				datas[pos] = obj;
				// 新插入的数据
				next[last] = pos;// 原来最后的数据指向新插入的数据
				last = pos;
			} else {
				System.err.println("链表已满");
				return false;
			}
		}

		return true;

	}

	// 从指定位置插入数据
	public boolean add(int posi, Object obj) {

		// 表尾添加
		if (posi == (this.size() + 1)) {
			add(obj);
		} else if (posi == 0) {
			pos = findFreePosi();
			if (pos > -1) {
				next[pos] = first;
				first = pos;
				this.datas[pos] = obj;
			}
		} else {
			pos = findFreePosi();
			if (pos > -1) {
				this.datas[pos] = obj;
				int tmp = next[posi - 1];
				next[posi - 1] = pos;
				
				//后面的数据逐个next依次往后挪
				for (int i = posi; i < size(); i++) {
					int tmp2=next[i];
					next[i]=tmp;
					tmp=tmp2;
				}
				//last后移
				last++;
			} else {
				System.err.println("链表已满");
				return false;
			}
		}
		return true;

	}
	
	//取得数据,默认first
	public Object get() {
		return datas[first];
	}
	
	public Object get(int posi) {
		int posx=-1;
		if (posi==0) {
			get();
		}else {
			for (int i = 0; i < posi; i++) {
				if (i==0) {
					posx=next[first];
				}else {
					posx=next[i];
				}
			}
		}
		return datas[posx];
	}
	
//	public boolean remove() ;
//	public boolean remove(int posi) ;
}
