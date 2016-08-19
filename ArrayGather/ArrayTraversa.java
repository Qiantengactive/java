package ArrayGather;

public class ArrayTraversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 数组遍历 
 * 	 正序数组
 * 	 倒序遍历
 *	 使用for(:){}实现 遍历出每一个arr[i]
 */
//		正序遍历
		int[] arr={1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++){
			System.out.println("arr数组的"+(i+1)+"个是"+arr[i]);
		}
//		倒序遍历
		for(int i=(arr.length-1);i>=0;i--){
			System.out.println("arr数组的"+(i+1)+"个是"+arr[i]);	
		}
		
//		for(int temp:arr){
//			System.out.println(temp);
//		}
//		题来自第五章第一阶段租客问题
			int[] arr2=new int[]{8,2,1,0,3};
			int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
			String tel="";
			for(int i:index){
				System.out.println(i);
				tel+=arr2[i];
				System.out.println("数字"+arr2[i]);
			}
				System.out.println("联系方式"+tel);
	}
}
