import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ParqueEstacionamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ParqueEstacionamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numLugares;
    private String morada;
    private ArrayList<Lugar> lugares;
    
    public ParqueEstacionamento(int id, int numLugares, String morada)
    {
        this.id = id;
        this.numLugares = numLugares;
        this.morada = morada;
        this.lugares = new ArrayList<Lugar>();
        
        for(int i = 0; i <= this.numLugares; i++){
            Lugar l1 = new Lugar(i + 1, true);
            
            lugares.add(l1);
        }
        
        System.out.println(this.lugares.size());
    }
    
    public int numLugaresLivres()
    {
        int l = 0;
        
        for(int i = 0; i < this.lugares.size(); i++){
            
            Lugar lugarTemp = this.lugares.get(i);
            
            if(this.numLugaresLivres() == 1){
               l = l + 1;
            }
        }
        return l;
    }
    
    public int numLugaresOcupados()
    {
        int ocp = this.numLugares - numLugaresLivres();
        
        return ocp;
    }
    
    /*
     * método para verificar a disponibilidade de um lugar
     * passando a posição/index do arratlist
     * retorna true se o lugar tiver disponivel
     * e retorno falso se tiver ocupado
     */
    public boolean checkLugarLivre(int index)
    {
        if(index > this.numLugares || index < 0)
        {
            return false;
        }    
        Lugar lugarSelecionado = this.lugares.get(index);
        return lugarSelecionado.getLivre();
    }
    
    public boolean ocuparLugar(Autocarro autocarro)
    {
        for(int i = 0; i < this.lugares.size(); i++){
            
            Lugar lugarTemp = this.lugares.get(i);
            
            if(this.numLugaresLivres() == 1){
               lugarTemp.setLivre(false);
               lugarTemp.setAutocarro(autocarro);
               return true;
            }
        }
        
        return false;
    }
    
    public boolean ocuparLugar2(Autocarro autocarro)
    {
        for(int i = 0; i < this.lugares.size(); i++){
            
            Lugar lugarTemp = this.lugares.get(i);
            
            if(this.numLugaresLivres() == 1){
               lugarTemp.setLivre(false);
               lugarTemp.setAutocarro(autocarro);
               return true;
            }
        }
        
        return false;
    }
    
    public boolean desocuparLugar(Autocarro autocarro)
    {
        for(Lugar lugarTemp: this.lugares){
            
            if(this.numLugaresLivres() == 1)
            {
               lugarTemp.setLivre(false);
               lugarTemp.setAutocarro(autocarro);
               
               return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return("Id: " + this.id +
        "| Numero de lugares: " + this.numLugares +
        "| Morada: " + this.morada +
        "| Lugares: " + this.lugares);
    }    
}