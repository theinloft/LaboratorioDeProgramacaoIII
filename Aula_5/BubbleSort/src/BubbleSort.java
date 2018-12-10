import java.util.Comparator;

public class BubbleSort {
	

	 private int[] arr;

//bubble sort manual
public void bubbleSort(int[] arr) {

      boolean foiTrocado = true;

      int j = 0;

      int tmp;

      while (foiTrocado) {

            foiTrocado = false;

            j++;

            for (int i = 0; i < arr.length - j; i++) {                                       

                  if (arr[i] > arr[i + 1]) {                          

                        tmp = arr[i];

                        arr[i] = arr[i + 1];

                        arr[i + 1] = tmp;

                        foiTrocado = true;

                  }

            }                

      }

	 
	 

	 
}
/* 
 * Ainda tentando descobrir o erro do bubble com comparator
 * 
public void bubble(T[] arr, Comparator<T> comparator) {
	T tmp;
	
    boolean foiTrocado = true;

	 while (foiTrocado) {
		 
		 foiTrocado = false;
	
	 for (int i = 0; i < arr.length; i++) {
     
         for(int j = 0; j < arr.length - 1; j++) {
             if (comparator.compare(arr[j], arr[j + 1]) > 0) {
            	  tmp = arr[i];
            	  arr[i] = arr[i + 1];
                  arr[i + 1] = tmp;
                 foiTrocado = true;
             }
}
	
}
	 }
}*/
}



	 





