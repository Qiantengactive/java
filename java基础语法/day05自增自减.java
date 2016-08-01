package 运算表达式;

public class day05自增自减 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//自增自减涉及到隐士转换
	//+= -=;
		short s1=1;
//		s1=s1+1;              //报错因为右边已经转化为int形
		s1+=1;                //运算结果等价情况 s1=(short)(s1+1);
		
		int a=4;
		int a2=a++;               
		//1先使用a的值作为（a++）的返回值
		//2让a自增 a的值为5
		//3（a++）的返回值付给a2
		
		System.out.println(a2);   //4
		System.out.println(a);    //5
//		float n1=3.2f;
//		int num4=
		
		
	}

}
