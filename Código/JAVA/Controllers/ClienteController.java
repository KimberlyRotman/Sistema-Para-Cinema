package Controllers;
import Models.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<>();
    }

    // Método para cadastrar um cliente
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    // Método para deletar um cliente pelo CPF
    public void deletarCliente(int cpf) {
        Cliente clienteEncontrado = buscarCliente(cpf);
        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            System.out.println("Cliente deletado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    // Método para exibir todos os clientes cadastrados
    public void exibirTodosClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    // Método para exibir um cliente específico pelo CPF
    public void exibirCliente(int cpf) {
        Cliente clienteEncontrado = buscarCliente(cpf);
        if (clienteEncontrado != null) {
            System.out.println(clienteEncontrado);
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    // Método para editar um cliente pelo CPF
    public void editarCliente(int cpf, Cliente clienteAtualizado) {
        Cliente clienteEncontrado = buscarCliente(cpf);
        if (clienteEncontrado != null) {
            // Atualizando as informações
            clienteEncontrado.setContatoTel(clienteAtualizado.getContatoTel());
            clienteEncontrado.setEmail(clienteAtualizado.getEmail());
            clienteEncontrado.setIdade(clienteAtualizado.getIdade());
            clienteEncontrado.setIngressosComprados(clienteAtualizado.getIngressosComprados());
            clienteEncontrado.setNome(clienteAtualizado.getNome());
            clienteEncontrado.setTipo(clienteAtualizado.getTipo());
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    // Método auxiliar para buscar cliente pelo CPF
    private Cliente buscarCliente(int cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null;
    }
}
