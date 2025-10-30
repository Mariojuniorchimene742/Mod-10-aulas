
/**
 * Escreva uma descrição da classe Monstro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Monstro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String tipo;
    private int nivel;
    
    public Monstro(String nome, String tipo, int nivel)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    
    public int treinar()
    {
        this.nivel ++;
        return this.nivel;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getNivel()
    {
        return this.nivel;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.nome + " Tipo: " + this.tipo + " Nível: " + this.nivel;
    }
}