public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Sem Nome";
        } else {
            this.nome = nome;
        }
        this.matricula = matricula;
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            this.nota = 0;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public double getNota() {
        return nota;
    }

    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }
}