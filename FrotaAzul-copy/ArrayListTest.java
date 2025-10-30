import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ArrayListTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ArrayListTest
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        
        String carAtPosition2 = cars.get(2);
        
        cars.add(2, "citroen");
        System.out.println(cars);
        
        boolean has = cars.contains("Ford");
        System.out.println(has);
    }
}