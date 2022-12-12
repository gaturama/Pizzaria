import java.util.ArrayList;

public class Pizza {

    private int id;
    private String tamanho;

    public static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public Pizza (
        int id, 
        String tamanho
    ) {
        this.id = id;
        this.tamanho = tamanho;

        pizzas.add(this);
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public static Pizza verificarId(int id) throws Exception{
        for(Pizza pizza : pizzas){
            if(pizza.id == id){
                return pizza;
            }
        }
        throw new Exception("Produto não existe");
    }
    
    @Override 
    public String toString(){
        return "ID: " + id + "\n"
            + "Tamanho: " + tamanho + "\n";
    }
}   
