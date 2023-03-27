package entidades;

import entidades.enumeradas.Cor;

public class Retangulo extends FormaGeometrica {

	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override
	public Double area() {
		return largura * altura;
	}
}
