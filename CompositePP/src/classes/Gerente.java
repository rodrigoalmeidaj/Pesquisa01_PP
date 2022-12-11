package classes;
public class Gerente extends Supervisor{
	public Gerente(String nomeDoSupervisor) {
		super(nomeDoSupervisor);
        this.nomeFuncionario = nomeDoSupervisor;
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.printNomeDoFuncionario();
        }
    }
	
	@Override
	public void adicionar(Funcionario novoFuncionario) {
	}

	@Override
    public void remover(Funcionario funcionario) {
	}
}

