package mst;
import java.util.Objects;


public class Aresta implements Comparable<Aresta> {

	  private Vertice origem;
	  private Vertice destino;
	  private int peso;

	    public Aresta(int origem, int destino, int peso) {
	        this.origem = new Vertice(origem);
	        this.destino = new Vertice(destino);
	        this.peso = peso;
	    }

	    public Vertice getOrigem() {
	        return origem;
	    }

	    public Vertice getDestino() {
	        return destino;
	    }

	    public int getPeso() {
	        return peso;
	    }

	    public boolean contendoVertice(Vertice vertice) {
	        return vertice.equals(origem) || vertice.equals(destino);
	    }

	    @Override
	    public boolean equals(final Object o) {
	        if (!(o instanceof Aresta)) {
	            return false;
	        }
	        Aresta castO = (Aresta) o;
	        return Objects.equals(origem, castO.origem)
	                && Objects.equals(destino, castO.destino)
	                && Objects.equals(peso, castO.peso);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(origem, destino, peso);
	    }

	    @Override
	    public int compareTo(Aresta a) {
	        if (this.peso > a.peso) {
	            return 1;
	        } else if (this.peso < a.peso) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }

	    @Override
	    public String toString() {
	        return this.origem + " - " + this.destino + " : " + this.peso;
	    }
	}

