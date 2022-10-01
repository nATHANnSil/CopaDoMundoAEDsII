package pacote;

public class Main {

	public static void main(String[] args) {

		MyIO.setCharset("UTF-8");

		Jogo vetor[] = new Jogo[500];

		String entrada = MyIO.readLine();

		int i = 0;

		while (!entrada.equals("FIM")) {
			Jogo jogo2 = new Jogo();
			vetor[i++] = jogo2.ler(entrada);
			entrada = MyIO.readLine();
		}

		entrada = MyIO.readLine();
		int quantidade = Integer.parseInt(entrada);

		for (int a = 0; a < quantidade; a++) {
			entrada = MyIO.readLine();
			String data = entrada.split(";")[0];
			String selecao1 = entrada.split(";")[1];
			int dia = Integer.parseInt(data.split("/")[0]);
			int mes = Integer.parseInt(data.split("/")[1]);
			int ano = Integer.parseInt(data.split("/")[2]);

			for (int w = 0; w < i; w++) {
				if (vetor[w].getDia() == dia && vetor[w].getMes() == mes && vetor[w].getAno() == ano && vetor[w].getSelecao1().equals(selecao1)) {
					vetor[w].imprimir();
				}
			}
		}

	}

}
