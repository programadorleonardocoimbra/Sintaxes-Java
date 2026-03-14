# Sintaxe Java 

Material de estudo sobre **sintaxe da linguagem Java**, contendo explicações e exemplos comentados para auxiliar no aprendizado dos principais conceitos da linguagem.
Este projeto foi criado com o objetivo de servir como **guia de referência e portfólio de estudo**, abordando fundamentos essenciais da programação em Java.

---

### Conteúdo do Projeto

Este repositório apresenta exemplos práticos dos seguintes tópicos:

- Anatomia das Classes
- Tipos e Variáveis
- Operadores
- Métodos
- Escopo
- Palavras Reservadas
- JavaDoc
- Terminal e Argumentos

---

## 1. Anatomia das Classes

Em Java, toda aplicação é estruturada em **classes**.

Uma classe pode conter:

- atributos (variáveis)
- métodos (funções)
- construtores

### Exemplo

java
public class MinhaClasse {

    // Atributo da classe
    String nome;

    // Método principal da aplicação
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
    }

}
Estrutura básica
modificador class NomeDaClasse {

    // atributos

    // métodos

}
Boas práticas

O nome da classe deve começar com letra maiúscula

O nome do arquivo deve ser igual ao nome da classe

Exemplo:

---------------------------------------------------------

## 2. Tipos e Variáveis

Variáveis são utilizadas para armazenar valores na memória.

Tipos Primitivos do Java
Tipo	Descrição	Exemplo
int	números inteiros	10
double	números decimais	3.14
char	caracteres	'A'
boolean	verdadeiro ou falso	true
byte	inteiro pequeno	127
short	inteiro curto	1000
long	inteiro grande	100000L
float	número decimal	5.5f
Exemplo
public class TiposVariaveis {

    public static void main(String[] args) {

        int idade = 25;
        double altura = 1.75;
        char letra = 'L';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Estudante: " + estudante);
    }

}

---------------------------------------------------------

## 3. Operadores

Operadores são utilizados para realizar operações matemáticas e lógicas.

Operadores Aritméticos
Operador	Função
+	soma
-	subtração
*	multiplicação
/	divisão
%	resto da divisão
Exemplo
public class Operadores {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }

}

---------------------------------------------------------

## 4. Métodos

Métodos são funções dentro de uma classe que permitem organizar e reutilizar código.

Exemplo
public class Metodos {

    public static void main(String[] args) {

        saudacao();

        int resultado = soma(5, 3);

        System.out.println("Resultado da soma: " + resultado);
    }

    public static void saudacao() {
        System.out.println("Bem-vindo ao estudo de Java!");
    }

    public static int soma(int a, int b) {
        return a + b;
    }

}

---------------------------------------------------------

## 5. Escopo

O escopo define onde uma variável pode ser acessada dentro do código.

Exemplo
public class Escopo {

    static int numero = 10; // variável de classe

    public static void main(String[] args) {

        int valor = 5; // variável local

        if (valor > 0) {
            int dentroDoIf = 20;
            System.out.println(dentroDoIf);
        }

        // System.out.println(dentroDoIf); // erro de escopo
    }

}

Tipos de escopo:

Escopo de classe

Escopo de método

Escopo de bloco

---------------------------------------------------------

## 6. Palavras Reservadas

Java possui palavras reservadas, que não podem ser usadas como nomes de variáveis ou classes.
Exemplos:

class
public
private
protected
static
void
int
double
if
else
while
for
return
new
Exemplo inválido
int class = 10; // ERRO
Exemplo correto
int numeroClasse = 10;

---------------------------------------------------------

## 7. JavaDoc

JavaDoc é uma ferramenta utilizada para documentar o código Java.

Ela permite gerar documentação automática em HTML.

Exemplo
/**
 * Classe responsável por realizar operações matemáticas.
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

}
Gerar documentação no terminal
javadoc Calculadora.java

---------------------------------------------------------

## 8. Terminal e Argumentos

É possível passar argumentos ao executar um programa Java pelo terminal.

Exemplo
public class Argumentos {

    public static void main(String[] args) {

        System.out.println("Argumentos recebidos:");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}
---------------------------------------------------------------

## Objetivo

Este projeto tem como objetivo:
> Consolidar os fundamentos da linguagem Java
> Servir como material de revisão


👨‍💻 Autor: Leonardo Coimbra de Paiva ( 13/03/2026 )

Projeto desenvolvido para fins de estudo e prática em Java.
Java Developer in Progress ☕
