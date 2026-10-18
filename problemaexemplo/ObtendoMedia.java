package problemaexemplo;

public class ObtendoMedia {
    
    private double media;
    private CadastrarAluno cadastroNotas;

    ObtendoMedia(CadastrarAluno cadastroNotas){
        this.media = media;
        this.cadastroNotas = cadastroNotas;
    }

    public void estadoAluno(){
        media = (cadastroNotas.getNota1() + cadastroNotas.getNota2()) / 2;
        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media >= 4){
            System.out.println("Final!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}
