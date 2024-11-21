class sam {
    int mark;
    int roll;

    sam(int num, int marks) {
        System.out.println("This is default constructor");
        roll = num;
        mark = marks;
    }
}

class construct {
    //    parameterized constructor
//    non-parameterized constructor
    public static void main(String[] args) {
        sam obj = new sam(33, 56);
        System.out.println(obj.mark);
        System.out.println(obj.roll);
    }
}