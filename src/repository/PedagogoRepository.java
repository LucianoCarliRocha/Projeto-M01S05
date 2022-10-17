package repository;

import model.Pedagogo;

import java.util.ArrayList;
import java.util.List;

public class PedagogoRepository {
    private List<Pedagogo> dadosPedagogos = new ArrayList<>();
    public void inserirPedagogo(Pedagogo pedagogo) {
        dadosPedagogos.add(pedagogo);
    }
}
