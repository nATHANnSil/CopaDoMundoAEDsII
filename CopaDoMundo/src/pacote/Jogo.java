package pacote;

//ATRIBUTOS
public class Jogo {
	private int dia, mes, ano, placarSelecao1, placarSelecao2;
	private String etapa, selecao1, selecao2, local;

	// CONSTRUTORES SAO PUBLIC POR PADRÃO
	// USAR THIS.
	Jogo(int ano, String etapa, int dia, int mes, String selecao1, int placarSelecao1, int placarSelecao2, String selecao2, String local) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.placarSelecao1 = placarSelecao1;
		this.placarSelecao2 = placarSelecao2;
		this.etapa = etapa;
		this.selecao1 = selecao1;
		this.selecao2 = selecao2;
		this.local = local;
	}

	public Jogo() {

	}

	// GETS E SETS PARA CADA VARIAVEL

	public int getdia() {
		return this.dia;
	}

	public void setdia(int dia) {
		this.dia = dia;
	}

	public int getmes() {
		return this.mes;
	}

	public void setmes(int mes) {
		this.mes = mes;
	}

	public int getano() {
		return this.ano;
	}

	public void setano(int ano) {
		this.ano = ano;
	}

	public int getplacarSelecao1() {
		return this.placarSelecao1;
	}

	public void setplacarSelecao1(int placarSelecao1) {
		this.placarSelecao1 = placarSelecao1;
	}

	public int getplacarSelecao2() {
		return this.placarSelecao2;
	}

	public void setplacarSelecao2(int placarSelecao2) {
		this.placarSelecao2 = placarSelecao2;
	}

	public String getetapa() {
		return this.etapa;
	}

	public void setetapa(String etapa) {
		this.etapa = etapa;
	}

	public String getselecao1() {
		return this.selecao1;
	}

	public void setselecao1(String selecao1) {
		this.selecao1 = selecao1;
	}

	public String getselecao2() {
		return this.selecao2;
	}

	public void setselecao2(String selecao2) {
		this.selecao2 = selecao2;
	}

	public String getlocal() {
		return this.local;
	}

	public void setlocal(String local) {
		this.local = local;
	}

	// CLONE
	public Jogo cloneJogo() {
		Jogo novoJogo = new Jogo();
		novoJogo.dia = this.dia;
		novoJogo.mes = this.mes;
		novoJogo.ano = this.ano;
		novoJogo.placarSelecao1 = this.placarSelecao1;
		novoJogo.placarSelecao2 = this.placarSelecao2;
		novoJogo.etapa = this.etapa;
		novoJogo.selecao1 = this.selecao1;
		novoJogo.selecao2 = this.selecao2;
		novoJogo.local = this.local;

		return novoJogo;
	}

	// LER
	public Jogo ler(String leitura) {
		String linhas[] = leitura.split("#");
		Jogo jogo = new Jogo(Integer.parseInt(linhas[0]),linhas[1],Integer.parseInt(linhas[2]),Integer.parseInt(linhas[3]),linhas[4],Integer.parseInt(linhas[5]),Integer.parseInt(linhas[6]),linhas[7],linhas[8]);
		
		return jogo;
	}

	// IMPRIMIR
	public void imprimir() {
		System.out.println("[COPA " + this.ano + "] [" + this.etapa + "] [" + this.dia + "/" + this.mes + "] ["+ this.selecao1 + "(" + this.placarSelecao1 + ") x (" + this.placarSelecao2 + ")" + this.selecao2 + "]" + "[" + this.local + "]");
	}

}
