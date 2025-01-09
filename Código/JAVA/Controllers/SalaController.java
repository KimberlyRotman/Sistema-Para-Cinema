package Controllers;

import Models.SalaModel;
import java.util.ArrayList;
import java.util.List;

public class SalaController implements InterfaceController<SalaModel>{
    private final List<SalaModel> salas;

    public SalaController() {
        this.salas = new ArrayList<>();
    }
    
    public List<String> ofereceAssentos(int id){
        
        for (SalaModel sala : salas) {
            if (sala.getCodSala() == id) {
                SalaModel salinha =  sala;
                System.out.println("Sala encontrada");
                return salinha.getAssentos();
            }
        }
        System.out.println("Sala não encontrada");
        return null;
    }

    @Override
    public void cadastrar(SalaModel sala) {
        salas.add(sala);
        System.out.println("Sala cadastrada com sucesso");
    }

    @Override
    public SalaModel buscar(int codSala) {
        for (SalaModel sala : salas) {
            if (sala.getCodSala() == codSala) {
                return sala;
            }
        }
        System.out.println("Sala não encontrada!");
        return null;
    }

    @Override
    public void editar(int codSala, SalaModel novaSala) {
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).getCodSala() == codSala) {
                salas.set(i, novaSala);
                System.out.println("Sala editada com sucesso!");
                return;
            }
        }
        System.out.println("Sala não encontrada!");
    }

    @Override
    public void remover(int cod) {
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).getCodSala() == cod) {
                salas.remove(i);
                System.out.println("Sala removida com sucesso!");
                return;
            }
        }
        System.out.println("Sala não encontrada!");
    }

    @Override
    public List<SalaModel> listarTodos() {
        if (salas.isEmpty()) {
            System.out.println("Nenhuma sala cadastrado.");
            return null;
        }
        System.out.println("\n=== Lista de Salas (ID e capacidade geral) ===");
        for (SalaModel sala : salas) {
            System.out.println("ID: " + sala.getCodSala() + " | Assentos: " + sala.getCapacidadeGeral());
        }
        return null;
    }


}