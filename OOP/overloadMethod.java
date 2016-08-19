package OOP;

public class overloadMethod {
/**方法重载
 *  1.类中的方法名相同
 *  2.参数列表不同
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student st1=new Student();
       st1.getAge("lier",19);
	}

}
class Student{
	String name;
	int age=20;
	char sex;
//	方法重载
	public int getAge(){
		System.out.println("构造方法中不传递参数"+age);
		return age;
	}
	public void getAge(String name,int age){
		this.name=name;
		this.age=age;
		System.err.println("传参overload中name是"+name+"age是"+age);
	}
	public void pay(double money){
		System.out.println(money);
	}
	public void pay(String id,String pwd,double money){
		System.out.println("zhangsan"+id+"密码是"+pwd+"钱"+money);
	}
	public void pay(String id,double money){
		
	}
}
