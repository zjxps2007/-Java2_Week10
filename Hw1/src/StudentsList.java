public class StudentsList extends PersonList{
    private Student[] sts; //stu 배열선언
    private int number;  //배열에 있는 객체수
    //생성자
    public StudentsList(){
        sts = new Student[20];
        number = 0;
    }
    public StudentsList(int n) {
        sts = new Student[n];
        number = 0;
    }
    public Student StudentsAt(int i) {
        return sts[i];
    }
    public int length() {
        return number;
    }

    //학생추가 메소드
    public void append(Student s) {
        if(number >= sts.length) {
            System.out.println("Error");
        }
        else {
            sts[number] = s;
            number ++;
        }
    }

    public Student getByName(String nm) {
        for(int i = 0; i<number;i++) {
            if(sts[i].getName().equals(nm)) {
                return sts[i];
            }
        }
        return null;
    }
    public Student getById(int id) {
        for(int i = 0; i<number;i++) {
            if(sts[i].getId()==id) {
                return sts[i];
            }
        }
        return null;
    }
    //출력 메소드
    public void print(){
        for(int i=0; i<number;i++) {
            System.out.println(sts[i]);
        }
    }
    //교환 메소드
    private void swap(int i, int j) {
        Student temp = sts[i];
        sts[i] = sts[j];
        sts[j] = temp;
    }
    //학번으로 정렬
    public void sortByid(){
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (sts[i].getId() > sts[j].getId()) {
                    swap(i, j);
                }
            }
        }
    }
    //성적순으로 정렬
    public  void sortByScore(){
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (sts[i].getScore() < sts[j].getScore()) {
                    swap(i, j);
                }
            }
        }
    }
    //전체 학생 평균 메소드
    public double average(){
        double sum = 0;
        for(int i = 0;i<number;i++) {
            sum += sts[i].getScore();
        }
        return sum/number;
    }
    //배열을 역순으로
    public void reverse() {
        int half = number/2;
        for(int i=0;i<half;i++) {
            swap(i,number-1-i);
        }
    }
}
