import java.util.HashMap;
import java.lang.String;

/**
 * Escreva uma descrição da classe HashMap aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashMaps
{
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new  HashMap<String, Integer>();
        
        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengail", 100);
        examScores.put("Computer Programming", 100);
        
        // examScores.replace("Math", 70);
        // examScores.clear();
        // examScores.remove("Sociology");
        
        /*examScores.forEach((subject, score) -> {
           System.out.println(subject + " - " + score);
        });*/
        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score -10);
        });
        
        // System.out.println(examScores.containsKey("Math"));
        // System.out.println(examScores.toString());
        // System.out.println(examScores.get("English"));
        // System.out.println(examScores.getOrDefault("Religion", -1));
        // System.out.println(examScores.size());
        // System.out.println(examScores.containsValue(100));
        // System.out.println(examScores.containsValue(Integer.valuesOf(100)));
        // System.out.println(examScores.isEmpty());
    }
}