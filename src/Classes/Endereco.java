package Classes;

public class Endereco {

    private String cidade;
    private String rua;
    private String bairro;
    private int numero;

    public Endereco(String cidade, String rua, String bairro, int numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String Cidade) {
        this.cidade = Cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String Rua) {
        this.rua = Rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "Cidade=" + cidade + ", Rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + '}';
    }

}
