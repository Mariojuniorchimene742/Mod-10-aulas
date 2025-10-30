
/**
 * Escreva uma descrição da classe While aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class While
{
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;
        
        while(multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            
            multiplier++;
        }
    }
}