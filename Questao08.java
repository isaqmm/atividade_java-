public class Questao08
{
    public static void main(String[] args)
    {
        int[][] m =
        {
            {10, 15, 20},
            {25, 30, 35},
            {40, 45, 50}
        };

        double soma = 0;
        int quantidade = 0;

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                soma = soma + m[i][j];
                quantidade++;
            }
        }

        double media = soma / quantidade;

        System.out.println("Media da matriz: " + media);

        int contador = 0;

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] % 3 == 0 &&
                    m[i][j] % 5 == 0)
                {
                    contador++;
                }
            }
        }

        System.out.println(
            "Quantidade de multiplos comuns de 3 e 5: "
            + contador
        );
    }
}