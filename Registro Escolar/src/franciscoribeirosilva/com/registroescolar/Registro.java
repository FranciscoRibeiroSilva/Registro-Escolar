package franciscoribeirosilva.com.registroescolar;

public class Registro {

    
    Aluno registrarAluno(String nome, String matricula){
        Aluno aluno = new Aluno(nome, matricula);
        return aluno;
    }
    
    Professor registraProfessor(String nome, String formacao, String matricula, String funcoes){
        Professor professor = new Professor(nome, formacao, matricula, funcoes);
        return professor;
        
    }
    
    void registraDiciplina(){
        
    }
    
    public static void main(String args []){
        
        
        
    }
}


