public class TeacherList extends PersonList{
    //필드 변수선언
    protected Teacher[] tcs;
    protected int number;

    public TeacherList() {
        number = 0;
        tcs = new Teacher[20];
    }

    public TeacherList(int n) {
        number = 0;
        tcs = new Teacher[n];
    }

    public Teacher teacherAt(int i) {
        return tcs[i];
    }

    public Teacher getByName(String nm) {
        for(int i = 0; i < number; i++) {
            if(tcs[i].getName().equals(nm))
            return tcs[i];
        }
        return null;
    }

    public int length() {
        return number;
    }

    public void append(Teacher t) {
        if(number >= tcs.length)
            System.out.println("Error");
        else {
            tcs[number] = t;
            number++;
        }
    }

    public void print() {
        for(int i = 0; i < number; i++) {
            System.out.println(tcs[i]);
        }
    }

    private void swap(int i, int j) {
        Teacher temp = tcs[i];
        tcs[i] = tcs[j];
        tcs[j] = temp;
    }

    public void sortByid(){
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (tcs[i].getId() > tcs[j].getId()) {
                    swap(i, j);
                }
            }
        }
    }

    public void reverse() {
        int half = number/2;
        for(int i=0;i<half;i++) {
            swap(i,number-1-i);
        }
    }
}
