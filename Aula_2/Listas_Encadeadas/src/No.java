public class No {
	private Object objeto;
	private No proximo;
	private No anterior;

	public No(Object objeto) {
    	this.objeto = objeto;
    	this.anterior = null;
    	this.proximo = null;
       
	}
    /* Testa se existe um No apos esse no. */
    public boolean hasNext() {
		return proximo != null;
	}
    /* Testa se existe um No antes desse no. */
    public boolean hasPrevious() {
		return anterior != null;
	}
    /* Retorna o próximo No. */
    public No next() {
		return proximo;
	}
    /* Retorna o No anterior. */
    public No previous() {
		return anterior;
	}
    /* Insere um No após esse no. */
    public boolean insertAfter(No novo) {
			this.proximo = novo;
			return true;
	}
    
    /* Insere um No antes desse no. */
    public boolean insertBefore(No novo) {
    	this.anterior = novo;
		return true;
	}
    /* Remove o no */
    public void remove(No no) {
    	anterior = no.next();
    		    proximo = no.next();
    		    anterior.insertAfter(proximo);
    		    proximo.insertBefore(anterior);
	}
    /* Recupera o dado armazenado. */
    public Object getData() {
		return objeto;
	}
	public void insertBefore(String string) {
		// TODO Auto-generated method stub
		
	}
	public void insertAfter(String string) {
		// TODO Auto-generated method stub
		
	}

	


}
