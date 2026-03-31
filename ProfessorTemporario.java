public class ProfessorTemporario extends Professor {
    private int mesesContrato;

    public ProfessorTemporario(String nome, String matricula, double salario, int mesesContrato) {
        super(nome, matricula, salario);
        this.mesesContrato = mesesContrato;
    }

    public void passarMes() {
        if (mesesContrato > 0) {
            mesesContrato--;
        }
    }

    @Override
    public void aumentarSalario(double valor) {
        if (mesesContrato > 0) {
            super.aumentarSalario(valor);
        } else {
            System.out.println("Contrato encerrado. Não é possível aumentar salário.");
        }
    }

    public int getMesesContrato() {
        return mesesContrato;
    }
}
