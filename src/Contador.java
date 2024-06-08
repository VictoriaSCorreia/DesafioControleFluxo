import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int parametro1, parametro2;

		System.out.print("Digite o primeiro parâmetro: ");
        parametro1 = scan.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		parametro2 = scan.nextInt();
		
        scan.close();

		try {
			contar(parametro1, parametro2);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        int cont;
        if (parametro1 > parametro2)
            throw new ParametrosInvalidosException();
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		else
		    cont = parametro2 - parametro1;
            for(int i = 1; i <= cont; i++){
                System.out.println("Imprimindo o número " + i);
            }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
