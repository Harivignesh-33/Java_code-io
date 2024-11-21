class s_inherit {
    public static void main(String[] args) {
//        !single inheritance
//        son obj1 = new son();
//        System.out.println(obj1.gender);
//        obj1.print();

//        ? multi level inheritance
//        son obj2 = new son();
//        System.out.println(obj2.gender);
//        obj2.print();
//
//        Father obj3 =  new Father();
//        System.out.println(obj3.gender);
//        obj3.print();


//!        hierarchical inheritance
//        son obj4 = new son();
//        System.out.println(obj4.gender);
//        obj4.print();
//        daughter obj5 = new daughter();
//        System.out.println(obj5.gender);
//        obj5.print();

//        ?  hybrid inheritance  ( combination of any two type of inheritance )
        granddaughter G=new granddaughter();
        System.out.println(G.gender);
        G.print();

        ggranddaughter g=new ggranddaughter();
        System.out.println(g.gender);
        g.print();
    }
}


class grandfather {
    char gender = 'f';

    void print() {
        System.out.println("grandfather");
    }
}

class Father extends grandfather {
    char gender = 'M';

    void print() {
        System.out.println("Father class");
    }
}

class son extends Father {

}

class daughter extends Father {
    char gender = 'F';
}

class granddaughter extends daughter{

    void print(){
        System.out.println("Grand daughter");
    }

}

class ggranddaughter extends granddaughter{
    @Override
    void print() {
        System.out.println("grand grand daughter");
    }
}


