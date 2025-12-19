public class SecMin{
	public static void main(String[] args){
		int[] arr = {2,3,0,4,6};
		int firstmin =  arr[0];
		int secondmin = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<firstmin){
				secondmin = firstmin;
				firstmin = arr[i];
			}
		}
		System.out.println("The first minimum of the array"+firstmin);
		System.out.println("The Second minimum of the array"+secondmin);
	}
}