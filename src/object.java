public class object {
    String name;
    int Roll_no;

    void display() {
        System.out.println("Your name is :" + name);
        System.out.println("Your Roll_no is :" + Roll_no);
    }
//  ?  setter function ...
    public void setValues(String str,int num){
        name =str;
        Roll_no=num;
    }
}

class Main {
    public static void main(String[] args) {
        object hari = new object();
        hari.Roll_no = 33;
        hari.name = "Hari_vi";
        hari.display();

//      ! creating another object
        object viewer =new object();
        viewer.name="arun";
        viewer.Roll_no=32;
        viewer.display();

//!    creating objects using set values...
        object set = new object();
        set.setValues("vig",19);
        set.display();
    }
}
