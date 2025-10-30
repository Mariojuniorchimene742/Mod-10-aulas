
/**
 * Escreva uma descrição da classe Booleans aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Booleans
{
    public static void main(String[]args)
    {
        int x = 5;
        int y = 3;
        int z = 5;
        //> > == >= <= !=

        boolean compare = x < y && y > z || z + 2 < 5;

        System.out.println(compare);
    }
}