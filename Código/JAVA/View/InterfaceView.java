package View;

import java.util.List;

public interface InterfaceView<T> {
    // Método para obter dados de um objeto (exemplo: Filme, Usuário, etc.)
    T obterDados();

    // Método para exibir os detalhes de um objeto
    void exibir(T objeto);

}