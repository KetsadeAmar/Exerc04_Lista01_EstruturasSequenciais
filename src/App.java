import java.util.Scanner;

public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {

        //Declaração de Variaveis
     double media;
     double nota;
     double n1;
     double n2;
     double n3;
     double n4;
     
     // Solicitação de Dados
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe 4 notas de avaliações bimestrais: ");
     n1 = teclado.nextDouble();
     n2 = teclado.nextDouble();
     n3 = teclado.nextDouble();
     n4 = teclado.nextDouble();
     teclado.close();

     // Calcular Notas e Média
     nota = n1 + n2 + n3 + n4;
     media = nota / 4;

     // Exibir a Resposta para o Usuário
     System.out.println("O total das suas notas foi de " + nota);
     System.out.println("A média alcançada foi de " + media);
    }
}
