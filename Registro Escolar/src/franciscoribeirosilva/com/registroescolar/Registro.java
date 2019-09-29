package franciscoribeirosilva.com.registroescolar;

public class Registro {
    
    static Aluno alunos;
    static Professor professores;
    static Disciplina diciplinas;

    
    Aluno registrarAluno(String nome, String matricula){
        Aluno aluno = new Aluno(nome, matricula);
        return aluno;
    }
    
    Professor registraProfessor(String nome, String formacao, String matricula, String funcoes){
        Professor professor = new Professor(nome, formacao, matricula, funcoes);
        return professor;
        
    }
    
    Disciplina registraDiciplina(String nome, int codigo, Professor funcionario){
        Disciplina disciplina = new Disciplina(nome, codigo, funcionario);
        return disciplina;
    }
    
    public static void main(String args []){
        
        Registro regis = new Registro();
        
        alunos = regis.registrarAluno("Matheus Fake", "0A8D7F");
        System.out.println("Nome: "+alunos.mostrarNome()+"\nMatricula: "+alunos.mostrarMatricula());
        
        professores = regis.registraProfessor("Roshi-sama", "Mestre em Kung-Fuu, usuário de Mafuuba e criador do Kamehameha", "C4S4D0K4M3", "Sábio");
        
        System.out.println("Nome do Prof.: "+professores.nome+"\nFormação: "+professores.formacao+"\nMatricula: "+professores.matricula+"\nFunções: "+professores.funcoes);
    }
    
}


