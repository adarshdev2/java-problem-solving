public class CountEvenOdd{
	public static void main(String[] args){
		int[] arr = {2,1,3,2,8};
		int even = 0;
		int odd = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even = even + 1;
			}
			else{
				odd = odd + 1;
			}
		}
		System.out.println("The count of even numbers in the array"+" "+even);
		System.out.println("The count of odd numbers in the array"+" "+odd);
	}
}