package EBAC.Modulo01.Domain;

public class FirstClass {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Olá Gabryell");
        cliente.setCodigo(2);
        cliente.cadastrarEndereco("Rua sete");
        cliente.imprimirEndereco();
        System.out.println(cliente.getCodigo());
        String end = cliente.recuperarEndereco();
        System.out.println(end);
        int valorTotal = cliente.valorTotal();
        System.out.println(valorTotal);
    }
}
