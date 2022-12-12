import java.util.ArrayList;

public class Cliente{

    private int id;
    private String nome;
    private int cpf;
    private int telefone;
    private String endereco;
    private int idPizza;
    
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(
        int id,
        String nome, 
        int telefone,
        int cpf,
        String endereco,
        int idPizza
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;

        clientes.add(this);

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public String getEndereco (){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public static Cliente verificaId (int id) throws Exception{
        for (Cliente cliente : clientes){
            if (cliente.id == id){
                return cliente;
            }
        }

        throw new Exception("Cliente não encontrado");
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Nome: " + nome + "\n"
            + "CPF: " + cpf + "\n"
            + "Telefone: " + telefone + "\n"
            + "Endereço: " + endereco + "\n"
            + "Pizza: " + " this.idPizza" + "\n";

}
