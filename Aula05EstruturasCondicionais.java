package academy.devdojo.maratonajava.maratonajava;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");

        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.printf("Fora do if");
    }
}