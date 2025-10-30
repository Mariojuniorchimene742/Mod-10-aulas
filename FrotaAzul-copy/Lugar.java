
/**
 * Escreva uma descrição da classe Lugar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lugar
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private boolean livre;
    private Autocarro autocarro;
    
    public Lugar(int id, boolean livre)
    {
        this.id = id;
        this.livre = livre;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int Id)
    {
        this.id = id;
    }
    
    public boolean getLivre()
    {
        return this.livre;
    }
    
    public void setLivre(boolean livre)
    {
        this.livre = livre;
    }
    
    public Autocarro getAutocarro()
    {
        return this.autocarro;
    }
    
    public void setAutocarro(Autocarro autocarro)
    {
        this.autocarro = autocarro;
    }
    
}