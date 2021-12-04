import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args)
    {
        // ler num1
        // ler num2
        // ler simbolo (+ - / *)

        System.out.println("Digite primeiro número:");
        Scanner entrada = new Scanner(System.in);
        var num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        var num2 = entrada.nextDouble();

        System.out.println("Digite o símbolo:");
        var operador = entrada.next();

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;

        System.out.printf("O resultado é: %.2f %s %.2f = %s", num1, operador, num2, resultado);

    }
}
