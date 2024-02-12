public class methodadd {
    public static void main(String[] args) {


        int result = add(23,27);
        System.out.println(result);

    }
    public static void add(){
        int num1 = 23;
        int num2 = 27;
        int result = num1 + num2;
        System.out.println(result);
    }
    public static int add(int a,int b){
        int result = a + b;
        return result;
    }

}
