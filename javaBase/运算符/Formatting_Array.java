package javaBase.运算符;

public class Formatting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//%f 格式化浮点类型数据
//		%d 格式化整数类型的数据
//		%s 格式化字符串类型的数据
//		%c 可以格式化字符串类型的数据
		
			//格式化文本
			//格式转化
			 float fnum1=3.141592654653464643f; 
			 int number=1234;
			 System.out.printf("bnumber=%8d,%f",number,fnum1);    
			//(bnumber=    1234,3.141593)
			 System.out.printf("bnumber=%8d,%f",number,fnum1);    
			//(abnumber=    1234,3.141593)
			 System.out.printf("anumber=%08d,%f",number,fnum1);   //(abnumber=00001234,3.141593)
			 System.out.printf("anumber=%-8d,%f",number,fnum1);   //(abnumber=1234    ,3.141593)
			//报错
			//System.out.printf('anumber=%-08d,%d',number,fnum1);
			 System.out.printf("%08.3f",fnum1); //格式化                          
			//(0003.142)
			 System.out.printf("%-8.3f",fnum1); //格式化    
			 //(3.142   )
			 System.out.println(fnum1); //格式化                                              //(3.1415927)

	}

}
