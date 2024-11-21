class AppForm {
    String name;
    int roll_no;

    public void display() {
        System.out.println("your name is : " + name);
        System.out.println("your Roll_no is : " + roll_no);
    }

    public static void main(String[] args) {
        AppForm hari = new AppForm();   //? new is used to allocate the memory
//?      constructor is  named same as  class name and it is a function
        hari.name =  "Hari";
        hari.roll_no =33;
        hari.display();
    }
}
