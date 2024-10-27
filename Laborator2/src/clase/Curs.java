package clase;

public class Curs {
    String nume;
    String descriere;
    Profesor profu;
    Student[] studenti;
    int[] note;

    public Curs(String nume, String descriere,
                Profesor profu, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
        this.studenti = studenti;
        this.note = new int[studenti.length];
    }

    public void UpdateProfesor(Profesor profu) {
        this.profu = profu;
    }

    public void AddStudent(Student student) {
//lucrand cu array trebuie inserat folosind un sir auxiliar
        int noualungime = studenti.length + 1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for (Student s : studenti) {
            aux[index++] = s;
        }
//la final adaugam noul student pe ultimul index
        aux[index] = student;
//si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0,
                noualungime);
    }

    public void removeStudent(Student[] student, int studentul) {
        int index = studentul;
        Student[] aux = new Student[student.length - 1];
        System.arraycopy(student, 0, aux, 0, index);
        System.arraycopy(student, index + 1, aux, index, student.length - index - 1);
        student = aux;
    }

    public void modifyStudent(Student[] student, int studentul, String numeNou, String prenumeNou, int grupaNoua) {
        student[studentul].nume = numeNou;
        student[studentul].prenume = prenumeNou;
        student[studentul].grupa = grupaNoua;
    }

    public void noteazaStudent(Student student, int nota) {
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i].equals(student)) {
                note[i] = nota;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String str = "Curs: " + "nume=" + nume + ", descriere = " + descriere + "\nprofu = " + profu + ",\nstudenti:\n";
        for (Student s : studenti) {
            str += s + "\n";
        }
        return str;
    }
}