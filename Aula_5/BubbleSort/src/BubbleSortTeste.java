import java.util.Scanner;



public class BubbleSortTeste {
	
	


	public static void main(String[]args) {
		BubbleSort b = new BubbleSort();
		
		int[] arrNumeros = new int[5];
		
		 Scanner s = new Scanner(System.in);
		 
		 int numero=0;
		 
		 for(int i=0; i<arrNumeros.length;i++) {
		 
		 System.out.println("digite 5 números:"+"\n");
		 numero =  s.nextInt();
		 
		 arrNumeros[i] = numero;
		 
		 
		 }
		 System.out.println("Ordenação com bubble sort:\n");
		 
		 for(int i=0;i<arrNumeros.length;i++) {
			
			
			
			
			 b.bubbleSort(arrNumeros);
			
			 System.out.println(arrNumeros[i]);
		 }
		 
		 
	}