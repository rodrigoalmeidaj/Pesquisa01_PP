import classes.Funcionario;
import classes.Gerente;
import classes.Atendente;
import classes.Caixa;

public class App {
    public static void main(String[] args) {
		Funcionario gerente = new Gerente("Cleiton Rasta");
	    Funcionario atendente = new Atendente("Joaozinho do Celular");
	    Funcionario caixa = new Caixa("Pelé");
        
        gerente.printNomeDoFuncionario();
	    gerente.adicionar(atendente);
	    atendente.printNomeDoFuncionario();
	    gerente.adicionar(caixa);
	    caixa.printNomeDoFuncionario();
	    gerente.remover(atendente);
	}
}
