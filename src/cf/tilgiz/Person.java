package cf.tilgiz;

class Person {
    int height;
    String name;

    Person(){}

    Person(int height){
        this.height = height;
    }

    Person(String name){
        this.name = name;
    }

    void say2(String name){
        System.out.println("Hello, " + name);
    }
}
