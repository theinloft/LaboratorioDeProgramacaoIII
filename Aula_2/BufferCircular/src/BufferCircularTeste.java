import java.util.Scanner;

public class BufferCircularTeste
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Teste do Buffer Circular\n");
        System.out.println("Digite o tamanho do Buffer: ");
        int n = scan.nextInt();
     
        BufferCircular bufferCircular = new BufferCircular(n); 
 
              
        char questao;
 
        do
        {
            System.out.println("\nBuffer Circular");
            System.out.println("1. Inserção");
            System.out.println("2. remoção");
            System.out.println("3. tamanho");
            System.out.println("4. verificar se esta vazio");
            System.out.println("5. verificar se esta cheio");
            System.out.println("6. limpar");
 
            int opc = scan.nextInt();
            switch (opc)
            {
            case 1 : 
                System.out.println("Digite algo à ser inserido:");
                bufferCircular.insert( scan.next());                                        
                break;                         
            case 2 : 
                System.out.println("Elemento Removido = "+ bufferCircular.delete());
                break;                         
            case 3 : 
                System.out.println("Tamanho = "+ bufferCircular.getSize());
                break;                            
            case 4 : 
                System.out.println("Está Vazio = "+ bufferCircular.isEmpty());
                break;                
            case 5 : 
                System.out.println("Está Cheio = "+ bufferCircular.isFull());
                break; 
            case 6 : 
                System.out.println("\nLimpeza do buffer efetuada\n");
                bufferCircular.clear();
                break;                                    
            default : System.out.println("Opção inválida \n ");
                break;
            }
            
            bufferCircular.display();     
 
            System.out.println("\nDo Você deseja continuar? S para sim e N para não \n");
            questao = scan.next().charAt(0);
 
        } while (questao == 'S'|| questao == 's');                                                        
    }    
}