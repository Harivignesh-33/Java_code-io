import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        char s = scan.next().charAt(0);
//        float f = scan.nextFloat();
//        System.out.println(n);
//        System.out.println(s);
//        System.out.println(f);
        System.out.print("Enter the string : ");
        String s=scan.nextLine();
        System.out.print("Enter the int : ");
        int n=scan.nextInt();
        System.out.print("Enter the float : ");
        float f=scan.nextFloat();
        System.out.print("Enter the char : ");
        char c=scan.next().charAt(0);

        System.out.println(s);
        System.out.println(n);
        System.out.println(f);
        System.out.println(c);

//        scan.close();

        int i= scan.nextInt();
        System.out.println(i);
    }
}
