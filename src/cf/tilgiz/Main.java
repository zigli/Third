package cf.tilgiz;

public class Main {

    public static void main(String[] args) {
	    say();
	    Person vitya = new Person(180);
	    vitya.say2("ilgiz");
        System.out.println(vitya.height);
        Person zigli = new Person(120);
        System.out.println(zigli.height);
        Person slava = new Person();
        slava.height = 150;
    }

    static void  say(){
        System.out.println("Test");
    }
}
