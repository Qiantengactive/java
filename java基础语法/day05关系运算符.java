package ������ʽ;

public class day05��ϵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��ϵ���� �Ƚ�����
//		< <=  ==  =��ֵ���� ==�Ƚ� ���㣨�ȼ����㣩 ��Ԫ����
		int num7=7;
		int num8=8;
//��ϵ���ʽ�з��ؽ�� �ҽ��Ϊboolean����
//		num7 < num8;   
		System.out.println(num7<num8);
//		���������ܽ��о�ȷ�Ƚ�
		//2147483647
		int nu7=0x7fffffff;   //0111 1111 1111 1111...  
		int nu8=0x7ffffff0;     
		float a=nu7;        	//ת��Ϊ������
		float b=nu8;			//ת��Ϊ������
		
		//��ϵ���ʽ�н�����ҽ��Ϊboolean����
		System.out.println("nu7 == nu8:"+(nu7 == nu8));   //
		//��ϵ���ʽ�н�����ҽ��Ϊboolean����
		System.out.println("a == b:"+(a == b));    //
	
//�����ַ����ıȽϲ�Ҫʹ��== ����Ҫʹ��equals����
		String str1="helloWorld";
		String str2=new String("helloWorld");
		System.out.println("str1="+str1);		 //str1=helloWorld
		System.out.println("str2="+str2);        //str2=helloWorld
		System.out.println(str1==str2);          //false
		System.out.println(str1.equals(str2));   //true
		
   }
}
