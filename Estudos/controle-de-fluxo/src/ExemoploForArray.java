public class ExemoploForArray {
    public static void main(String[] args) {
        
        String alunos[] ={"FELIPE","JONAS","JULIA","MARCOS","jOÃO","ANTONIO","MIGUEL","PEDRO","ANDRE","THIAGO","MATHEUS","JUDAS"};

        for (String aluno: alunos){
            System.out.println("Nome do Aluno é : "+ aluno);
        }
        /*
        //EM ARRAYS O INDICE INICIA EM ZERO

        for(int x = 0;x < alunos.length;x++){
            System.out.println("O Aluno no indice x ="+ x +" é "+ alunos[x]);
        }
        */
    }
}
