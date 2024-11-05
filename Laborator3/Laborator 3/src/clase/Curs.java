package clase;

import java.util.Scanner;

public class Curs implements OperatiiCurs{
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

    public Curs() {
        this.nume = "";
        this.descriere = "";
        this.profu = null;
        this.studenti = new Student[0];
        this.note = new int[0];
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

    @Override
    public void RemoveStudent(Student student) {
        int noualungime = studenti.length - 1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for (Student s : studenti) {
            aux[index++] = s;
        }
        studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0, noualungime);
    }

    @Override
    public void UpdateStudent(Student student, String numeNou, String prenumeNou, int grupaNoua) {
        student.setNume(numeNou);
        student.setPrenume(prenumeNou);
        student.setGrupa(grupaNoua);
    }

    @Override
    public void UpdateCurs(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
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