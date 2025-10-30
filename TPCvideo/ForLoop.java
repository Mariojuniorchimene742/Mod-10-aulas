
/**
 * Escreva uma descrição da classe ForLoop aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ForLoop
{
    public static void main(String[] args) {
        // int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum = 0;
        /*
        for(int index = 0; index < numbers.length; index++){
            //System.out.println(numbers[index]);
            sum += numbers[index];
        }
        
        System.out.println(sum);
        
        int number = 5;
        
        for(int multiplier = 1; multiplier < 10; multiplier++){
            //System.out.println(numbers[index]);
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
        }*/
        
        for(int number = 1; number <= 10; number++) {
            for (int multiplier = 1; multiplier < 10; multiplier++){
                System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            }
        }
        
        int numbers[] = {1, 2, 3, 4, 5};
        
        /*for (int number : numbers){
            System.out.println(number);
        }*/
        
        for (int number : numbers){
            sum += number;
        }
        
        System.out.println(sum);
    }
}