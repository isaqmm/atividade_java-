public class Questao02
{
    public static void main(String[] args)
    {
        int[] vet;

        System.out.println("Depois da declaracao: vet = null");

        vet = new int[15];

        System.out.println("Valor de vet[5]: " + vet[5]);

        int tam = vet.length;

        System.out.println("Valor de tam: " + tam);

        System.out.println("Ultimo elemento: vet[14] = "
                + vet[14]);

        System.out.println("Indice do primeiro elemento: 0");

        double[] medias = new double[20];

        System.out.println("Array medias possui "
                + medias.length + " posicoes.");
    }
}