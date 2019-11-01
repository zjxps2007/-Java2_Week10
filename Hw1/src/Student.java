public class Student extends Person{
    private int score;
    private  Teacher advisor;

    public Student(int i, String n, int sc) {
        super(i,n);
        score = sc;
    }

    public int getScore() {
        return score;
    }

    public void changeScore(int sc) {
        score = sc;
    }

    public void setAdvisor(Teacher t) {
        advisor = t;
    }

    public Teacher getAdvisor() {
        return advisor;
    }

    public String toString() {
        return (super.toString() + " Score: "+score);
    }
}
