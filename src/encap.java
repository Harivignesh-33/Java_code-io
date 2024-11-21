public class encap {
//    encapsulation
//    use of class is encapsulation
//    encapsulated all it related infos
}

class bank {
    String name;
    private int balance=100;

    bank() {

    }

    public int getBalance() {
        return balance;
    }

    void display() {
        System.out.println(name);
        System.out.println(balance);
    }
}

class Mainn {
    public static void main(String[] args) {
//        access modifiers is used to hide data in abstraction
        bank obj = new bank();
        System.out.println(obj.getBalance());

    }
}




