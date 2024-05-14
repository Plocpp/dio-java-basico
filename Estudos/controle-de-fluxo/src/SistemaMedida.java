public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "P";

        switch (sigla) {
            case "P":
            System.out.println("Tamanho Pequeno");
                
                break;
            case "M":
            System.out.println("tamanho Medio");
            break;
            case "G":
            System.out.println("tamanho Grande");
            break;
            
            default:
            System.out.println("Tamanho Indefinido");
                break;
        }
        /*
        if(sigla == "P"){
            System.out.println("tamanho Pequeno");
        }else if(sigla == "M"){
            System.out.println("Tamanho Medio");
        }else if(sigla == "G"){
            System.out.println("Tamanho Grande");
        }else{
            System.out.println("Tamanho Indefinido");
        }
    */
    }
    
}
