package entidades;

import entidades.enumeradas.Cor;

public class Circulo extends FormaGeometrica{
	private Double raio;
	
	public Circulo() {
		
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double area() {
		return raio * raio * Math.PI;
	}

}
