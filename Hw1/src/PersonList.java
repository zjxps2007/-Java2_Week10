public class PersonList {
    protected Person[] ps;
    protected int number;

    public PersonList() {
        number = 0;
        ps = new Person[20];
    }

    public PersonList(int n) {
        number = 0;
        ps = new Person[n];
    }

    public int length() {
        return number;
    }

    public Person PersonAt(int i) {
        return ps[i];
    }

    public void append(Person p) {
        if(number >= ps.length) {
            System.out.println("Error");
        }
        else {
            ps[number] = p;
            number ++;
        }
    }

    public Person getByName(String nm) {
        for(int i =0; i < number; i++) {
            if(ps[i].getName().equals(nm)){
                return ps[i];
            }
        }
        return null;
    }

    public void print() {
        for(int i =0; i < number; i++) {
            System.out.println(ps[i]);
        }
    }

    private void swap(int i, int j) {
        Person temp = ps[i];
        ps[i] = ps[j];
        ps[j] = temp;
    }

    public void reverse() {
        int half = number/2;
        for(int i =0; i < half; i++) {
            swap(i,number-1-i);
        }
    }

    public void sortById() {
        for(int i = 0; i < number-1; i++) {
            for(int j = i; j < number; j++) {
                if(ps[j].getId() < ps[i].getId()){
                    swap(i,j);
                }
            }
        }
    }
}
