import java.util.Scanner;

public class contadorador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int parametro1, parametro2;

		System.out.print("Digite o primeiro parâmetro: ");
        parametro1 = scan.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		parametro2 = scan.nextInt();
		
        scan.close();
		try {
			contadorar(parametro1, parametro2);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	static void contadorar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        int contador;
        if (parametro1 > parametro2)
            throw new ParametrosInvalidosException();
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		else
		    contador = parametro2 - parametro1;
            for(int i = 1; i <= contador; i++){
                System.out.println("Imprimindo o número " + i);
            }
		//realizar o for para imprimir os números com base na variável contadoragem
	}
}
