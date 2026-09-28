public class Questao03
{
    public static void main(String[] args)
    {
        int[] v = new int[10];

        int impar = 1;

        for (int i = 0; i < v.length; i++)
        {
            v[i] = impar;
            impar = impar + 2;
        }

        System.out.println("Numeros impares:");

        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v[i]);
        }

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++)
        {
            do
            {
                notas[i] = Teclado.leDouble(
                    "Digite a nota " + (i + 1) + ": "
                );

                if (notas[i] < 0.0 || notas[i] > 10.0)
                {
                    System.out.println("Nota invalida!");
                    System.out.println("Digite uma nota entre 0 e 10.");
                }

            } while (notas[i] < 0.0 || notas[i] > 10.0);
        }

        System.out.println("Notas digitadas:");

        for (int i = 0; i < notas.length; i++)
        {
            System.out.println(notas[i]);
        }
    }
}