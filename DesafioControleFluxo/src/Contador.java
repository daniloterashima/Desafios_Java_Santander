import java.util.Locale;
import java.util.Scanner;

public class Contador {
/** @author Danilo Terashima */
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt(); //incluido o nextInt por causa do Scanner
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt(); //incluido o nextInt por causa do Scanner

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException d) {
            System.out.println(d.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}


        
        }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");}
            
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; i <= contagem; i++)
            System.out.println("Imprimindo o número "+ i);

    }}