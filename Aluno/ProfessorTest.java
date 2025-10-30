
/**
 * Escreva uma descrição da classe ProfessorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ProfessorTest
{
    public static void main(String[] args){
        //System.out.println("Ola");
        // 1. Criar um objeto do tipo professor
        Professor professo1 = new Professor(11, 1000, "Francisco", 1);
        System.out.println(professo1.getSalario());
        professo1.setSalario = 5000000;
        System.out.println(professo1.getSalario());
        
        // 2. Criar outro objeto do tipo professor
        Professor professo2 = new Professor(12, 1200, "Maria", 0);
        professo2.setSalario = 1000000;
        System.out.println(professo2.getSalario());
        
        // 3. Imprimir o nome do professo1
        System.out.println(professo1.getNome());
        // 4. Imprimir o salario do professo2
        System.out.println(professo2.getSalario());
        // 5. Alterar o salario do professor1 para 1400 euros
        professo1.setSalario(1400);
        System.out.println(professo1.getSalario());
        
        System.out.println(professo2.getSalario());
        
    }
}