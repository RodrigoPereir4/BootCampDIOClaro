package contador;

import java.util.Scanner;

/**
 *
 * @author digol
 */
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int num1 = terminal.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = terminal.nextInt();
        
        try{
            contar(num1, num2);
        } catch(ParametrosInvalidosException erro){
            System.out.println(erro.getMessage());
        }
    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int cont = 0;
        
        if(parametro1 >= parametro2){
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }
        
        cont = parametro2 - parametro1;
        
        for(int i = 1; i < cont; i++){
            System.out.println("Contador: " + i);
        }
        
    }
    
}
