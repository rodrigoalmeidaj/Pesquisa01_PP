package classes;

public class Caixa extends Funcionario{
    public Caixa (String nomeDoCaixa) {
        this.nomeFuncionario = nomeDoCaixa;;
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
