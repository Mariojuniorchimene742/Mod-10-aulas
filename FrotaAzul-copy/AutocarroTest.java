
/**
 * Escreva uma descrição da classe AutocarroTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AutocarroTest
{
    public static void main(String[] args){
        Autocarro autocarro1 = new Autocarro(18, "01-AZ-99");
        System.out.println(autocarro1.getId());
        System.out.println(autocarro1.getMatricula());
        
        System.out.println(autocarro1.toString());
        
        
        Autocarro autocarro2 = new Autocarro(12, "55-AZ-55");
        
        autocarro2.setMatricula("yy");
        
        System.out.println(autocarro2.toString());
        
        Autocarro autocarro3 = autocarro2.clone();
        
        System.out.println(autocarro3.toString());
        
        autocarro3.setMatricula("zz");
        
        System.out.println(autocarro2.toString());
        
        
    }
}