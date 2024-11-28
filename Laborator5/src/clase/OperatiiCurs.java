package clase;

public interface OperatiiCurs {
    public void UpdateProfesor(Profesor p);
    public void AddStudent(Student student);
    public void RemoveStudent(Student student);
    public void UpdateStudent(Student student, Student student2);
    public void UpdateCursul(String nume, String descriere);
}