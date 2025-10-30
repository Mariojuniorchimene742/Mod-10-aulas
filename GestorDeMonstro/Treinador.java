import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Treinador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Treinador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private ArrayList<Monstro> equipa;

    /**
     * Construtor para objetos da classe Treinador
     */
    public Treinador(String nome)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.equipa = new ArrayList<Monstro>();
    }
    
    public void capturarMonstro(Monstro m)
    {
        this.equipa.add(m);
    }
    
    public boolean libertarMonstro(String nomeMonstro)
    {
        for(int i = 0; i < this.equipa.size(); i++)
        {
            Monstro monstroTemp = this.equipa.get(i);
            if(monstroTemp.getNome().equals(nomeMonstro))
            {
                this.equipa.remove(i);
                return true;
            }
        }
        
        return false;
        
    }
    
    public void mostrarEquipa()
    {
        for(Monstro m : this.equipa)
        {
            System.out.println(m.toString());
        }
    }
    
    public void treinarTodos()
    {
        for(Monstro m : this.equipa)
        {
            m.treinar();
        }
    }
}