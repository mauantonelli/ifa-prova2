package domain.entity;

public class Imovel {
    private int id;
    private String endereco;
    private String areaTotal;
    private Proprietario proprietario;

    public Imovel(int id, String endereco, String areaTotal, Proprietario proprietario) {
        this.id = id;
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.proprietario = proprietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(String areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }


    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", areaTotal='" + areaTotal + '\'' +
                ", proprietario=" + proprietario +
                '}';
    }
}
