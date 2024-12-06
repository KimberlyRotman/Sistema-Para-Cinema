/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author kimberly.rotman
 */
import java.util.List;

public interface Cadastro<T> {
    void adicionar(T objeto); // Adiciona um objeto
    List<T> listar();         // Retorna a lista de objetos
    T buscarPorNome(String nome); // Busca por nome
}

