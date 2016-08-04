package ArrayGather;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /**
  * 数组复制
  *  1简单复制
  *  2使用arraycopy方法    
  */
		int[] numbers4=new int[]{1,2,3,4,5,6,7,8};
		int[] numbers5=new int[numbers4.length];
		
		for (int i = 0; i < numbers5.length; i++) {
			numbers5[i]=numbers4[i];
			
		}
	}

}
