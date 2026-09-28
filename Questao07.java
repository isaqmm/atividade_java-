public class Questao07
{
    public static void main(String[] args)
    {
        int[][] matrizImpares = new int[5][5];

        int impar = 1;

        for (int i = 0; i < matrizImpares.length; i++)
        {
            for (int j = 0; j < matrizImpares[i].length; j++)
            {
                matrizImpares[i][j] = impar;

                impar = impar + 2;
            }
        }

        System.out.println("Matriz de numeros impares:");

        for (int i = 0; i < matrizImpares.length; i++)
        {
            for (int j = 0; j < matrizImpares[i].length; j++)
            {
                System.out.print(
                    matrizImpares[i][j] + "\t"
                );
            }

            System.out.println();
        }

        int[][] matrizAleatoria = new int[5][5];

        for (int i = 0; i < matrizAleatoria.length; i++)
        {
            for (int j = 0; j < matrizAleatoria[i].length; j++)
            {
                matrizAleatoria[i][j] =
                    10 + (int)(Math.random() * 41);
            }
        }

        System.out.println();
        System.out.println("Matriz de numeros aleatorios:");

        for (int i = 0; i < matrizAleatoria.length; i++)
        {
            for (int j = 0; j < matrizAleatoria[i].length; j++)
            {
                System.out.print(
                    matrizAleatoria[i][j] + "\t"
                );
            }

            System.out.println();
        }
    }
}