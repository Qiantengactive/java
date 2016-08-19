package java_Class;

public class NumbercClass {
//八种包装类
//Boolean Charscter父类是Object,其他类继承自number
	
// 	字符串===>转基本类型
	public void parseIntMethod(){
// 	Integer.parseInt(str);方法
		String str="12345";
		System.out.println(Integer.parseInt(str));
	}
//	字符串===》基本数据类型
	public void parseBooleanMethod(){
//		Boolean.parseBoolean() 方法
		String str2="false";
		boolean b=Boolean.parseBoolean(str2);
		System.out.println("str3是"+b);
	}
//	包装类
//	基本类型==》包装类 静态方法valueOf()
	Integer i=Integer.valueOf(1);
	Double d=Double.valueOf(1.1);
//	包装类==》基本类型   xxxValue();
//	intValue()\doubleValue()
	Integer i2=new Integer(1);
	int n=i2.intValue();
	Double d2=new Double(1.1);
	double d2n=d2.doubleValue();
	
	public static void main(String[] args) {
		
	}
}
