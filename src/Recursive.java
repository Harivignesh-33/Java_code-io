public class Recursive {
    public static void main(String[] args) {
        naturalPrint(6);
    }

    public static void naturalPrint(int n) {
//        Base case
//        if (n == 10) {
//            System.out.println(10);
//        }
////        recursive case
//        else {
//            System.out.println(n);
//            naturalPrint(++n);
//        }
        if(n<=10) {
            System.out.println(n);
            naturalPrint(++n);
        }
    }
}
