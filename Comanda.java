import java.util.ArrayList;

public class Comanda {
    
    private int id;
    private int numero;
    private String data;
    private int idPizza

    public static ArrayList<Comanda> comandas = new ArrayList<Comanda>();

    public Comanda(
        int id,
        int numero,
        String data
    ){
        this.id = id;
        this.numero = numero;
        this.data = data;

        comandas.add(this);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero})
         this.numero = numero;                   
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public static Comanda verificaId (int id) throws Exception{
        for (Comanda comanda : comandas){
            if (comanda.id == id){
                return comanda;
            }
        }

        throw new Exception("Comanda não encontrado");
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Número: " + numero + "\n"
            + "Data: " + data + "\n"
            + "Pizza: " + this.idPizza + "\n"
        
}
