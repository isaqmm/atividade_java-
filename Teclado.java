import java.util.Scanner;

public class Teclado
{
    private static Scanner teclado = new Scanner(System.in);

    public static int leInt(String mensagem)
    {
        System.out.print(mensagem);
        return teclado.nextInt();
    }

    public static double leDouble(String mensagem)
    {
        System.out.print(mensagem);
        return teclado.nextDouble();
    }

    public static String leString(String mensagem)
    {
        System.out.print(mensagem);
        return teclado.next();
    }

    public static char leChar(String mensagem)
    {
        System.out.print(mensagem);
        return teclado.next().charAt(0);
    }
}