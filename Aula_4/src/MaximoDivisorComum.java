	import javax.annotation.processing.SupportedSourceVersion;
	import java.util.Scanner;

public class MaximoDivisorComum {

   public static void main(String[] args){

	        MaximoDivisorComum mdc = new MaximoDivisorComum();
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o numero: ");
	        int numero = scanner.nextInt();
	        System.out.print("Digite o divisor: ");
	        int divisor = scanner.nextInt();
	        int valor = mdc.executaOperacao(numero, divisor);
	        System.out.print("O máximo divisor comum é: "+valor);

	    }

	    public int executaOperacao(int numero, int divisor){
	    	
	        if (numero % divisor == 0) {
	        	
	        	return divisor;
	        }
	        else {
	        	return executaOperacao(divisor, (numero % divisor));
	        }
	    }

	}
	
	
	
	
	

