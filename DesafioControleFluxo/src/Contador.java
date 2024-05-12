import java.util.InputMismatchException;
import java.util.Scanner;   

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // chamndo o método contendo a logica de contagem
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {

            System.err.println("Você só pode digitar números!");

        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parâmetroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            parametroUm++;
            parametroDois++;
            System.out.println("Imprimindo o número " + parametroUm + ", Imprimindo o número " + parametroDois);
        }
    }
}
