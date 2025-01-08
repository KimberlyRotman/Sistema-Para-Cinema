package Controllers;

import Models.SessaoModel;
import java.util.ArrayList;
import java.util.List;

public class SessaoController implements InterfaceController<SessaoModel>{

    private final List<SessaoModel> sessoes;

    public SessaoController() {
        this.sessoes = new ArrayList<>();
    }

    @Override
    public void cadastrar(SessaoModel obj) {
        sessoes.add(obj);
        System.out.println("Sessão cadastrada com sucesso");
    }

    @Override
    public SessaoModel buscar(int id) {
        for (SessaoModel sessao : sessoes) {
            if (sessao.getCodSessao() == id) {
                return sessao;
            }
        }
        System.out.println("Sessão não encontrada!");
        return null;
    }

    public List<String> buscarAssento (int id){
        SessaoModel sessao = buscar(id);
        return sessao.getAssentosDisponiveis();
    }

    @Override
    public void editar(int id, SessaoModel obj) {
        for (int i = 0; i < sessoes.size(); i++) {
            if (sessoes.get(i).getCodSessao() == id) {
                sessoes.set(i, obj);
                System.out.println("Sessão editada com sucesso!");
                return;
            }
        }
        System.out.println("Sessão não encontrada!");
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < sessoes.size(); i++) {
            if (sessoes.get(i).getCodSessao() == id) {
                sessoes.remove(i);
                System.out.println("Sessão removida com sucesso!");
                return;
            }
        }
        System.out.println("Sessão não encontrada!");
    }

    @Override
    public List<SessaoModel> listarTodos() {
        return sessoes;
    }

    public void listarSessao(){
        System.out.println(sessoes);
    }

}