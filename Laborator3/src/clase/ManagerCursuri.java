package clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManagerCursuri implements OperatiiManagerCursuri{
    Curs[] cursuri;

    public ManagerCursuri() {
        Connection conn = null;
        cursuri = new Curs[0];
    }

    public void AddCurs(Curs curs) {
        int noualungime = cursuri.length + 1;
        Curs[] aux = new Curs[noualungime];
        int index = 0;
        for (Curs c : cursuri) {
            aux[index++] = c;
        }
//la final adaugam noul curs pe ultimul index
        aux[index] = curs;
//si realocam lista de curs cu aux;
        this.cursuri = new Curs[noualungime];
        System.arraycopy(aux, 0, cursuri, 0,
                noualungime);
    }

    public void DeleteCurs(Curs curs) {
        int index = -1;
        for (int i = 0; i < this.cursuri.length; i++) {
            if (cursuri[i].equals(curs)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Curs[] aux = new Curs[cursuri.length - 1];
            System.arraycopy(cursuri, 0, aux, 0, index);
            System.arraycopy(cursuri, index + 1, aux, index, cursuri.length - index - 1);
            cursuri = aux;
        }
    }

    public void UpdateCurs(Curs curs, String numeNou, String descriereNoua, Profesor profNou) {
        for (Curs c : cursuri) {
            if (c.equals(curs)) {
                c.nume = numeNou;
                c.descriere = descriereNoua;
                c.profu = profNou;
                break;
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

    public void noteazaStudent(Profesor profesor, String numeCurs, Student student, int nota) {
        for (Curs curs : cursuri) {
            if (curs.nume.equals(numeCurs) && curs.profu.equals(profesor)) {
                curs.noteazaStudent(student, nota);
                break;
            }
        }
    }

    public void afiseazaNoteleStudentilor() {
        for (int i = 0; i < cursuri.length - 1; i++) {
            System.out.println(cursuri[i].note[i]);
        }
    }

    public void mediaNotelorProfesor(Profesor prof) {
        double suma = 0;
        int numarNote = 0;
        for (Curs curs : cursuri) {
            if (curs.profu.equals(prof)) {
                for (int nota : curs.note) {
                    suma += curs.note[numarNote];
                    numarNote++;
                }
            }
        }
        double media = suma / numarNote;
        System.out.println("Media notelor: " + media);
    }

    public void AfiseazaCursuriLaConsola() {
        for (Curs c : cursuri)
            System.out.println(c);
    }
}