package cf.tilgiz;

class Student extends Person{
    private int course;

    Student(int height, String name, int course){
        super (height, name);
        this.course = course;

    }

    void tell(){
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }
}
