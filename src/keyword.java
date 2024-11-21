// super , final ,this  keyword


//?   final cant override  or cant change the value
//class father{
//    final char gender='M';
//    int age=50;
//    final void print(){
//        System.out.println("This is father");
//    }
//}
//
//class daughter1 extends father{
//    char gender='F';
//
//    void print(){
//        System.out.println("");
//    }
//}

// ? super keyword

//class fatherr1{
//    char gender ='M';
//
//    void print(){
//        System.out.println("This is father");
//    }
//}
//
//class mother1 extends fatherr1{
//    char gender='F';
//
//    void print(){
//        super.print();
//        System.out.println(super.gender);
//    }
//}
//?  this keyword
class fat {
    char gender;
    int age;


    void print(char gender, int age) {
        this.gender = gender;
        this.age = age;
    }
}

class keyword {
    public static void main(String[] args) {
//        fatherr1 F=new fatherr1();
////        System.out.println(F.gender);
//        F.print();
//
//        mother1 M=new mother1();
//        M.print();


        fat ob = new fat();
        ob.print('m', 50);
        System.out.println(ob.gender);
        System.out.println(ob.age);
    }
}
