
public final class Fada extends Criatura
{
    private static final String TIPO = "Fada";
    private int asas;
    
    public Fada(String nome, int asas)
    {
        super(nome, TIPO);
        
        this.asas = asas;
    }
    
       public int getAsas()
    {
        return this.asas;
    }
    
    public String voar()
    {
        return"A" +this.getnome() + "voa com "+this.getAsas() +"asas";
        
    }
}