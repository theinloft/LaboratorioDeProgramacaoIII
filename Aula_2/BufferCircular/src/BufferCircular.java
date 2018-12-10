/*
 * Buffer Circular
 *	Implemente uma classe de buffer circular que utiliza um array de tamanho estático para armazenar os dados.
 */




public class BufferCircular {

	    private int tamanhoMaximo;
	    private int frente = 0;  
	    private int anterior = 0;  
	    private int bufLen = 0;  
	    private String[] itens;    
	 
	   
	    public BufferCircular(int tamanho) 
	    {
	        tamanhoMaximo = tamanho;
	        frente = anterior = 0;
	        anterior = 0;
	        bufLen = 0;
	        itens = new String[tamanhoMaximo];
	    }
	
	    public int getSize()
	    {
	        return bufLen;
	    }
	 
	    public void clear()
	    {
	        frente = anterior = 0;
	        anterior = 0;
	        bufLen = 0;
	        itens = new String[tamanhoMaximo];
	    }
	   
	    public boolean isEmpty() 
	    {
	        return bufLen == 0;
	    }
	  
	    public boolean isFull() 
	    {
	        return bufLen == tamanhoMaximo;
	    } 
	   
	    public void insert(String s) 
	    {
	        if (!isFull() ) 
	        {
	            bufLen++;
	            anterior = (anterior + 1) % tamanhoMaximo;
	            itens[anterior] = s;
	        }
	        else
	            System.out.println("Está cheio");
	    }
	
	    public void display() 
	    {
	        System.out.print("\nBuffer : ");
	        for (int i = 0; i < tamanhoMaximo; i++)
	            System.out.print(itens[i] +" ");
	        System.out.println();    
	    }
	    
	    public String delete() 
	    {
	        if (!isEmpty() ) 
	        {
	            bufLen--;
	            frente = (frente + 1) % tamanhoMaximo;
	            return itens[frente];
	        }
	        else 
	        {
	            System.out.println("Erro : Não há como excluir, pois já está vazio");
	            return " ";
	        }
	    }       
	
}
