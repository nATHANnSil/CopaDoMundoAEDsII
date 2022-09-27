package pacote;

public class Main {

	public static void main(String[] args) {

		MyIO.setCharset("UTF-8");
		
		Jogo game = new Jogo();
		
		game.ler();
		
		String leitura;
		
		leitura = MyIO.readString();


	}

}
