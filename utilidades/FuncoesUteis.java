package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 

public class FuncoesUteis {

    // Método que realiza a soma de dois números inteiros
    public int Soma(int a, int b) {
        return a + b;
    }

    // Método que exibe um triângulo com a altura especificada
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // Método que lê um arquivo de texto e imprime seu conteúdo
    public void printArquivo(String arquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
