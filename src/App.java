
import java.util.Scanner;


public class App {
    public static void main(String[] args)  {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o primeiro numero? ");
        int numero1 = ler.nextInt();

        System.out.println("Qual o segundo numero? ");
        int numero2 = ler.nextInt();

        try{
            contar(numero1, numero2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior que o primeiro;");
        }
    }

static void contar (int numero1, int numero2) throws ParametrosInvalidosException {
    if (numero1 >= numero2) {
        throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
    }

    int contagem = numero2 - numero1;

    for (int i = 1; i <= contagem; i++){
        System.out.println("Imprimindo o numero "+ i);
    }
}

}

     
        
        
    

