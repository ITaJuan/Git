package day8.pojo;

        
public   class  Student  {
	
     private String stuName;
     private int  stuAge;
     private int hashCode;
     
     public      Student(){
    	 java.util.Random r = new java.util.Random();
    	 hashCode = r.nextInt(10000);
     }
     
     /*  @Override
     public int hashCode() {
    	return hashCode;
    }
     
    @Override
    public String toString() {
    	    return     "ѧ����@" + hashCode();
    }*/
     
     
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
     
	//�ӷ�
	public int �ӷ�(int a,int b){
		return a+b+1;
	}
	
	
	//����
	public int ��������ʾ�Ĵ���(double x,double y,double z){
		   {
		   Double  k=0d,j=0d;
		       if(( x>3 ) && ( z<10 ))
		       {
		             k=x*y-1;     //����1
		                 j= java.lang.Math.sqrt(k);
		        }
		       if(( x==4 ) || ( y>5 ))
		      {
		            j=x*y+10;     //����2
		      }
		       j=j%2;             //����3
		       return j.intValue();
		  }

     
	}
	 
	//Debug���ԣ�  F5�����뱻���õĴ����ڲ�  ,F6:����������һ���������ߣ�F7ֱ�ӵ�Return
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu.��������ʾ�Ĵ���(1, 2, 3));
	}
}
