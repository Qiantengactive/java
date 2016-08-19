package OOP;
/**
 * 查询
 * 构造方法中的this()总结
 * @author QT
 *
 */
public class constructionMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud st2=new Stud();
		st2.sayHi();
		
       Stud st=new Stud("wangwu",19);
       st.sayHi();
       Stud st3=new Stud("lisi",19,'女');
//       st3.study();
       
       
	}
}
class Stud{
	 String name;
	 int age;
	 char sex;
	 public int getAge(){
		 return age;
	 }
	 //无参数的构造方法
	 public Stud(){
//       this.name="zhangsan";
//       this.age=19;
//       this.sex='男';
	 }
	 public Stud(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
	 public Stud(String name,int age,char sex){
//		 可以输出内容的
		 System.out.println(name+"爱学习,年龄"+age+"性别"+sex);
	 }
	 public void sayHi(){
		 System.out.println("名字"+name+"年龄"+age+sex+age);
	 }
	 public void study(){
		 System.out.println("我爱学习");
	 }
}
