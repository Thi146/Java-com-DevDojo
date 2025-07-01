package academy.devdojo.maratonajava.maratonajava;

public class Aula06EstruturasDeReptição {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count + 1);
            // System.out.println(++count);
            count = count + 1;
            // count++;
            // se por exemplo quiser contar de 5 em 5 poderia ser usado o count+= 5;
        }
        do {
            System.out.println("dentro do 'do-while'");
        } while (count < 10);
        count = 0;
        for (count = 0; count < 10; count++) {
            System.out.println("For " + count);

            for (int i=0; i <10; i++) {
            System.out.println("For " +i);}
        }
    }
}
