package ������ʽ;

public class day05�߼������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�߼������
//	&
//	|
//	&&   ��:ȫ��Ϊ��<=>��ֻҪ��һ��Ϊ�٣����Ϊ�٣�
//	||   ��ȫ��Ϊ��<=>��ֻҪ��һ��Ϊ�棬���Ϊ�棩
//	!    ��:�Ǽټ��� �����漴��
		int num9=10;
		int num10=10;
		boolean result1=(num9>11) && (num10<50) && (num10>5);
		boolean result2 = (num9>11) || (num10 <50);
		System.out.println(result1);
		System.out.println(result2);
		
//	֧�ֶ�·���㣺&& ||
//	��֧�ֶ�·����ģ�&   |
		System.out.println(num9<11 && ++num10<50); //true
		System.out.println(num10);                  //10
		
		System.out.println(num9>11 & ++num10<50);   //false
		System.out.println(num10);
	}

}
