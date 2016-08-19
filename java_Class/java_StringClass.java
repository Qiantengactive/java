package java_Class;

public class java_StringClass {
	public static void main(String[] args) {
// length()
	String str="hello";
			System.out.println(str.length());
//charAt(); 获取String类型的第i个字符  下标从0开始
//	System.out.println(str.charAt(5));//越界
	for (int i = 0; i < str.length(); i++) {
		System.out.println(str.charAt(i));
	}
	char ch=str.charAt(0);
	System.out.println(ch);  //h
//indexOf() 用于查找特定内容在原字符串中第一次出现的位置
//	字符串出现的索引从零开始 没找到返回-1
	
	int index=str.indexOf('h');
	int index2=str.indexOf(97);
	
	
	
	
	}
}
