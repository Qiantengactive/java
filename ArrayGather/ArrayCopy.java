package ArrayGather;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /**
  *数组复制
  *  1简单复制
  *  2使用system.arraycopy()方法
  *  3使用Arrays.copyOf方法      重新生成数组
  */
//	1基本方法
		int[] numbers4=new int[]{1,2,3,4,5,6,7,8};
		int[] numbers5=new int[numbers4.length];
		
		for (int i = 0; i < numbers5.length; i++) {
			numbers5[i]=numbers4[i];
			
		}
//	2使用Arrays.copyof()方法     
			int[] a = { 10,20 ,30 ,40 ,50 };
			int[] a2 = new int[6] ;
			System.arraycopy( a , 1 , a2 , 0 , 4 );    //a数组的第0个位 复制到a2数组的第1位 共4个元素
			System.out.println("a2数组是"+Arrays.toString(a2));  //[20, 30, 40, 50, 0, 0]
//	3使用Arrays.copyOf()方法	 重新生成数组
			int [ ]  arr = { 10,20,30,40,50 } ;
			int [ ]  arr1 = Arrays . copyOf ( a, 6 );   //(a数组，长度)
			System.out.println("arr1数组是"+Arrays.toString(arr1));
//    	注意
//				生成的新数组是原始数组的副本； 重新生成新数组
//				newLength小于源数组，则进行截取；（自己通过代码演示效果）；
//				newLength大于源数组，则用0或 null进行填充；
			int[] arr2=new int[arr.length];//声明一个新数组
			arr2=Arrays.copyOf(arr, 3);
			for(int temp:arr2){
				System.out.println(temp);
			}

	}

}
