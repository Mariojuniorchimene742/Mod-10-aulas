
/**
 * Escreva uma descrição da classe Ebook aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ebook extends Book
{
    private String format;
    
    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        
        this.format = format;
    }
}