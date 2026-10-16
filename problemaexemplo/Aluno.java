package problemaexemplo;

public class Aluno {

    protected double nota2;
    protected double nota1;

    Aluno (double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

}