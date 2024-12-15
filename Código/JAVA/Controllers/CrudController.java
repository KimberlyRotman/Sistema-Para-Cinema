package Controllers;

import java.util.List;

public interface CrudController<T> {
    void cadastrar(T obj);
    T buscar(int id);
    void editar(int id, T obj);
    void remover(int id);
    List<T> listarTodos();
}
