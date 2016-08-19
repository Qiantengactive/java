package java_Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateApi {
public static void main(String[] args) throws ParseException {
//	new Date()获取系统当前时间  
	Date date=new Date();
	System.out.println(date);
//	setTime() 设置需要表示的时间
	int num=1234566;
	date.setTime(num);     //参数为long型
	System.out.println(date);
//	getTime() 获得距离1970年的秒
	long time=date.getTime();    //参数为long型
	System.out.println(time);    
//	Date ==>String
//	 	使用SimpleDateFormat对象转化  格式化时间
//		SimpleDateFormat就是根据一个特定的日期格式在字符串与
//		Date之间相互转换
/*	yyyy=>年
	MM	=>月
	dd	=>日
	E	=》星期
	a	=>上下午 （PM/AM）
	H	=>小时	24小时制
	h	=>小时	12小时制
	m	=>分
	s	=>秒
	*/
	Date date2=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	String str=sdf.format(date2);
	System.out.println(str);
//	String =>Date
	String str3="2016-06-03 10:00:00";
	SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date dateNew=sdf2.parse(str3);
	System.out.println(dateNew);
	
//	Calendar	抽象类
//	根据系统所在的时区获取一个适当的Calendar类 
//	void set(int dield,int value);
//	calendar表示当前系统时间
	
//		getInstance() 获取当前时间
			Calendar cal=Calendar.getInstance();
			System.out.println("cal是"+cal); //只是地址需要使用getTime()获取
			System.out.println(cal.getTime());
//		get()
			int year =cal.get(Calendar.YEAR);
			int month=cal.get(Calendar.MONTH);
			int date1=cal.get(Calendar.DAY_OF_MONTH);
			System.out.println(year+"-"+(month+1)+"-"+date1);
	
//		set() 设置年为2016年
			cal.set(Calendar.YEAR, 2016);
			cal.set(Calendar.MONTH, 7);  //月份从0开始
			cal.set(Calendar.DAY_OF_MONTH,16);
	
			Date date3=cal.getTime();
			System.out.println(date3);
//		add()方法
			cal.add(Calendar.DAY_OF_YEAR,10);
			cal.add(Calendar.MONTH,1);
			Date date4=cal.getTime();   //返回date包
			System.out.println(date4);
//		getActualMaximum()方法   获取时间分量允许的最大值
			Calendar cal2=Calendar.getInstance();
			int max=cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println("当前月份最后一天"+max);
	
	
	
	
}
}
