public class Media {
    public class void media(String[] args) {
        double notas = {9.5, 8.0, 5.5, 7.0};
        System.out.println(notas[3]);
        System.out.println(notas[2]);
        System.out.println(notas[1]);
        System.out.println(notas[0]);

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        if (media >= 6) {
            System.out.println("Aluno aprovado com média de: " + media);
        } else {
            System.out.println("Aluno reprovado com média de: " + media);
        }

        
    }
}