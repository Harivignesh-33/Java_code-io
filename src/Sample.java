public class Sample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    break;
                }
                continue;
            }
            System.out.println("the value of i is " + i);
        }

    }
}
