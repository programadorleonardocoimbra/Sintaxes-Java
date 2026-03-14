package src;
/*
Escopo define onde uma variável pode ser utilizada.
Tipos de escopo:

> Escopo de classe
> Escopo de método
> Escopo de bloco
*/

public class escopo {
    static int numero = 10; // variável global de classe.

    public static void main(String[] args) {

        int valor = 5; // variável local.

        if (valor > 0) {
            int dentroDoIf = 20;
            System.out.println(dentroDoIf);
            
        }


    }
}
