interface Fatherr{
    abstract void call();
    abstract void toggle();
}

interface  Mother{
    abstract void call();
    abstract void On();
    abstract void toggle();
}


class Interface implements Fatherr,Mother{
    public void call(){
        System.out.println("welcome");
    }

    @Override
    public void On() {
        System.out.println("implements from mother");
    }

    public void toggle(){
        System.out.println("hiii");
    }

    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.call();
        obj.toggle();
        obj.On();
    }

}