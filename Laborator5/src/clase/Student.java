package clase;

public class Student extends Persoana {
    int grupa;

    public Student(String nume, String prenume, int grupa) {
        super(nume, prenume);
        this.grupa = grupa;
    }

    public Student() {
        super("", "");
        this.grupa = 0;
    }

    @Override
    public String toString() {
        return "Student{" + "nume=" + nume + ", prenume=" + prenume + ", grupa=" +
                grupa + '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    @Override
    public boolean equals (Object o) { //pentru a verifica pe continut, nu pe referinte
        if (o == null)
            return false;
        Student student = (Student) o;
        return grupa == student.grupa && nume.equals(student.nume) && prenume.equals(student.prenume);
    }
}