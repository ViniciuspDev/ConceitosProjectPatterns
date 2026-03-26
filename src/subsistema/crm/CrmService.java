package subsistema.crm;

public class CrmService {
    private CrmService() {
        super();
    }
    public void migrarCliente(String nome, String cep){
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente gravado com sucesso no sistema CRM!");
        System.out.println("Cep: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Nome: " + nome);

    }
}
