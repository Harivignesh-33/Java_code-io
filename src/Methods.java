public class Methods {
    public static void main(String[] args) {
        int res = add(15, 20);
        res *= res;
        System.out.println(res);
        System.out.println("printed");
    }
//    two parts available 1, function definition   2, function calling
//    function in other language is called method in java
//    the function inside a class is called as method   , in java there is no function ,only method is available

    public static int add(int a, int b) {
//      function definition
        return a + b;
    }
}
