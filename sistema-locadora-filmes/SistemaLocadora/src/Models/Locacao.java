package Models;

import java.util.Date;

public class Locacao {
    private Date data;
    private double valorTotalAPagar;
    private Filme[] listaFilmes;
    private int contadorFilmes;

    public Locacao() {
        this.listaFilmes = new Filme[10];
        this.contadorFilmes = 0;
        this.valorTotalAPagar = 0;
    }

    public Locacao(Date data) {
        this();
        this.data = data;
    }

    public void addFilme(Filme filme) {
        if(contadorFilmes < listaFilmes.length) {
            listaFilmes[contadorFilmes] = filme;
            valorTotalAPagar += filme.getValorLocacao();
            contadorFilmes++;
        }
    }

    public Date getData() {
        return data;
    }

    public double getValorTotalAPagar() {
        return valorTotalAPagar;
    }

    public Filme[] getListaFilmes() {
        return listaFilmes;
    }

    public int getContadorFilmes() {
        return contadorFilmes;
    }
}
