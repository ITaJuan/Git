package day8.biz;

import java.io.Serializable;

//����ȳ�                            //����J1107Stack
public class J1107Stack<T> implements Serializable {

	//ջ������
	private int maxSize=16;
	//ջ����λ��
	private int top=-1;  //ջΪ��
	//���������
	private Object[] dataStore;
	
	public J1107Stack( ){
		dataStore = new Object[maxSize];     //java�����鲻֧�ַ���
	}
	
	public   J1107Stack(int maxSize){
		this.maxSize =maxSize;
		dataStore = new Object[maxSize];
	}

	//ȡ������
	public int getMaxSize() {
		return maxSize;
	}

     //ȡ��ջ�Ŀ�����
	public int aviSize(){
		return maxSize-top-1;
	}
	
     //��ǰʹ����
	public int useSize(){
		return top+1 ;
	}
	
	//ѹ��ջ
	public void push(T obj) throws MyStackFullEx{
		if((top+1) == maxSize){   //ջ�������׳��쳣
			throw new MyStackFullEx();
		}else{
			dataStore[++top] = obj;
		}
	}
	
	//��ջ
	public T  pop(){
		
		if(top ==-1){   //no data
			System.err.println("no data");
			return null;
		}else{
			return (T)dataStore[top--];
		}
		
	}
	
}



 