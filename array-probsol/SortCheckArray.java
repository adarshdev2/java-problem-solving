public class SortCheckArray{
    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {22,33,44,55,33};
        int[] arr1 = {1,2,3,4,5};
        if(isSorted(arr) && isSorted(arr1)){
            System.out.println("The array is sorted!");
        }
        else{
            System.out.println("The array is not sorted!");
        }

    }
}