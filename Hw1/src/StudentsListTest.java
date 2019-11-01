public class StudentsListTest {
    public static void main(String[] args) {
        TeacherList t1 = new TeacherList();
        t1.append(new Teacher(123,"Joo0",40));
        t1.append(new Teacher(234,"Joo1",41));
        t1.append(new Teacher(345,"Joo2",42));
        t1.append(new Teacher(456,"Joo3",43));
        StudentsList c = new StudentsList();

        Student s = new Student(783,"Hank",98);
        s.setAdvisor((Teacher)t1.getByName("Joo0"));
        c.append(s);

        s = new Student(678,"Mike",78);
        s.setAdvisor((Teacher)t1.getByName("Joo0"));
        c.append(s);

        s = new Student(678,"Joseph",83);
        s.setAdvisor((Teacher)t1.getByName("Joo1"));
        c.append(s);

        s = new Student(678,"Susan",96);
        s.setAdvisor((Teacher)t1.getByName("Joo2"));
        c.append(s);

        s = new Student(710,"Flora",64);
        s.setAdvisor((Teacher)t1.getByName("Joo2"));
        c.append(s);

        s = new Student(690,"Cathy",95);
        s.setAdvisor((Teacher)t1.getByName("Joo3"));
        c.append(s);

        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println(c.StudentsAt(2));

        System.out.println("+++++++++++++++++++++++++++++++");

        c.sortByid();
        c.print();

        System.out.println("+++++++++++++++++++++++++++++++");

        c.reverse();
        c.print();

        System.out.println("+++++++++++++++++++++++++++++++");

        c.sortByScore();
        c.print();

        System.out.println("+++++++++++++++++++++++++++++++");

        c.reverse();
        c.print();

        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println(c.StudentsAt(2).getAdvisor().getName());
        System.out.println(c.average());
        System.out.println(Ars.lengthCompare(t1, c));
    }
}