public class Numeros {
    public static void main(String[] args) {
       
        int[] numeros = {2, 5, 7, 39, 23, 8, 81, 12, 55, 3};

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        System.out.println("Números do vetor:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            soma += numeros[i];
        }
        System.out.println();
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
    }
}
