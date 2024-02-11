public class highestnum {
    public static void main(String[] args) {

        int[] arr = {4, 85, 74, 33, 212};
        System.out.println(arr.length);
        int s=arr[3]; //33,85,212
        for(int i=0;i<arr.length;i++){
            if(arr[i]>s){
                s=arr[i];
            }
        }
        System.out.println(s);
    }
}