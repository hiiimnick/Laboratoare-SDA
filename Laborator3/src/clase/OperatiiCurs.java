package clase;

public interface OperatiiCurs {
    public void UpdateProfesor(Profesor p);
    public void AddStudent(Student student);
    public void RemoveStudent(Student student);
    public void UpdateStudent(Student student, String numeNou, String prenumeNou, int grupaNoua);
    public void UpdateCurs(String nume, String descriere);
}