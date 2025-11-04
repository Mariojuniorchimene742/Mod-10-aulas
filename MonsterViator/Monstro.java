
public final class Monstro extends Criatura
{
    private static final String TIPO = "Monstro";
    public Monstro(String nome,int asas)
    {
        super(nome, TIPO);
    }
    
    public String atacar()
    {
        StringBuilder sb =  new StringBuilder();
        
        sb.append(this.getnome());
        sb.append("Ataca com uma força monstruoa");
        
        return sb.toString();
    }
}