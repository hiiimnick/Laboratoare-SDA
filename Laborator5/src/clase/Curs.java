package clase;

import java.util.*;

public class Curs implements OperatiiCurs{
    String nume;
    String descriere;
    Profesor profu;
    Set<Student> studenti;
    HashMap<Student, Double> Note;

    public Curs(String nume, String descriere,
                Profesor profu, Set<Student> studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
        this.studenti = new HashSet<>();
        this.Note = new HashMap<>();
        for(Student stud : studenti) {
            this.studenti.add(stud);
            Note.put(stud,0.0);
        }
    }

    public Curs() {
        this.nume = "";
        this.descriere = "";
        this.profu = null;
        this.studenti = new HashSet<>();
        this.Note = new HashMap<>();
    }

    public void UpdateProfesor(Profesor profu) {
        this.profu = profu;
    }

    public void AddStudent(Student student) {
        studenti.add(student);
    }

    @Override
    public void RemoveStudent(Student student) {
        studenti.remove(student);
        Note.remove(student);
    }

    public void UpdateStudent(Student student, Student student2) {
        for (Student s : studenti) {
            if (student.equals(student2)) {
                student = student2;
            }
        }
    }

    @Override
    public void UpdateCursul(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
    }


    public void noteazaStudent(Student student, double nota) {
        Note.put(student,nota);
    }

    public void afiseazaNoteleStudentilor() {
        for (HashMap.Entry<Student, Double> entry : Note.entrySet()) {
            Student student = entry.getKey();
            double nota = entry.getValue();
            System.out.println(student + " " + nota);
        }
    }

    public void medieNoteStudenti() {
        Double medie = 0.0;
        Double contor = 0.0;
        for (HashMap.Entry<Student, Double> entry : Note.entrySet()) {
            Double nota = entry.getValue();
            medie += nota;
            contor++;
        }
        medie /= contor;
        System.out.println("Media este: " + medie);
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