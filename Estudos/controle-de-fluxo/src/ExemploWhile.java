import java.util.concurrent.ThreadLocalRandom;;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Valor do Doce: "+valorDoce+ " adicionado ao carrinho.");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada "+mesada);
        System.out.println("Joãozinho gastou toda siua mesada em doces!!!");

        /*não se preocupe com a formatação dos valores 
         * Iremos explorar os recursos de formatação em breve!!
         */
    }
    private static double valorAleatorio() {
    
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}