package academy.devdojo.maratonajava.maratonajava;

public class Aula06EstruturaDeRepeticao04 {
    //Dado o valor de um carro, descubra quantas ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        int valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela+ "R$"+valorParcela);
            }else{
                break;
                for (int i = 0; i < ; i++) {
                    
                }
            }
        }
    }
}

