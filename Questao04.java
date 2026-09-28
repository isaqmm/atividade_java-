public class Questao04
{
    public static void main(String[] args)
    {
        Questao04 questao = new Questao04();

        int[] numeros = {10, 15, 20, 30, 45, 50};

        double media = questao.calcularMedia(numeros);

        System.out.println("Media: " + media);

        questao.contarMultiplos(numeros);
    }

    public double calcularMedia(int[] numeros)
    {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            soma = soma + numeros[i];
        }

        return (double) soma / numeros.length;
    }

    public void contarMultiplos(int[] numeros)
    {
        int contador = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] % 3 == 0 &&
                numeros[i] % 5 == 0)
            {
                contador++;
            }
        }

        System.out.println(
            "Quantidade de multiplos comuns de 3 e 5: "
            + contador
        );
    }
}