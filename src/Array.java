public class Array {
    public static void main(String[] args) {
//      declaring an array
        int[] rollno =new int[5];

//      initializing an array , index value start from 0 zero
        rollno[0]=1;
        rollno[4]=6;
        System.out.println(rollno[0]);

//      if we couldn't initialize a value for the array then  it will assign 0 for it
        System.out.println(rollno[2]);
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(rollno[i]);
        }
    }
}
