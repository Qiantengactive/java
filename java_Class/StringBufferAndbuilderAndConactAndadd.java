package java_Class;

public class StringBufferAndbuilderAndConactAndadd {
	public static void main(String[] args) {
//conact	String的方法 重载了+的操作 	拼接字符串
		String str="flag";
		String str2=str.concat("hello");
		System.out.println(str2);  //flaghello
//+			拼接字符串或者其他类型
		for(int i=0;i<10000;i++){
			str+="a";
		}
/**
 *string的+号操作符是通过StringBuilder或
 *StringBuffer(可以通过反汇编class文件，看到使用的S
 *tringBuilder来实现的。)  
 */
//StringBuilder StringBuffer
//		   StringBuilder（安全）	
//		   StringBuffer效率高（线程不安全）  改变原有对象 不会创建新的对象 +号不适合用
//		   	增append 
//			删delete 
//			改replace 
//			查(插)insert 
//			reverse()反转
		   StringBuilder sb=new StringBuilder("abc");
		   sb.append("hello");
		   System.out.println(sb);   //abchello
		   sb.insert(5, "B"); 
		   System.out.println(sb);   //abcheBllo
		   sb.delete(5, 6);     //描述删除字符串返回
		   System.out.println(sb);   //abchello
		   sb.replace(0, 5, "wocao");
		   System.out.println(sb);   //wocaollo
		   System.out.println(sb.reverse()); //olloacow
		   
		   //链式操作  return this
		   sb.append("a").append("b").append("c").length();
	}
}
