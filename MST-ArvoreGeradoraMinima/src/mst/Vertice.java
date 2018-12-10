package mst;
import java.util.Objects;

 public class Vertice implements Comparable<Vertice> {

	    private int indice;

	    public Vertice(int indice) {
	        this.indice = indice;
	    }

	    public int getIndice() {
	        return indice;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (!(o instanceof Vertice)) {
	            return false;
	        }
	        Vertice castO = (Vertice) o;
	        return indice == castO.indice;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(indice);
	    }

	    @Override
	    public int compareTo(Vertice o) {
	        if (this.indice > o.indice) {
	            return 1;
	        } else if (this.indice < o.indice) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }

	    @Override
	    public String toString() {
	        return Integer.toString(this.indice);
	    }

	}
	


