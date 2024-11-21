class Animal {
    int no_leg = 4;
    public static void eat() {
        System.out.println("am eating");
    }
    public static void walk() {
        System.out.println("am walking");
    }
}

class Dog extends Animal {
    boolean bark = true;

}
class Cat extends Animal{

}

class Call {
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.no_leg);
        System.out.println("THis is animal");
        obj.eat();
        obj.walk();
        System.out.println();
        Dog obj2 = new Dog();
        System.out.println("this is dog");
        System.out.println(obj2.bark);
        obj2.eat();
        obj2.walk();
        System.out.println();
        Cat  obj3 =  new Cat();
        System.out.println("THis is cat");
        obj3.eat();
        obj3.walk();

    }
}