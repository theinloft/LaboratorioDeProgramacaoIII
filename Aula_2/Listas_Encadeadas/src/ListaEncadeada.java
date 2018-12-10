
public class ListaEncadeada<T> {
	private No head;
	private No tail;
	private No dado;

	 public void append(Object o){
	    	No novo = new No(o);
	    	   if(tail == null){
	    		   head = novo;		  
	    	   }else{
	        	   tail.insertAfter(novo);
	    		   novo.insertBefore(tail);	   
	    	   }
	    	   tail = novo;
	    	} 
	    
	    /* Insere o objeto no inicio da lista. */
	    public void addFirst(Object o){
	    	No novo = new No(o);
	    	if(head == null){
	    		tail = novo;
	    		head = tail;
	    	}else{
	    		head.insertBefore(novo);
	    		novo.insertAfter(head);
	    	}
	    	head = novo;
	    	
	    }
	    /* Remove o objeto da lista. */
	    public void remove(Object o){
	    	if(head !=null){
	    	
	    	
	    	}
	    }
	    /* Recupera o primeiro No da lista. */
	    public No getFirst(){
	    	
	    	return head;
	    }
	    /* Recupera o ultimo No da lista. */
	    public No getLast(){
	    	return tail;
	    }
	    /* Testa se o objeto existe na lista. */
	    public boolean hasObject(Object o){
			return dado.getData() != null;
	    	
	    }
	}

