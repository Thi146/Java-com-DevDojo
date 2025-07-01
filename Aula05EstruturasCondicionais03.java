package academy.devdojo.maratonajava.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000

        /*
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar ;
        */
        double salario = 6000;
        //(condicao)  verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro devDojo" : "Ainda não tenho condições, mas vou ter!";
        boolean possoComprar = salario > 5000;
        System.out.println(resultado);
    }
}