
public class Pilha<T> implements Lista<T> {
	private Elemento<T> primeiro;
	private Elemento<T> ultimo;
	private int contador;

	@Override
	public void append(T valor) {
		if(this.contador > 0) {
			Elemento<T> novo = new Elemento<T>(valor);
			this.ultimo.setProximo(novo);
			this.ultimo = novo;
			this.contador++;
		}
		
	}

	@Override
	public void addFirst(T valor) {
		if(contador == 0) {
		Elemento<T> novo = new Elemento<T>(valor);
		this.primeiro = novo;
		this.ultimo = primeiro;
		contador++;
		}
		else {
			Elemento<T> novo = new Elemento<T>(valor);
			this.primeiro = novo;
		}
				
		
	}

	@Override
	public void removeLast() {
		Elemento<T> atual = this.primeiro;
        if (atual.getNext() == null) {
            this.removeFirst();
            return;
        }
        
        for (int i = 0; i < this.contador; i++)
        {
            atual = atual.getNext();
            if (atual.getNext() == this.ultimo) {
                atual.setNext(null);
                this.ultimo = atual;
                this.contador--;
            }
        }
        
        
	}

	@Override
	public void removeFirst() {
		if(contador==0) {
			System.out.println("primeira posição está vazia ");
			this.ultimo = null;
			this.primeiro = ultimo;
			return;
		}
		this.primeiro = primeiro.getNext();
		this.contador--;
		
		
	}

	@Override
	public int size() {
		
		return this.contador;
	}

	@Override
	public T get(int index) {
		
		if(index>=0) {
			if(index <= contador) {
				 Elemento<T> atual = this.primeiro;
			        for (int i = 0; i < index; i++)
			            atual= this.primeiro.getNext();

			        return atual.getElemento();
			}
			
		}
		
		return null;
	}
	

}
