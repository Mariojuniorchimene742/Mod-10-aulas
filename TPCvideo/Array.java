import java.util.Arrays;
/**
 * Escreva uma descrição da classe Array aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Array
{
    public static void main(String[] args) {/*
        char vowels[] = new char[5];
        
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        
        System.out.println(Arrays.toString(vowels));*/
        
        // char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        int numbers[] = {1, 2, 3, 4, 5};
        // vowels[2] = 'x';
        /*
        int startingIndex = 1;
        // int endingIndex = 4;
        int endingIndex = 10;
        */
        // int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        // Arrays.sort(vowels, startingIndex, endingIndex);
        // Arrays.sort(vowels);
        
        // char key = 'x';
        
        // Arrays.binarySearch(vowels, key);
        
        // int foundItemIndex = Arrays.binarySearch(vowels, key);
        
        // Arrays.fill(vowels, startingIndex, endingIndex, 'x');
        Arrays.fill(numbers, 0);
        
        // System.out.println(Arrays.toString(vowels));
        // System.out.println(foundItemIndex);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(numbers == copyOfNumbers);
    }
}