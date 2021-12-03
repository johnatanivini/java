import javax.swing.*;
import java.util.Locale;

public class Soma {
    public static void main(String[] args)
    {
        String valor1 = JOptionPane.showInputDialog("Adicione o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Adicione o segundo número");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("A soma é: "+ soma + "\n");
        System.out.println("A média é: "+ soma / 2);
    }
}
