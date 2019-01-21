package cf.tilgiz;

public class Person {
    public int height;

    Person(){}

    Person(int height){
        this.height = height;
    }

    void say2(String name){
        System.out.println("Hello, " + name);
    }
}
