package entidades;

import entidades.enumeradas.Cor;

public abstract class FormaGeometrica {
	private Cor cor;

	public FormaGeometrica() {
		
	}
	
	public FormaGeometrica(Cor cor) {
		this.cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract Double area();
	
}
