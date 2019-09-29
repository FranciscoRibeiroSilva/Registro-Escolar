package franciscoribeirosilva.com.registroescolar;

public class Professor {
    
    String nome;
    String formacao;
    String matricula;
    String funcoes;
    
    public Professor(){
        
    }
    
    public Professor(String nome, String formacao, String matricula, String funcoes){
        this.nome  = nome;
        this.formacao = formacao;
        this.matricula = matricula;
        this.funcoes = funcoes;
    }
    
    String mostrarNome(){
        return this.nome;
    }
    
    String mostrarMatricula(){
        return this.matricula;
    }
    
    String informaFormacao(){
        return this.formacao;
    }
    
    String exibirFuncoes(){
        return this.funcoes;
    }
    
}
