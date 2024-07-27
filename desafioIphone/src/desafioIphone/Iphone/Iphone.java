package desafioIphone.Iphone;

import desafioIphone.Funcionalidades.AparelhoTelefonico;
import desafioIphone.Funcionalidades.NavegadorInternet;
import desafioIphone.Funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico , NavegadorInternet,ReprodutorMusical {
    
	//metodos de Aparelho telefonico 
	@Override
	public void ligar(String numero) {
		System.out.println(" ligando ");
		
	}

	@Override
	public void atender() {
		System.out.println(" atendendo chamada ");
		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println(" iniciando correio de voz ");
		
	}
 
	// métodos de Reprodutor Musical 
	@Override
	public void tocar() {
		System.out.println(" tocando musicas ");
		
	}

	@Override
	public void pausar() {
		System.out.println(" pausando musica ");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println(" selecionando musica ");
		
	}
	
    // métodos de  Navegador Internet 
	@Override
	public void exibirPagina(String url) {
    System.out.println(" exibindo pagina Url ");		
	}

	@Override
	public void adicionarNovaAba() {
	System.out.println(" adicionando nova aba internet ");	
	}

	@Override
	public void atualizarPagina() {
    System.out.println(" atualizando página ");		
	}

}
