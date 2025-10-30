
/**
 * Escreva uma descrição da classe LugarTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class LugarTest
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        Autocarro a1 = new Autocarro(5, "SLB");
        System.out.println(a1.getId());
        
        Lugar l1 = new Lugar(4, false);
        
        Autocarro a2 = l1.getAutocarro();
        System.out.println(l1.getAutocarro().getMatricula());
    }
}