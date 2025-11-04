import java.util.ArrayList;
/**
 * Escreva uma descrição da classe MonsterViatorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MonsterViatorTest
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu própri

    /**
     * Construtor para objetos da classe MonsterViatorTest
     */
    public static void main (String[] args)
    {
    
       
       Fada f1 = new  Fada("Fada1",20);
       Fada f2 = new Fada("Fada2",30);
       Fada f3 = new Fada("Fada3",40);
        
       Monstro m1 = new Monstro("Monstro1");
       Monstro m2 = new Monstro("Monstro2");
       Monstro m3 = new Monstro("Monstro3");
       
       ArrayList<Fada> fadas = new ArrayList();
       
       fadas.add(f1);
       fadas.add(f2);
       fadas.add(f3);
        
       int numFadas = fadas.size();
       System.out.println(numFadas);
       
       Fada newF1 = fadas.get(0);
       Fada newF2 = fadas.get(1);
       Fada newF3 = fadas.get(2);
       
       fadas.add(f2);
       
       Fada newF4 = ultimoArray(fadas);
       System.out.println(newF4.getAsas()); 

    }     
    
    public static Fada ultimoArray(ArrayList<Fada>fadas)
    {
        //tamanho do array
        int numFadas = fadas.size();
        //A ultima  posição do Arraylist
        int ultimoIndex = numFadas -1 ;
        // 0 ultimo objecto do ArrayList
        Fada  ultimaFada = fadas.get(ultimoIndex);
        
        return ultimaFada;
    }
    
    public static Fada  primeiroArray(ArrayList<Fada> fadas)
    {
        //A primeira posição do Arraylist
        int primeiroIndex = 0;
        // 0 ultimo objecto do ArrayList
        Fada  primeiraFada = fadas.get(primeiroIndex);
        
        return primeiraFada;
    }
    
    /*
     *  um metodo  que retorna o primeiro elemento da lista se o tamanho do arrayList for
     *  menor ou igual 2  retorna caso contrário retorna o ultimo
     */
     
     
     public static Fada ultraDummy(ArrayList<Fada> fadas)
     {
         int numFadas = fadas.size();
         final int FLA_VAR = 2;
         
         if(numFadas <= 2)
         {
             return  primeiroArray(fadas);
         }else{
            return ultimoArray(fadas);
        }
      }