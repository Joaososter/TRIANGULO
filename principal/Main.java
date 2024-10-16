package principal;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        // Criação de um objeto da classe FuncoesUteis para usar os métodos
        FuncoesUteis funcoes = new FuncoesUteis();

        // Testando o método Soma
        int resultadoSoma = funcoes.Soma(10, 5);  // Passa os valores 10 e 5 como parâmetros
        System.out.println("Soma de 10 + 5 = " + resultadoSoma);  // Exibe o resultado da soma

        // Testando o método Triangulo com altura 5
        System.out.println("Triângulo com altura 5:");
        funcoes.Triangulo(5);  // Passa o valor 5 como altura do triângulo

        // Testando o método printArquivo
        // Certifique-se de que o caminho do arquivo esteja correto
        System.out.println("Conteúdo do arquivo:");
        funcoes.printArquivo("caminho/do/seu/arquivo.txt");  // Insira o caminho correto para o arquivo
    }
}

