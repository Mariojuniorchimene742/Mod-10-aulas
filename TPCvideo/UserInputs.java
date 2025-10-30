import java.util.Scanner;
/**
 * Escreva uma descrição da classe UserInputs aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UserInputs
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name?");
        String name = scanner.nextLine();
        
        System.out.printf("Hello %s. How old are you?", name);
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.printf("%d is an excellent age to start programming? What language do you prefer", age);
        String language = scanner.nextLine();
        
        System.out.printf("%s is a very popular programming language?", language);
        
        scanner.close();
        
    }
}