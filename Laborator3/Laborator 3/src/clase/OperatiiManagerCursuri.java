package clase;

public interface OperatiiManagerCursuri {
    public void AddCurs(Curs curs);
    public void UpdateCurs(Curs curs, String numeNou, String descriereNoua, Profesor profNou);
    public void DeleteCurs(Curs curs);
}
