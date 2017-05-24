package pontos.interfaces;

public class Participante {
	private int identificador;
	private int pontos;
	private String senha;
	
	public Participante() {}

	public int getIdentificador() {
		return identificador;
	}

	public int getPontos() {
		return pontos;
	}

	public String getSenha() {
		return senha;
	}

	public Participante(int identificador, int pontos, String senha) {
		super();
		this.identificador = identificador;
		this.pontos = pontos;
		this.senha = senha;
	}

}
