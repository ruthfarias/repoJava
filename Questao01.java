/* 1. Crie uma classe principal chamada Questão01, 
      que leia valores via teclado de base e a altura
      de um retângulo, calcular e exibir sua área.
 */
package Exercicios_1;

import java.util.Scanner;   //Importa da biblioteca java.util, a classe Scanner. 

public class Questao_01 {   //Inicia a classe Questão_01. 

    public static void main(String[] args) {    // Metodo principal da classe Questão01.

        Scanner input = new Scanner(System.in);     //Declara a utilização de um novo objeto Scanner, que será guardado em input(Entrada). 

        double base, altura, area;  //Declaração das variaveis.

        System.out.print("Informe o valor da Base do Quadrado:");    //Imprime uma mensagem para o usuário.
        base = input.nextDouble();   // Atribui a variavel base, o valor informado pelo usuario em input. 

        System.out.print("Informe o valor da Altura do Quadrado:");  //Imprime uma mensagem para o usuario.
        altura = input.nextDouble();    // Atribui a variavel altura, o valor informado pelo usuario em input.

        area = base * altura;    //Efetua a multiplicação para gerar o valor da area. 

        System.out.println("A área do Quadrado é:" + area);     //Imprime uma mensagem para o usuario, e concatenando(+) a valor a area que foi calculado.

    }
}
