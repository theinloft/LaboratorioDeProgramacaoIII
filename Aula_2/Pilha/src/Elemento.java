
public class Elemento<T> {
T valor;
private Elemento<T> proximo;

	public Elemento(T valor) {
		valor = this.valor;
		
	}

	public void setProximo(Elemento<T> valor) {
		 this.proximo = valor;
		
	}

	public Elemento<T> getProximo() {
		return proximo;
	}

	public Elemento<T> getNext() {
		
		return this.proximo;
	}

	public void setNext(Elemento<T> valor) {
		this.proximo = valor;
		
	}

	public T getElemento() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	
	
	
}
