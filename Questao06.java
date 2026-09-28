public class Questao06
{
    public static void main(String[] args)
    {
        int[][] matriz;

        matriz = new int[6][4];

        System.out.println("matriz[1][3] = "
                + matriz[1][3]);

        double[][] notas;

        notas = new double[6][4];

        char[][] letras;

        letras = new char[6][4];

        System.out.println("Matriz int: "
                + matriz.length + " x "
                + matriz[0].length);

        System.out.println("Matriz double: "
                + notas.length + " x "
                + notas[0].length);

        System.out.println("Matriz char: "
                + letras.length + " x "
                + letras[0].length);
    }
}