public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "T"; //T/M/B

        switch (plano) {
            case "T":
                System.out.println("5 GB de YouTube");
            case "M":
            System.out.println("Instagram e Whatzapp Gratis");
            case "B":
            System.out.println("100 Minutos de Ligação ");
            default:
                break;
        }
        /*switch (plano) {
            case "B":
            System.out.println("100 Minuto de Ligação");
                break;
            case "M":
            System.out.println("100 Minutos de ligação");
            System.out.println("Instagram e Whatzapp Gratis");
            break;
            case "T":
            System.out.println("100 Minutos de Ligação");
            System.out.println("Instagram e Whatzapp Gratis");
            System.out.println("5GB de YOUTUBE");
            default:
            System.out.println("Plano não reconhecido");
                break;
        }
        if (plano == "B"){
            System.out.println("100 Minutos de Ligação");
        }else if(plano == "M"){
            System.out.println("100 Minutos de Ligação ");
            System.out.println("Whatzapp e Instagram Gratis");
        }else if (plano == "T"){
            System.out.println("100 Minutos de Ligação");
            System.out.println("Whatzapp e Instagram Gratis");
            System.out.println("5 Gb de YouTube");
        }else{
            System.out.println("Plano não reconhecido");
        }
        */
    }
    
}
