public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        //cc.valorDisponivelEmprestimo = 1000;
        cc.valorDisponivelEmprestimo = 0;

        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.emprestimo(500);

        cc.imprimirExtrato();
    }
}
