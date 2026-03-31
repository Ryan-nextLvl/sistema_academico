public class Main {
    public static void main(String[] args) {
        AlunoGraduacao aluno1 = new AlunoGraduacao("Maria", "2023001", 8.5);
        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao("João", "2023002", 6.5);
        Aluno aluno3 = new Aluno("", "2023003", 12); // nome e nota inválidos

        aluno1.exibirDados();
        System.out.println("Aprovado Graduação: " + aluno1.verificarAprovacao());
        System.out.println();

        aluno2.exibirDados();
        System.out.println("Aprovado Pós: " + aluno2.verificarAprovacao());
        aluno2.publicarArtigo();
        System.out.println();

        aluno3.exibirDados();
        aluno3.ajustarNota(7.5);
        System.out.println("Nota ajustada: " + aluno3.getNota());
        System.out.println();

        ProfessorEfetivo prof1 = new ProfessorEfetivo("Carlos", "P001", 3000);
        ProfessorTemporario prof2 = new ProfessorTemporario("Ana", "P002", 2000, 2);

        System.out.println("Salário prof1: " + prof1.getSalario());
        prof1.aumentarSalario(500);
        System.out.println("Salário prof1 após aumento: " + prof1.getSalario());
        System.out.println();

        System.out.println("Salário prof2: " + prof2.getSalario());
        prof2.aumentarSalario(300);
        System.out.println("Salário prof2 após aumento: " + prof2.getSalario());
        prof2.passarMes();
        prof2.passarMes();
        prof2.aumentarSalario(200); // contrato acabou
        System.out.println();

        Disciplina disciplina = new Disciplina("POO", prof1);
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno1); // não duplica
        System.out.println("Alunos na disciplina:");
        disciplina.listarAlunos();
    }
}