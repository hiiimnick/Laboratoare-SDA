package clase;

public class Profesor extends Persoana {

    @Override
    public String toString() {
        return "Profesor{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }

    public Profesor(String nume, String prenume) {
        super(nume, prenume);
    }

    public Profesor() {
        super("", "");
    }
}