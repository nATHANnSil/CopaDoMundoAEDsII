//ATRIBUTOS

public class Jogo {
	private int dia, mes, ano, placarSelecao1, placarSelecao2;
	private String etapa, selecao1, selecao2, local;

//CONSTRUTORES SÃO PUBLIC POR PADRÃO
//USAR THIS.

	Jogo(int dia, int mes) {
		this.dia=dia;
		this.mes=mes;

	}

	public Jogo() {
		

	}

// GETS E SETS PARA CADA VARIÁVEL
	
	

// CLONE, LER E IMPRIMIR
	
	public Jogo cloneJogo() {
		Jogo novoJogo = new Jogo();
		novoJogo.dia=this.dia;
		novoJogo.mes=this.mes;
		novoJogo.ano=this.ano;
		novoJogo.placarSelecao1=this.placarSelecao1;
		novoJogo.placarSelecao2=this.placarSelecao2;
		novoJogo.etapa=this.etapa;
		novoJogo.selecao1=this.selecao1;
		novoJogo.selecao2=this.selecao2;
		novoJogo.local=this.local;
		
		return novoJogo;
	}
	
	public void ler() {
		 
	}
	
	public void imprimir() {
		
	}

}