abstract class Computer{
    abstract void turnOff();
    abstract void turnOn();
    }

class mouse extends Computer{
    void turnOff(){
        System.out.println("Turning off");
    }void turnOn(){
        System.out.println("Turning on mouse");
    }
}

class cpu extends Computer{
    void turnOn(){
        System.out.println("Turn on -1");
    }
    void turnOff(){
        System.out.println("Turning off");
    }
}

class Abstract{
    public static void main(String[] args) {
        mouse obj=new mouse();
        obj.turnOn();
        obj.turnOff();


        cpu ob=new cpu();
        ob.turnOn();
        ob.turnOff();
    }
}
