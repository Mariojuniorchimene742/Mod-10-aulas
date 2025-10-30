
/**
 * Escreva uma descrição da classe UserTest2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UserTest2
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args) {
        /*User user = new User("Henrique Morais", "2008-01-02");*/
        
        Book pokemon = new Book("Pokemon", "Henrique Morais", 270);
        AudioBook onepiece = new AudioBook("Onepiece", "Sei Lá", 30000);
        Ebook naruto = new Ebook ("Naruto", "Sei Lá", 280, "PDF");
        
        System.out.println(onepiece.toString());
    }
}