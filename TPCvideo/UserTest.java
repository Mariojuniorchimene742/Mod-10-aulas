import java.time.LocalDate;
/**
 * Escreva uma descrição da classe UserTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UserTest
{
    public static void main(String[] args) {
        /*User user = new User("Henrique Morais", "2008-01-02");*/
        
        Book pokemon = new Book("Pokemon", "Henrique Morais", 270);
        AudioBook onepiece = new AudioBook("Onepiece", "Sei Lá", 30000);
        
        System.out.println(onepiece.toString());
        
        /*
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        user.getName(), user.getBirthDay().toString(), user.age());
        
        System.out.printf("%s has borrow these books: %s \n", 
        user.getName(), user.borrowedBooks());
        
        User youngerUser = new User();
        
        youngerUser.name = "Gabriel Morais";
        youngerUser.birthDay = LocalDate.parse("2013-03-14");
        
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
        
        User olderUser = new User();
        
        olderUser.name = "Henrique Morais";
        olderUser.birthDay = LocalDate.parse("2008-01-02");
        
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        olderUser.name, olderUser.birthDay.toString(), olderUser.age());*/
    }
}