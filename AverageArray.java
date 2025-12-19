public class AverageArray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		int n = arr.length;
		int avg = sum/n;
		System.out.println("The Average of the array"+" "+avg);
	}
}