public class TesteCliente {
    public static void main(String[] args) {
        EscreverCliente.escrever(new Cliente("Gabriel", 123, new Endereco(), 12345678));
        EscreverCliente.escrever(new Cliente("Maria", 124, new Endereco(), 1234567889));
        EscreverCliente.escrever(new Cliente("Carlos", 125, new Endereco(), 1234567890));
        EscreverCliente.escrever(new Cliente("Pedro", 126, new Endereco(), 1234567890));
        
        LerCliente.ler();
    }
}
