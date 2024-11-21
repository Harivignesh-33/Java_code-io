public class poly {
    public static void main(String[] args) {
        method obj=new method();
        obj.min(2,6);
        obj.min(4);
        obj.min(1,2,3);

    }
}

// if a  function have many forms  within a single name  and different param is called as method overloading
class  method{
//    !method  overloading
    void min(int a,int b){
        if(a<b){
            System.out.println("a is the minimum number");
        }
        else {
            System.out.println("b is the minimum number");
        }
        }
    void min(int a){
            System.out.println("a is printed :"+a);
    }

    void min(int a,int b,int c){
        System.out.println("3 parameters");
    }
}

