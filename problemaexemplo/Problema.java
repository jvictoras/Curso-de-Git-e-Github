package problemaexemplo;

public class Problema {
    public static void main(String args[]){

        CadastrarAluno aluno = new CadastrarAluno(4, 3);

        ObtendoMedia media = new ObtendoMedia(aluno);

        media.estadoAluno();
    
    }
}
