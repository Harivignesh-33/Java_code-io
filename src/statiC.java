class father1{
    static char gender='M';
       static void  display(){
           System.out.println("this is father");
       }
}

class D extends father1{

}

class statiC{
    public static void main(String[] args) {
        father1.display();
// if a static  keyword is used we can use that without creating any extra objects
        System.out.println(father1.gender);
    }
}