public class SecMax{
	public static void main(String[] args){
		int[] arr = {22,33,11,55,44};
		int first = arr[0];
		int second = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>first){
				second = first;
				first = arr[i];
			}
			else if(arr[i]<first || arr[i]!=first){
				second = arr[i];
			}
		}
		System.out.println("The First Largest element of the array"+" "+first);
		System.out.println("The Second Largest element of the array"+" "+second);
	}
}