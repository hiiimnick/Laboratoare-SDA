package clase;

public abstract class Persoana {
    protected String nume;
    protected String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana() {
        this.nume = null;
        this.prenume = null;
    }

    @Override
    public String toString() {
        return "Persoana{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }
}
