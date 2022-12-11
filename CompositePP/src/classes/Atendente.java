package classes;

public class Atendente extends Funcionario{
    
    public Atendente (String nomeDoAtendente) {
        this.nomeFuncionario = nomeDoAtendente;
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
     }

	@Override
	public void adicionar(Funcionario funcionario) {
		
	}

	@Override
	public void remover(Funcionario funcionario) {
		
	}
}
