/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numProcesso;
    private String nome;
    private String dtNascimento;
    private String morada;
    private String telefone;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno()
    {
        // inicializa variáveis de instância
        
    }
    
    public int getId()
    {
        return id;    
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getNumProcesso()
    {
        return numProcesso;    
    }
    
    public void setNumProcesso(int numProcesso)
    {
        this.numProcesso = numProcesso;
    }
    
    public String getNome()
    {
        return nome;    
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getDtNascimento()
    {
        return dtNascimento;    
    }
    
    public void setDtNascimento(String dtNascimento)
    {
        this.dtNascimento = dtNascimento;
    }
    
    public String getMorada()
    {
        return morada;    
    }
    
    public void setMorada(String morada)
    {
        this.morada = morada;
    }
    
    public String getTelefone()
    {
        return telefone;    
    }
    
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    
    
}