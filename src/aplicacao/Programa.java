package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.FormaGeometrica;
import entidades.Retangulo;
import entidades.enumeradas.Cor;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<FormaGeometrica> lista = new ArrayList<>();
		
		System.out.println("Digite o número de formas: ");
		int n = sc.nextInt();
		for (int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados da forma n #"+ i);
			System.out.println("Retângulo ou Círculo (r/c)? ");
			char forma = sc.next().charAt(0);
			System.out.println("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.next());
			if (forma == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		System.out.println();
		System.out.println("ÁREA DAS FORMAS:");
		for (FormaGeometrica fg : lista) {
			System.out.println(String.format("%.2f",fg.area()));
		}
	}

}
