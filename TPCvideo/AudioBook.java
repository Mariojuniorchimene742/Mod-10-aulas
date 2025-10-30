
/**
 * Escreva uma descrição da classe AudioBook aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AudioBook extends Book
{
    private int runTime;
    
    AudioBook(String title, String author, int runTime) {
        super(title, author, 0);
        
        this.runTime = runTime;
    }
}