
public interface Lista<T> {
	
	 // adiciona um elemento no final da lista.
	void append(T valor);
    void addFirst(T valor); // adiciona um elemento no inicio da lista.
    void removeLast(); // remove o �ltimo elemento da lista.
    void removeFirst(); // remove o primeiro elemento da lista.
    int size(); // retorna o n�mero de elementos na lista.
    T get(int index); //retorna o elemento com o indice indicado.

}
