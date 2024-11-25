package domain.entity;

public class Locacao {
    private int id;
    private String dataInicio;
    private String dataFim;
    private double valorAluguel;
    private Inquilino inquilino;
    private Imovel imovel;

    public Locacao(int id, String dataInicio, String dataFim, double valorAluguel, Inquilino inquilino, Imovel imovel) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorAluguel = valorAluguel;
        this.inquilino = inquilino;
        this.imovel = imovel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", valorAluguel=" + valorAluguel +
                ", inquilino=" + inquilino +
                ", imovel=" + imovel +
                '}';
    }
}
