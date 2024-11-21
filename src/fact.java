public class fact {
    public static void main(String[] args) {
        int n =5;
        int result = 1;
        factorial(n, result);
    }

    public static void factorial(int n, int result) {
//      ?  base case
        if (n == 1 || n == 0) {
            System.out.println("The factorial value is :" + result);
            return;
        } else {   //! recursive case
            factorial(n - 1, n * result);
        }
    }
}
