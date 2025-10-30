/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Curso
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String nome;
    private String professores;
    private String disciplinas;

    /**
     * Construtor para objetos da classe Curso
     */
    public Curso()
    {
      // inicializa variáveis de instância
      
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getProfessores()
    {
        return this.professores;
    }

    public void setProfessores(String Professores)
    {
        this.professores = professores;
    }
    
    public String getDisciplinas()
    {
        return this.disciplinas;
    }

    public void setDisciplinas(String disciplinas)
    {
        this.disciplinas = disciplinas;
    }
    
}