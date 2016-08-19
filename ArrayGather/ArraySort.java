package ArrayGather;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**数组排序
 * 	1.冒泡排序  小到大
 *  2.sort方法排序 
 */
		int[] arr={12,14,56,7,8,90,3,446};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp;
				    temp=arr[j+1];
				    arr[j+1]=arr[j];
				    arr[j]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		System.out.println(Arrays.toString(arr));
		//使用sort方法遍历
		int[] arr2={12,14,56,7,8,90,3,446};
		Arrays.sort(arr2);
		for(int a=0;a<arr.length;a++){
			System.out.println(arr2[a]);
		}
	}

}
