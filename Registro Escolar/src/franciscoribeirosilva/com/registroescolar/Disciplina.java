package franciscoribeirosilva.com.registroescolar;

public class Disciplina {
    
    String nome;
    int codigo;
    Professor funcionario;
    
    
    public Disciplina(){
        
    }
    
    public Disciplina(String nome, int codigo, Professor funcionario){
        
        this.nome = nome;
        this.codigo = codigo;
        this.funcionario = funcionario;
    }
    
}
