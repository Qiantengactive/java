package java_Class;

import java.util.Arrays;


public class RegualExpression {
/**
 * "." 任意一个字符
 * "\"
 * \d  	\D  
 * \w	\W
 * \s	\S
 * []    范围 [abc]a或b或c 	[123]
 * "*"	  0-若干
 * "+" 	  1次以上
 * "?"    0-1次
 * 
 * {n}		n次
 * {n,m}    n-m
 * {n，}    至少n次
 * 
 * 分组();   (+86|0086);
 * 
 * "^" "$"    "\w{8,10}$"
 * 
 */
	public static void main(String[] args) {
//matches()方法
	  String emailRegex="^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
	  String email="bjliyi@hpe.com.cn";
	  System.out.println(email.matches(emailRegex));
//split()方法  
//	  1.传入一个字符串描述正则表达式
//	  2.描述的字符串规则匹配当前字符串，按照规则拆分
	  String str="java,c,vb,javasctipt,html";
	  String[] array=str.split(",");
	  System.out.println(Arrays.toString(array));    //[java, c, vb, javasctipt, html]
	  
//replaceAll()方法
//	  String replaceAll(String regex,String replacement);
//	 				 一个人用字符串描述的增则表达式    需要替换的字符串
	  String str1="abc123bcf23242bdsifk23453basdfask432";
	  str1=str1.replaceAll("\\d+","数字");
	  System.out.println(str1);   //abc数字bcf数字bdsifk数字basdfask数字
	  
	  
	  
	}
	
}
