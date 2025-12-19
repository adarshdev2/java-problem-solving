public class SumArray{
	public static void main(String[] args){
		int[] arr = {22,33,44,55,66};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		System.out.println("The sum of the array:"+" "+sum);
	}
}