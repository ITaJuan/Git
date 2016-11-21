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
    	    return     "学生类@" + hashCode();
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
     
	//加法
	public int 加法(int a,int b){
		return a+b+1;
	}
	
	
	//调试
	public int 做测试演示的代码(double x,double y,double z){
		   {
		   Double  k=0d,j=0d;
		       if(( x>3 ) && ( z<10 ))
		       {
		             k=x*y-1;     //语句块1
		                 j= java.lang.Math.sqrt(k);
		        }
		       if(( x==4 ) || ( y>5 ))
		      {
		            j=x*y+10;     //语句块2
		      }
		       j=j%2;             //语句块3
		       return j.intValue();
		  }

     
	}
	 
	//Debug调试：  F5：进入被调用的代码内部  ,F6:按正常运行一步步往下走；F7直接到Return
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu.做测试演示的代码(1, 2, 3));
	}
}
