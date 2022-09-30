package pacote;

public class Main {

	public static void main(String[] args) {

		MyIO.setCharset("UTF-8");
		
		Jogo vetor[] = new Jogo[500];

		String entrada = MyIO.readLine();

		int i = 0;

		while(!entrada.equals("FIM")){
			Jogo jogo2 = new Jogo();
			vetor[i++] = jogo2.ler();
			entrada = MyIO.readLine();
		}

		entrada = MyIO.readLine();


		for(int a = 0; a < Integer.parseInt(entrada); a++){
			entrada = MyIO.readLine();
			//18/6/1974;Brasil
			String data = entrada.split(";")[0];
			//["18/6/1974", "Brasil"]
			//data = "18/6/1974"
			String selecao1 = entrada.split(";")[1];
			//selecao1 = "Brasil"
			int dia = Integer.parseInt(data.split("/")[0]);
			//data = ["18", "6", "1974"]
			int mes = Integer.parseInt(data.split("/")[1]);

			int ano = Integer.parseInt(data.split("/")[2]);

			for (int w = 0; w < i; w++){
				if (vetor[w].getdia() == dia && vetor[w].getmes() == mes && vetor[w].getano() == ano && vetor[w].getselecao1().equals(selecao1)){
					vetor[w].imprimir();
				}
			}
		}

	}

}
