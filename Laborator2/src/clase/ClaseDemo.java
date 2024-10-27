package clase;

class Clase {
    public static void main(String[] args) {
//definire studenti
        Student[] studenti = new Student[]{new Student("Andrei", "Negoita", 2231), new Student("Ion", "Mateescu", 4221)};
//definire profesor
        Profesor prof = new Profesor("Anton", "Panaitescu");
        Profesor prof1 = new Profesor("Roxana", "Shields");
//definire curs nou
        Curs curs = new Curs("Rezistenta Materialelor", "calculul reacţiunilor,\n" +
                "diagramele de eforturi, calculul caracteristicilor geometrice ale\n" +
                "suprafeţelor plane şi calculul elementelor de rezistenţă la solicitări simple\n"
                , prof, studenti);
        Curs curs1 = new Curs("Comunicare", "Scriere academica", prof1, studenti);
//adaugare curs in lista de cursuri
        ManagerCursuri cursuri = new ManagerCursuri();

        System.out.println("Exercitiul 1: ");

        System.out.println("Adauga curs: ");
        cursuri.AddCurs(curs);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();

        cursuri.AddCurs(curs1);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();


        System.out.println("Modifica curs: ");
        cursuri.modifyCurs(curs, "Programarea calculatoarelor si limbaje de programare", "Invatarea limbajelor de programare si algoritmica", prof);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();

        System.out.println("Sterge curs: ");
        cursuri.removeCurs(curs1);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();


        System.out.println("Exerciitul 2: ");
        System.out.println("Adauga student: ");
        curs.AddStudent(studenti[1]);
        System.out.println(studenti[1].getNume());

        System.out.println("Sterge Student: ");
        curs.removeStudent(studenti, 1);

        System.out.println("Modifica student: ");
        curs.modifyStudent(studenti, 1, "Ion", "Mazilescu", 4421);

        System.out.println("Exercitiul 3: ");
        cursuri.modifyProfesor(prof, "Ion", "Vasile");
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();


        System.out.println("Exercitiul 4: ");
        cursuri.displayStudentiLaCurs(curs.nume);
        System.out.println();


        System.out.println("Exercitiul 6: ");
        cursuri.noteazaStudent(prof, curs.nume, studenti[0], 5);
        cursuri.noteazaStudent(prof, curs.nume, studenti[1], 9);
        System.out.println();

        System.out.println("Exercitiul 7: ");
        cursuri.afiseazaNoteleStudentilor();
        System.out.println();

        System.out.println("Exercitiul 8: ");
        cursuri.displayStudentiLaCurs(curs.nume);
        System.out.println();

        System.out.println("Exercitiul 9: ");
        cursuri.mediaNotelorProfesor(prof);
        System.out.println();
    }
}
