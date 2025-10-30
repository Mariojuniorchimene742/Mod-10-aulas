import java.util.Scanner;

/**
 
Escreva uma descrição da classe NestedStatements aqui.
@author (seu nome)
@version (um número da versão ou uma data)*/
public class NestedStatements
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("Input your fav food: ");
            String food = sc.nextLine();
            System.out.println("You are an adult!");
        } 
        else if (age >= 13) {
            System.out.println("You are a teenager");
        } 
        else {
            System.out.println("You are not a teenager or an adult");
        }
    }
}