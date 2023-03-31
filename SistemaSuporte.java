package chamado;

public class SistemaSuporte {
	
	private Chamado[] chamados;
	private int numeroChamados;
	
	//Constructor
	private SistemaSuporte(int tamanhoMaximo) {
		chamados = new Chamado[tamanhoMaximo];
		numeroChamados = 0;
	}
	
	//adiciona um novo chamado
	public void adicionarChamado(Chamado chamado) {
		if(numeroChamados < chamados.length) {
			chamados[numeroChamados] = chamado;
			numeroChamados++;
		}else {
			System.out.println("Não é posssivel adicionar mais chamados, o limite foi ecedido");
		}
	}
	
	
	//lsitar os chamados existentes
	public void listarChamados() {
		for (int i = 0; i < numeroChamados; i++) {
			Chamado chamado = chamados[i];
			System.out.println("Chamado #" + chamado.getNumero() + " - " + chamado.getStatus());
			System.out.println(" Aberto em: " + chamado.getDataAbertura());
			System.out.println(" Usuário: " + chamado.getNomeUsuario());
			System.out.println(" Descrição do problema: " + chamado.getDescricaoProblema());
			System.out.println();
			
		}
	}
	
	//atualizar um status de um chamado ja existente
	public void atualizarStatusChamado(int numeroChamado, String novoStatus) {
		Chamado chamado = buscarChamado(numeroChamado);
		if(chamado != null) {
			chamado.setStatus(novoStatus);
			System.out.println("Status do chamado #" + numeroChamado + "Atualizado");
		}
	}

	private Chamado buscarChamado(int numeroChamado) {
		// TODO Auto-generated method stub
		return null;
	}

}
