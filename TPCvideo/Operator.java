
/**
 * Escreva uma descrição da classe Operator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Operator
{
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 6;
        
        // addition
        System.out.println(number1 + number2); // 18
        
        // subtraction
        System.out.println(number1 - number2); // 6
        
        // multiplication
        System.out.println(number1 * number2); // 72
        
        // division
        System.out.println(number1 / number2); // 2
        
        // remainder (modulo/modulus)
        System.out.println(number1 % number2); // 0
        
        // is equal to
        System.out.println(number1 == number2);
        
        // is equal to
        System.out.println(number1 != number2);
        
        // is greater than
        System.out.println(number1 > number2);
        
        // is less than
        System.out.println(number1 < number2);
        
        // is greater than or equal to
        System.out.println(number1 >= number2);
        
        // is less than or equal to
        System.out.println(number1 <= number2);
        
        int age = 25;
        
        // age >= 18
        // age <= 40
        
        System.out.println(age >= 18 && age <= 40);
        
        boolean isStudent = false;
        boolean isLibraryMember = true;
        
        System.out.println(isStudent || isLibraryMember);
        
        int score = 0;
        int turns = 10;
        
        score++;
        turns--;
        
        System.out.println(score);
        System.out.println(turns);
        
        int number = 55;
        
        number++;
        
        System.out.println(number);
        
        char percentSign = '%';
        
        System.out.println(percentSign);
    }
}