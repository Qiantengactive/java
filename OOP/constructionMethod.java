package OOP;

public class constructionMethod{
  /**
   * 构造方法
   * 1.方法名与类名必须一致
   * 2.没有返回值，不能写返回值类型，不能写viod
   * 访问修饰符 类名(){
   *    方法体
   * }
   * 重点********
   * 注意：任何一个类必须含有构造方法 如果程序没有定义；则编译器编
   *    译时默认定义一个参数为空的构造方法 称之为默认的构造方法
   *    如果写了传参的构造方法，那么系统偷懒不会默认创建一个空的构造方法需要你自己去出创建
   * @param args													
   */
//	构造方法重载
	int age;
	public constructionMethod(int age,int date){
           age=19;
           age++;
		
	}
	public constructionMethod(){
		
	}
	public constructionMethod(int age){
		/*成员变量*/this.age=age;/*参数*/
		age++;/*成员变量*/
		
	}
	
	public constructionMethod(String name){
		
	}
	public constructionMethod(String name,int age){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     createMethod cre=new createMethod("zhangsan");
		constructionMethod cell=new constructionMethod();//constructionMethod is undefined
	}
 
}
