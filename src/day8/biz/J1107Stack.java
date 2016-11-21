package day8.biz;

import java.io.Serializable;

//后进先出                            //泛化J1107Stack
public class J1107Stack<T> implements Serializable {

	//栈的容量
	private int maxSize=16;
	//栈顶的位置
	private int top=-1;  //栈为空
	//对象的容器
	private Object[] dataStore;
	
	public J1107Stack( ){
		dataStore = new Object[maxSize];     //java下数组不支持范化
	}
	
	public   J1107Stack(int maxSize){
		this.maxSize =maxSize;
		dataStore = new Object[maxSize];
	}

	//取得容量
	public int getMaxSize() {
		return maxSize;
	}

     //取得栈的可用数
	public int aviSize(){
		return maxSize-top-1;
	}
	
     //当前使用量
	public int useSize(){
		return top+1 ;
	}
	
	//压入栈
	public void push(T obj) throws MyStackFullEx{
		if((top+1) == maxSize){   //栈已满，抛出异常
			throw new MyStackFullEx();
		}else{
			dataStore[++top] = obj;
		}
	}
	
	//出栈
	public T  pop(){
		
		if(top ==-1){   //no data
			System.err.println("no data");
			return null;
		}else{
			return (T)dataStore[top--];
		}
		
	}
	
}



 