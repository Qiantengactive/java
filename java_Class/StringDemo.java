package java_Class;

public class StringDemo {
	public static void main(String[] args) {
//		放于常量池（方法区）
		String str="hello";
		String str2="中国";
		String  str3="abc";
//		String str4=new String("abc");
		
//		String str=new String("hello");
//charAt()	
//		System.out.println(str.charAt(100));
//		 java.lang.StringIndexOutOfBoundsException 字符串越界
/*		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}		
		char ch=str.charAt(0);
		System.out.println(ch);
*/
//indexOf()		
//		indexOf查找特定内容在原字符串 中
//		第一次出现的位置  字符串出现的索引从零开始
//		没找到返回-1
		int index=str.indexOf('h');
		//返回新的字符串  数值转化为字符串
//		int index=str.indexOf(97);
		if(index==-1){
			System.out.println("没找到");			
		}
		System.out.println(index);

//indexOf(int ch,int fromIndex);  //从第几个算起
		int index1=str.indexOf('l',1);
		System.out.println("index1 is"+index1);  //index1 is2
	    index1 =str.indexOf("ll");	 
	    System.out.println(index1);    //2
	    index1 =str.indexOf("ll",3);	 
	    System.out.println(index1);   //-1
	   
	   String hello="hello";
	   int index12=hello.lastIndexOf('o');
	   System.out.println("index12 is"+index12);  //index12 is4
	   
	   String str1="www.baidu.com.cn";
	   int index3=str1.indexOf('.');
	   int index2=str1.indexOf('.',index3+1);
	   
//substring()  字符串长度 含头不含未
//	   String str4=str1.substring(index3+1,index2);
	   
//	   str4=str1.substring(0);  //www.baidu.com.cn
//	   System.out.println(str4);
	   
	   String str5=str1.substring(5);
	   System.out.println(str5);   //aidu.com.cn
	   
//trim()方法  去除字符串两端的空白字符
	   String str7="     我。。。。dew.....你";
	   str7=str7.trim();
	   System.out.println(str7);  //我。。。。dew.....你
	   
//startsWidth/endsWisth()  是否是以....开头
//	   str7.startsWith("我");  //返回boolean
//	   System.out.println(str7.startsWith("我"));
//	   System.out.println(str7.endsWith("你"));
	   
//length()	字符串个数 长度
//		System.out.println(str2.length());
				
//		String str2="hello";
//		for(int i=0;i<10000000;i++){
//			str+="a";
//		}
//		System.out.println("结束了");
	   
//	   equals  引用类型==比较地址
	   String stra="abc";
	   String stra2=new String("abc");
	   System.out.println(stra=stra2);
	   
	   System.out.println(stra.equals(stra2));
	   
//toLpwerCase() toUpperCase()	   
	   String stra3=stra.toLowerCase();  //hello
	   String stra4=stra.toUpperCase();	 //HELLO
	   
	   double d=3.1415926;
	   String str6="aaaaa";
	   str6=str6.valueOf(d);   //转化为字符串
	   System.out.println(str6);
//	concat
	   String str71="flag";
	   String str8=str71.concat("hello");
	   System.out.println("str8 is"+str8);//str8 isflaghello
	   
	}
}
