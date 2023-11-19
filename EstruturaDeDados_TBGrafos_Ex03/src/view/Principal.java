package view;

import controller.Controle;

public class Principal {
	public static void main(String[] args) {
		int[][] grafo = {
	            {0, 3, 0, 2},
	            {0, 0, 0, 0},
	            {0, 4, 0, 0},
	            {5, 0, 0, 0}
	        };
		Controle controle=new Controle();
		controle.listaArestas(grafo);
	}
}
