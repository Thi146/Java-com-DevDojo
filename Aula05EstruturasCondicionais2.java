package academy.devdojo.maratonajava.maratonajava;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 -> categoria infantil
        // idade >= 15 && idade < 18 -> categoria juvenil
        // idade >= 18 -> categoria adulto
        int idade = 12;
        String categoria = "Sem categoria"; // Inicializando a variável

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else if (idade >= 18) {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}