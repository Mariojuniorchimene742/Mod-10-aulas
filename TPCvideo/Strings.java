import java.lang.String;

/**
 * Escreva uma descrição da classe String aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Strings
{
    public static void main(String[] args) {
       // String name = "Henrique Morais";
        
       // String name = new String("Henrique Morais");
        
       // System.out.println(name);
        
       String literalString1 = "abc";
       String literalString2 = "abc";
        
       String objectString1 = new String("xyz");
       String objectString2 = new String("xyz");
        
       System.out.println(literalString1 == literalString2);
        
       System.out.println(objectString1 == objectString2);
        
        
       String name = "Henrique Morais";
       String country = "Portugal";
       int age = 26;
       String company = "freeCodeCamp";
       double gpa = 3.8;
       char percentSign = '%';
       boolean amITellingTheTruth = false;
       
       System.out.println
       ("Hello world! I am " + name + " I am from " + country + " and I am " + age + 
       " years old. I work for " + company + ".");
       
       
       String formattedString = String.format(
           "My name is %s I am from %s and I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", name, country, age, company, gpa, percentSign, amITellingTheTruth);
       
       System.out.println(String.format(
           "My name is %s I am from %s and I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", name, country, age, company, gpa, percentSign, amITellingTheTruth));
       
       String string1 = new String("abc");
       String string2 = new String("ABC");
       
       System.out.println(string1.equals(string2));
       
       
       String string = "The sky is blue.";
       
       System.out.println(string.replace("blue", "red"));
       
      
       //String string = "The sky is blue.";
       
       String updatedString = string.replace("blue", "red");
       
       System.out.println(updatedString);
       
    }
}