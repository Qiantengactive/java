package 运算表达式;

public class day05取余数算数运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//先除 再取余数
		System.out.println(1%5);
		System.out.println(2%5);
		System.out.println(3%5);
		System.out.println(4%5);
		System.out.println(5%5);
		System.out.println(6%5);
		System.out.println(7%5);
		System.out.println(8%5);
		System.out.println("8%-5="+(8%-5));  //3
		System.out.println("-8%-5="+(-8%-5));   //-3
		System.out.println("-8%5="+(-8%5));   //-3
		
		System.out.println(5.0%4.0);       //1.0
		System.out.println(5%4.0);         //1.0
		System.out.println(5%4);           //1
//整数对0     报错   因为0是整数 在整数中除0报错  	
//		System.out.println(5%0);          //报错
//		浮点数除以0  返回无穷大     
		System.out.println(5%0.0);          //NaN
		System.out.println(5.0%0);          //NaN
		System.out.println(5.0%0.0);        //NaN
		System.out.println(9d%0);           //NaN
//		char a='霍';
	}

}
