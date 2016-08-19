package java_Class;

public class equalsMethod {
	/*     boolean equals重写时返回boolean值，表示是否相等
	 *	Object原码：
	 *public boolean eqauls (Object obj){
	 *      return(this==obj);
	 *   }
	 *   重写原则：
	 * 		1.	任何对象与null比较都应返回false 
	 *		2.	两个对象不属于同一个类时应返回false 
	 *		3.	同一个对象equals比较应当恒等为true 
	 *
	 *
	 */
	String name;
	int age;
	public  boolean equal(Object obj){
		if(obj==null){
			return false;
		}if(this==obj){
			return true;
		}if(obj instanceof equalsMethod){
			equalsMethod equalsMethod=new equalsMethod();
			return this.name==equalsMethod.name&& this.age==equalsMethod.age;
		}
//		==判断是不是一样相等 值比较 	  引用类型变量而言  
//		            判断地址是不是一样 两个变量引用是不是同一个对象
//		equals判断像不像      内容比较 	 引用类型变量而言  判断两个变量所引用的对象是不是一致
		return false;
	}
	
	
}
