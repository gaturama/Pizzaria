import java.util.ArrayList;

public class Sabor {

    private int id;
    private String descricao;
    private Pizza pizza;

    public static ArrayList<Sabor> sabores = new ArrayList<Sabor>();

    public Sabor(
        int id,
        String descricao,
        Pizza pizza
    ) {
        this.id = id;
        this.descricao = descricao;
        
        sabores.add(this);

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public static Sabor verificaId (int id) throws Exception{
        for (Sabor sabor : sabores){
            if (sabor.id == id){
                return sabor;
            }
        }

        throw new Exception("Sabor não encontrado");
    }
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Descrição: " + descricao + "\n"
            + "Pizza: " + this.idPizza + "\n";
}
