package 运算表达式;

public class day05逻辑运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//逻辑运算符
//	&
//	|
//	&&   与:全真为真<=>（只要有一个为假，结果为假）
//	||   或：全假为假<=>（只要有一个为真，结果为真）
//	!    非:非假即真 ，非真即假
		int num9=10;
		int num10=10;
		boolean result1=(num9>11) && (num10<50) && (num10>5);
		boolean result2 = (num9>11) || (num10 <50);
		System.out.println(result1);
		System.out.println(result2);
		
//	支持短路运算：&& ||
//	不支持短路运算的：&   |
		System.out.println(num9<11 && ++num10<50); //true
		System.out.println(num10);                  //10
		
		System.out.println(num9>11 & ++num10<50);   //false
		System.out.println(num10);
	}

}
