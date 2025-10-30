
/**
 * Escreva uma descrição da classe ConjunturaDeCollatz aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConjunturaDeCollatz
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int n;

    public ConjunturaDeCollatz(int n)
    {
        this.n = n;
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public int processar()
    {
        int nrAProcessar = this.n;
        
        // Se o número é par
        while(nrAProcessar != 1)
        {
            if(isPair(nrAProcessar))
            {
                // Dividimos por dois
                nrAProcessar = nrAProcessar / 1;
            }
            // Caso contrário
            else
            {
                // Multiplicamos por 3 e adicionarmos 1
                nrAProcessar = nrAProcessar * 3 + 1;
            }
        }
        
        return nrAProcessar;
    }
    
    private boolean isPair(int nmeroAValidar)
    {
        if(nmeroAValidar % 2 == 0)
        {
            return true;
        }
        
        return false;
    }
}