import java.util.Comparator;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ArrayList aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ArrayLists
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println("before: "+ numbers.toString());
        
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println("after: "+ numbers.toString());
        
        // numbers.clear();
        // numbers.sort(Comparator.naturalOrder);
        // numbers.sort(Comparator.reverseOrder);
        
        System.out.println(numbers.toString());
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
    }
}