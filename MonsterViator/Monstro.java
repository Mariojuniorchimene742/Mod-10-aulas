
public final class Monstro extends Criatura
{
    private static final String TIPO=
    public Monstro(String nome,String tipo,int asas)
    {
        super(nome,tipo);
    }
    
    public String atacar()
    {
        StringBuilder sb =  new StringBuilder();
        
        sb.append(this.getnome());
        sb.append("Ataca com uma força monstruoa");
        
        return sb.toString();
    }
}