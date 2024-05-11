import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = ??;

        int parametroUm = terminal.??;
        int parametroDois = terminal.??;

        try {
            // chamndo o método contendo a logica de contagem
            contar(parametroUm, parametroDois);

        } catch(? exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParamentosInvalidosException {
        // validar se parametroUm é MAIOR que parâmetroDois  e lançar a exceção

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
    }
}
