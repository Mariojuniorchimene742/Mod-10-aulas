
public class Criatura
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    //variaveis de classe
    private static final String Reino ="Monster viator";
    private static int contadorDeCriaturas;
    private final String nome;
    private final String tipo;

   
    public Criatura( String nome,String tipo)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.tipo = tipo;
        this.contadorDeCriaturas = this.contadorDeCriaturas +1;
    }
        
        public String getnome()
    {
        return this.nome;
    }
    
    public String getTipo()
    {
      return this.tipo;
    } 
    
    public String exibirInformaçoes()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nome").append(this.nome).append("\n");
        sb.append("Tipo:").append(this.tipo).append("\n");
        sb.append("Reino").append(this.Reino).append("\n");
        sb.append("numero de criaturas:").append(this.contadorDeCriaturas)
        .append("\n");
        
        return sb.toString();
        
    }
    

    
}