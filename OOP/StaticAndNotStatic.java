package OOP;
/**
 * 只需要记住静态调非静态需要new
 * @author QT
 *
 */

public class StaticAndNotStatic{
	String name;
	private static final char sex='女';
	private static int numberOfStudent;
	public StaticAndNotStatic(){
		numberOfStudent++;
	}
//	普通成员方法
	public int getNumberOfStudent(){
		return numberOfStudent;
	}
	public static void getNumberOf(){
	
	}
//	静态成员方法 只能访问静态的数据成员 （静态数据成员，静态常量，静态方法）
	public static void getNumbers(){
//		静态常量
		System.out.println(sex);
//		静态数据常量
		System.out.println(numberOfStudent);
//		静态方法
		getNumberOf();
//	静态方法中 无法直接访问非静态数据成员（对象数据成员） 
		StaticAndNotStatic st=new StaticAndNotStatic();
		st.getNumberOfStudent();
	
	}
	
	public void setNumbers(){
//  非静态成员方法 调用静态成员方法	
		getNumberOf();
		getNumberOfStudent();
	}
	
}
