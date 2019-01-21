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

        Person pasha = new Person("Pasha");
        System.out.println(pasha.name);

        Student mystudent = new Student(130, "Toy", 2);
        System.out.println(mystudent.name);
        System.out.println(mystudent.height);
        mystudent.tell();

    }

    private static void say(){
        System.out.println("Test");
    }
}
