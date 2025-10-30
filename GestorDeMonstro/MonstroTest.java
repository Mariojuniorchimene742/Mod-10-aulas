import java.util.ArrayList;
/**
 * Escreva uma descrição da classe MonstroTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MonstroTest
{
    public static void main (String[] args)
    {
        Monstro monstro1 = new Monstro("Arceus", "Fogo", 1001);
        Monstro monstro2 = new Monstro("Lucario", "ChatGpt", 75);
        Monstro monstro3 = new Monstro("Zekrom", "Elétrico e Dragão", 90);
        
        String infoMonstro1 = monstro1.toString();
        System.out.println(infoMonstro1);
        
        int nivelMonstro2 = monstro2.treinar();
        System.out.println(nivelMonstro2);
        
        int nivelMonstro1 = monstro1.treinar();
        System.out.println(nivelMonstro1);
        
        nivelMonstro1 = monstro1.treinar();
        System.out.println(nivelMonstro1);
        
        ArrayList<Monstro> armarioDeMonstros = new ArrayList<Monstro>();
        armarioDeMonstros.add(monstro1);
        armarioDeMonstros.add(monstro2);
        armarioDeMonstros.add(monstro3);
        //armarioDeMonstros.add(monstro1);
        armarioDeMonstros.add(monstro2);
        armarioDeMonstros.add(monstro3);
        
        System.out.println("O tamanho do armario: ");
        System.out.println(armarioDeMonstros.size());
        
        for(Monstro monstroTemp : armarioDeMonstros)
        {
            System.out.println("O monstro " + monstroTemp.getNome() + " = " + monstroTemp.getNivel());
        }
        
        for(Monstro monstroTemp : armarioDeMonstros)
        {
            if(monstroTemp.getNivel() > 100)
            {
                System.out.println("O monstro " + monstroTemp.getNome() + " = " + monstroTemp.getNivel());
            }
        }
        
        /*for(int i = 0; i < armarioDeMonstros.size(); i++)
        {
            if(armarioDeMonstros.get(i).getNivel() > 100)
            {
                armarioDeMonstros.remove(i);
            }
        }
        */
        System.out.println(armarioDeMonstros.size());
        
        ArrayList<Monstro> armarioDeMonstrosMaiorQueMil = new ArrayList<Monstro>();
        
        for(Monstro monstroTemp : armarioDeMonstros)
        {
            if(monstroTemp.getNivel() > 1000)
            {
                armarioDeMonstrosMaiorQueMil.add(monstroTemp);
            }
        }
        
        System.out.println("O número de monstros maior que mil no novo array é " + armarioDeMonstrosMaiorQueMil.size());
        
        //Verificar se no arraylist existe um monstro com o nome lucario
        boolean hasLucario = false;
        
        String nomeaProcurar = "Lucario";
        String nomeaProcurar2 = new String("Lucario");
        
        for(Monstro monstroTemp : armarioDeMonstros)
        {
            if(monstroTemp.getNome().equals(nomeaProcurar2))
            {
                hasLucario = true;
            }
        }
        
        System.out.println(hasLucario);
        
    }
}