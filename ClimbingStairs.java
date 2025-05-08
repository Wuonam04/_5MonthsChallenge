public class ClimbingStairs {
    //This will be solved using the Fibonacci approach which normally is recursive in nature

    //You can either climb 1 or 2 stairs

    public static int steps(int n){
        if(n == 1){
            return 1;   //when we have only one stair case
        }

        int a = 1;
        int b = 1;
        int c = 0;

        //using the bottom up approach

        for(int i = 1; i< n; i++){
            c = a + b;
            a = b;
            b= c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(steps(4));
    }
}
