package ������ʽ;

public class day05ȡ������������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�ȳ� ��ȡ����
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
//������0     ����   ��Ϊ0������ �������г�0����  	
//		System.out.println(5%0);          //����
//		����������0  ���������     
		System.out.println(5%0.0);          //NaN
		System.out.println(5.0%0);          //NaN
		System.out.println(5.0%0.0);        //NaN
		System.out.println(9d%0);           //NaN
//		char a='��';
	}

}
