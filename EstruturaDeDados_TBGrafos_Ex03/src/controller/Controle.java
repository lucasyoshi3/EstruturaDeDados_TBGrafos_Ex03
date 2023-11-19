package controller;

import java.util.regex.MatchResult;

public class Controle {

	public void listaArestas(int[][] grafo) {
		// TODO Auto-generated method stub
		for(int i=0;i<grafo.length;i++) {
			for(int j=0;j<grafo.length;j++) {
				if(grafo[i][j]!=0) System.out.println("("+i+", "+j+") Peso: "+grafo[i][j]);
			}
		}
	}
	
	
}
