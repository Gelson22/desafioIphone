package desafioIphone.Teste;

import desafioIphone.Iphone.Iphone;

public class Funcional {
	public static void main(String[] args) {
		Iphone iphone=new Iphone();
		
		System.out.println(" métodos de aparelho telefonico ");
		iphone.ligar(null);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("\n métodos de Reprodutor Musical ");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica(null);
		
		System.out.println("\n métodos de  Navegador Internet ");
		iphone.exibirPagina(null);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}

}
