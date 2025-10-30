import java.util.ArrayList;
/**
 * Escreva uma descrição da classe TreinadorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TreinadorTest
{
    public static void main (String[] args)
    {
        Monstro monstro1 = new Monstro("Arceus", "Fogo", 1001);
        Monstro monstro2 = new Monstro("Lucario", "ChatGpt", 75);
        Monstro monstro3 = new Monstro("Blastoise", "Elétrico e Dragão", 90);
        
        Treinador treinador1 = new Treinador("PeP");
        treinador1.capturarMonstro(monstro1);
        treinador1.capturarMonstro(monstro2);
        treinador1.capturarMonstro(monstro3);
        treinador1.mostrarEquipa();
        
        treinador1.treinarTodos();
        treinador1.mostrarEquipa();
        boolean libertou = treinador1.libertarMonstro("Arceus");
        System.out.println(libertou);
        
    }
}