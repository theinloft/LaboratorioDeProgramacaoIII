package mst;

public class TesteArvoreGeradoraMinima {

	
	
	    public static void main(String[] args) {
	    	
	        Grafo grafo = FileReaderHelper.readFile("database.txt");
	        Grafo mst = grafo.getArvoreGeradoraMinima();
	        
	        for (Aresta aresta : mst.getArestas()) {
	            System.out.println(aresta.toString());
	        }
	    }   
}
