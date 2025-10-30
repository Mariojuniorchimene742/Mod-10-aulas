
/**
 * Escreva uma descrição da classe ContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaBancaria
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular)
    {
        this.titular = titular;
    }
    
    public String getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public boolean depositar(double deposito)
    {
        if(deposito > 0)
        {
            this.saldo = this.saldo + deposito;
            
            return true;
        }
        
        return false;
    }
    
    public boolean levantar(double levantamento)
    {
        if(levantamento < this.saldo && levantamento >0)
        {
            this.saldo = this.saldo - levantamento;
            
            return true;
        }
    
        return false;
    }
    
    @Override
    public String toString()
    {
        return "Titular: " + titular + "\nSaldo: " + saldo;
    }
}