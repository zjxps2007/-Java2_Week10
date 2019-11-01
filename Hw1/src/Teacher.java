public class Teacher extends Person{
    private int age;

    public Teacher(int i, String n, int a) {
        super(i,n);
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return (super.toString() + " Age: "+age);
    }
}
