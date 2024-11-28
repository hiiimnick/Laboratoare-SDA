package clase;

import java.sql.Connection;
import java.util.*;

public class ManagerCursuri implements OperatiiManagerCursuri{
    List<Curs> cursuri;

    public ManagerCursuri() {
        Connection conn = null;
        cursuri = new ArrayList<>();
    }

    public void AddCurs(Curs curs) {
        cursuri.add(curs);
    }

    public void DeleteCurs(Curs curs) {
        cursuri.remove(curs);
    }

    public void UpdateCurs(Curs curs, Curs curs2) {
        for (Curs c : cursuri) {
            if (curs.equals(curs2)) {
                curs = curs2;
            }
        }
    }

    public void modifyProfesor(Profesor profVechi, String numeNou, String prenumeNou) {
        profVechi.nume = numeNou;
        profVechi.prenume = prenumeNou;
    }

    public void displayStudentiLaCurs(String numeCurs) {
        for (Curs curs : cursuri) {
            if (curs.nume.equals(numeCurs)) {
                System.out.println("Studentii inscrisi la cursul " + numeCurs + " sunt: ");
                for (Student student : curs.studenti)
                    System.out.println(student);
            }
        }
    }


    public void AfiseazaCursuriLaConsola() {
        for (Curs c : cursuri)
            System.out.println(c);
    }
}