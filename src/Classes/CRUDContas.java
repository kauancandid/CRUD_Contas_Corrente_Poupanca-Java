package Classes;

import java.util.ArrayList;

public class CRUDContas {

    private ArrayList<Conta> contas = new ArrayList<>();

    public boolean adicionar(Conta conta) {
        contas.add(conta);
        return true;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return " CONTAS ADICIONADAS \n"
                + contas;
    }

}
