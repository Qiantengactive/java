package 运算表达式;

public class day05关系运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//关系运算 比较运算
//		< <=  ==  =赋值运算 ==比较 运算（等价运算） 二元运算
		int num7=7;
		int num8=8;
//关系表达式有返回结果 且结果为boolean类型
//		num7 < num8;   
		System.out.println(num7<num8);
//		浮点数不能进行精确比较
		//2147483647
		int nu7=0x7fffffff;   //0111 1111 1111 1111...  
		int nu8=0x7ffffff0;     
		float a=nu7;        	//转化为浮点数
		float b=nu8;			//转化为浮点数
		
		//关系表达式有结果，且结果为boolean类型
		System.out.println("nu7 == nu8:"+(nu7 == nu8));   //
		//关系表达式有结果，且结果为boolean类型
		System.out.println("a == b:"+(a == b));    //
	
//两个字符串的比较不要使用== 而是要使用equals方法
		String str1="helloWorld";
		String str2=new String("helloWorld");
		System.out.println("str1="+str1);		 //str1=helloWorld
		System.out.println("str2="+str2);        //str2=helloWorld
		System.out.println(str1==str2);          //false
		System.out.println(str1.equals(str2));   //true
		
   }
}
