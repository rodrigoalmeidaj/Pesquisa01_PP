package classes;

public abstract class Funcionario {
	String nomeFuncionario;

	public void printNomeDoFuncionario() {
		System.out.println(this.nomeFuncionario);
	}

	public abstract void adicionar(Funcionario funcionario);

	public abstract void remover(Funcionario funcionario);
}
