package Conteúdo;

/* Métodos são funções dentro de uma classe.
   Eles servem para organizar e reutilizar código.
*/

public class metodos {

    public static void main(String[] args) {
        
        saudacao();
        int resultado = soma(5, 3);

        System.out.println("O Resultado da Soma é: " + resultado);

    }

    public static void saudacao() {

        System.out.println("Bem vindo ao estudo de JAVA");

    }

    public static int soma(int a, int b) {
return a + b;

    }
    
}
