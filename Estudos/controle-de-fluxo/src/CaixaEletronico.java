public class CaixaEletronico {
    public static void main(String[] args) {
        Double saldo = 25.0;
        Double valorSolicitado = 22.0;

        if( valorSolicitado < saldo){
            saldo =  saldo -valorSolicitado;
            System.out.println("novo Saldo: R$"+saldo);
        }else
        System.out.println("Saldo insuficiente");
        

    }
}
