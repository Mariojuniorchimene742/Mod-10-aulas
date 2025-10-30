/**
 * Escreva uma descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int salario;
    private String nome;
    private int genero;//Se for 0 é mulher se for 1 é homem

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(int id, int salario, String nome, int genero)
    {
      // inicializa variáveis de instância
      this.id = id;
      this.genero = genero;
      this.setSalario(salario);
      this.nome = nome;
    }
    
    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getSalario()
    {
        return this.salario;
    }
    
    public void setSalario(int id)
    {
        if(this.genero == 1){
            this.salario = salario * 2;
        } else {
            this.salario = salario / 2;
        }
        this.salario = salario;
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(int id)
    {
        this.nome = nome;
    }
    
    public int getGenero()
    {
        return this.genero;
    }

    public void setGenero(int genero)
    {
        this.genero = genero;
    }
}