
/**
 * Escreva uma descrição da classe ContaBancariaTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaBancariaTest
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main (String[] args)
    {
        ContaBancaria c1 = new ContaBancaria("JJ");
        
        boolean resultadoDoDeposito = c1.depositar(1000);
        
        mostrarMensagemDaOperacao(resultadoDoDeposito);
        
        boolean resultadoDoLevantamento = c1.levantar(1000);
        
        mostrarMensagemDaOperacao(resultadoDoLevantamento);
        
        System.out.println(c1.getSaldo());
        
    }
    
    public static void mostrarMensagemDaOperacao(boolean resultadoDaOperacao)
    {
        if(resultadoDaOperacao == true)
        {
            System.out.println("Operação Concluída com Sucesso");
        } 
        else
        {
            System.out.println("Operação Não pode ser Concluída");
        }
    }
}