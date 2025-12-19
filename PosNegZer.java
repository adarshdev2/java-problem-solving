public class PosNegZer {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 4, 0};

        int zerocount = 0;
        int poscount = 0;
        int negcount = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            if (n < 0) {
                negcount++;
            } else if (n == 0) {
                zerocount++;
            } else {
                poscount++;
            }
        }

        System.out.println("The count of negative " + negcount);
        System.out.println("The count of zero " + zerocount);
        System.out.println("The count of positive " + poscount);
    }
}
