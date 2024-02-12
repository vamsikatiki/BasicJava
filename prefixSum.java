public class prefixSum {
    public static void main(String[] args) {
        int[] swapna = {1,3,5,7,9};
        int[] joint = prefixSum(swapna);
        for (int x:joint)
        {
            System.out.println(x);
        }

    }
        public static int[] prefixSum(int[] arr)
        {
            int[]utham = new int [arr.length];
            utham[0]=arr[0];// arr[0]=utham[0]
            for( int i=1;i<utham.length;i++){
                utham[i]=arr[i]+arr[i-1];

            }
            return utham;
        }
}
