package Loop_Statement;
/**
 * break continue return 
 * return 语句的作用
 *     (1) return 从当前的方法中退出,返回到该调用的方法的语句处,继续执行。
 *     (2) return 返回一个值给调用该方法的语句，返回值的数据类型必须与方法的声明中的返回值的类型一致。
 *     (3) return后面也可以不带参数，不带参数就是返回空，其实主要目的就是用于想中断函数执行，返回调用函数处。
 *  continue 语句的作用
 *     （1）break在循环体内，强行结束循环的执行，也就是结束整个循环过程，
 *     		不在判断执行循环的条件是否成立，直接转向循环语句下面的语句。
 *     （2）当break出现在循环体中的switch语句体内时，其作用只是跳出该switch语句体。
 *   
 *   
 * @author QT
 *
 */ 
public class breakAndReturnAndContine {
    public static void main(String[] args) {
//    	boolean boo=false;
//    	for(int i=0;i<5 && !boo;i++){
//    		for(int j=0;j<10;j++)
//    			if(j==4){
//    				boo=true;
//    				break;
//    			}
//    	}
    	circle:
    	for(int i=0;i<5;i++){
    		for(int j=0;j<10;j++){
    			System.out.println("我是j"+j);
    			if(j==4){
    				break circle;
//    				break;
    				}
    		}
    		System.out.println();
    	}
		
	}
}
