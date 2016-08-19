package OOP;

public class membrMethod {
/**
 * （成员方法静态和非静态成员）
 * 判断静态或者非静态通过static关键字区分
 * 静态成员：
 *   有static为静态成员方法
 *   静态成员方法不能直接方法类的静态成员变量或非静态成员方法的
 * 非静态成员：
 *   没有static声明
 *     非静态成员可以直接使用非静态成员变量
 *                也可以使用静态成员方法
 *                  
 *                  
 *                  
 *         1. 静态成员变量和静态成员方法都是属于类而
 *             不是某一个具体实例的，静态成员（包括属
 *             性和方法）是在类加载阶段就已经初始化了
 *             的，所以当某一个实例访问静态成员的时候，
 *             静态成员肯定是已经存在了的，所以可以访问。
 *         2.反过来，如果让静态方法去访问实例成员那就不
 *         行了，因为实例成员的初始化在静态成员之后
 * @param args construction
 */
	//声明
	int channe1;
	int volumeLeval;
	boolean on;
	
	public void turnOn(){
//		on=true;
		boolean on =true;
		System.out.println("打开电视");
	}
	public void turnOff(){
		if(on){
			on=false;
		}
		System.out.println("关闭电视");
	}
	public void channe1Up(){
		channe1++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       System.out.println(on);
//       turnOn();
       membrMethod aga=new membrMethod();
       aga.turnOn();
       System.out.println(aga.on);
//       aga.channe1;
       System.out.println(aga.channe1);
       
	}

}
