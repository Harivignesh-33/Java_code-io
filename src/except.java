public class except {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//?     basic try catch block in exception
        try {
            System.out.println(a / b);
        } catch (ArithmeticException E) {
            System.out.println("b is  zero");
        }
        System.out.println("helloo");
    }
}
