package pacote;

public class Main {

	public static void  metodoLeitura(Jogo[] vetor){
		ArquivoTextoLeitura file = new ArquivoTextoLeitura("partidas.txt");

		String dados = file.lerArquivo();
                
                int i = 0;
                
                while (dados != null) {
                        Jogo jogo2 = new Jogo();
			vetor[i++] = jogo2.lerJogo(dados);
                        dados = file.lerArquivo();
		}
                
                file.fecharArquivo();
                               
	}

	public static void main(String[] args) {
            
		Jogo vetor[] = new Jogo[1000];

		metodoLeitura(vetor);
                
		String entrada;		
		entrada = MyIO.readLine();

		int quantidade = Integer.parseInt(entrada);

		for (int a = 0; a < quantidade; a++) {
			entrada = MyIO.readLine();
			String data = entrada.split(";")[0];
			String selecao1 = entrada.split(";")[1];
			int dia = Integer.parseInt(data.split("/")[0]);
			int mes = Integer.parseInt(data.split("/")[1]);
			int ano = Integer.parseInt(data.split("/")[2]);

			for (int w = 0; w < 900; w++) {
				if (vetor[w].getDia() == dia && vetor[w].getMes() == mes && vetor[w].getAno() == ano && vetor[w].getSelecao1().equals(selecao1)) {
				vetor[w].imprimir();	                   
				}
			
                        }
		}

	}

}
