public class DesafioAritimetico {

    public static void main(String[] args)
    {
         var expressao1 = 6 * (3+2);
         var expressao2 = Math.pow(expressao1, 2);
         var formula1 = expressao2 / (3 * 2);

         var expressao3 = (1 - 5) * (2 - 7) / 2;
         var formula2 = Math.pow(expressao3, 2);

         var expressao5 = formula1 - formula2;

         var formula3 = Math.pow(expressao5, 3);
         var formula4 = Math.pow(10, 3);
         var formula5 = formula3 / formula4;

         System.out.println(formula5);
    }

}
