package clase;

import java.util.*;

class Clase {
    public static void main(String[] args) {
//definire studenti
        Set<Student> studenti = new HashSet<>();
        Student s1 = new Student("Blaga", "Lucian", 731);
        Student s2 = new Student("Carcaleteanu", "Cristian", 731);
//definire profesor
        Profesor prof = new Profesor("Panaitescu", "Anton");
        Profesor prof1 = new Profesor("Shields", "Roxana");
//definire curs nou
        Curs curs = new Curs("Rezistenta Materialelor", "calculul reacţiunilor,\n" +
                "diagramele de eforturi, calculul caracteristicilor geometrice ale\n" +
                "suprafeţelor plane şi calculul elementelor de rezistenţă la solicitări simple\n"
                , prof, studenti);
        Curs curs1 = new Curs("Comunicare", "Scriere academica", prof1, studenti);
//adaugare curs in lista de cursuri
        ManagerCursuri cursuri = new ManagerCursuri();

        System.out.println("Adauga curs: ");
        cursuri.AddCurs(curs);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();

        cursuri.AddCurs(curs1);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();

        System.out.println("Sterge curs: ");
        cursuri.DeleteCurs(curs1);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();


        System.out.println("Adauga studenti: " + s1.nume + " " + s2.nume);
        studenti.add(s1); studenti.add(s2);

        System.out.println("Sterge Student: " + s1.nume);
        studenti.remove(s1);

        System.out.println(studenti);

        studenti.add(s1); //pentru calculul mediei mai jos

        cursuri.modifyProfesor(prof, "Ion", "Vasile");
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();

        System.out.println("Exercitiul 6: ");
        curs.noteazaStudent(s1, 5);
        curs.noteazaStudent(s2, 9);
        System.out.println();

        System.out.println("Exercitiul 7: ");
        curs.afiseazaNoteleStudentilor();
        System.out.println();

        System.out.println("Exercitiul 8: ");
        cursuri.displayStudentiLaCurs(curs.nume);
        System.out.println();

        System.out.println("Exercitiul 9: ");
        curs.medieNoteStudenti();
        System.out.println();
    }
}