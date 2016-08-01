package 运算表达式;

public class 优先级 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int a=6
    		int i=2;
//    		 5+i--;
//    		 System.out.println(i--+5); //7  
    		 System.out.println(--i+5); //7  
    		 System.out.println(i);
    		 	int x=5,y=6;
    		 	System.out.println(y+--x*y++ + y);  //6  4*6+7   //37
	}

}
