
/**
 * Escreva uma descrição da classe Autocarro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Autocarro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String matricula;
    
    /**
     * Construtor para objetos da classe Autocarro
     */
    public Autocarro(int id, String matricula)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.matricula = matricula;
    }

    public int getId()
    {
        return this.id;
    }
    
    public void setId(int Id)
    {
        this.id = id;
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public void setMatricula(String Id)
    {
        this.matricula = matricula;
    }
    
    @Override
    public String toString()
    {
        return "Id: " + this.id + " | Matricula: " + this.matricula;
    }
    
    public Autocarro clone()
    {
        Autocarro clone = new  Autocarro(this.id, this.matricula);
        return clone;
    }
}