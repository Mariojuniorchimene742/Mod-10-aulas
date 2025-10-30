
/**
 * Escreva uma descrição da classe Teste3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste3
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe Teste3
     */
    public Teste3()
    {
       String name = "John";
       System.out.println(name);
       int myNum = 15;
       System.out.println(myNum);
       float myFloatNum = 5.99f;
       char myLetter = 'D';
       boolean myBool = true;
       int myInt = 9;
       double myDouble = myInt;
       System.out.println(myInt);
       System.out.println(myDouble);
       int sum1 = 100 + 50;        
       int sum2 = sum1 + 250;      
       int sum3 = sum2 + sum2;
       Math.max(5, 10);
       boolean isJavaFun = true;
       boolean isFishTasty = false;
       System.out.println(isJavaFun);
       
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}