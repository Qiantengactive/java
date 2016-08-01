package 运算表达式;

public class day05除法算数运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float num1=3;
			int num2=2;
			char num3='霍';
			int num4=(int) num3;      
			System.out.println(num4);    //38669
			System.out.println(num1/num2);//1.5
//对0取余问题总结
//整形数据除以零         报错              整数不能除以0
//浮点数除以零            不报错       	 返回无穷大
//char类型数除以零  报错              不能除以0
//			System.out.println(num2/0);    //报错
			System.out.println(num1/0);
			System.out.println("num1/-1="+(num1/-1));   //3.0
//			System.out.println(num3/0);
//			System.out.println(num4/0);
//零除以浮点数
	}

}
