package Models;

import java.util.Date;

public class Conta {
    private Cliente cliente;
    private int numero;
    private double saldoDevedor;
    private Locacao [] historicoLocacao;
    private int contadorLocacao;

    public Conta(){
        this.saldoDevedor = 0;
        this.contadorLocacao = 0;
        this.historicoLocacao = new Locacao[20];
    }

    public Conta(Cliente cliente, int numero){
        this();
        this.cliente = cliente;
        this.numero = numero;
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao locacao = new Locacao(new Date());
        for(Filme filme : filmes) {
            if(filme != null) {
                locacao.addFilme(filme);
            }
        }
        if(contadorLocacao < historicoLocacao.length) {
            historicoLocacao[contadorLocacao] = locacao;
            contadorLocacao++;
        }
        saldoDevedor += locacao.getValorTotalAPagar();
    }

    public String extratoHistorico() {
        StringBuilder sb = new StringBuilder();
        sb.append("Histórico de Locações de ").append(cliente.getNome()).append("\n");
        for(int i = 0; i < contadorLocacao; i++) {
            Locacao loc = historicoLocacao[i];
            sb.append(loc.getData()).append(" ");
            for(Filme f : loc.getListaFilmes()) {
                if(f != null) {
                    sb.append(f.getTitulo()).append(" ");
                }
            }
            sb.append("\n").append(loc.getValorTotalAPagar()).append("\n");
        }
        return sb.toString();
    }

    public void pagarDebito(double valor) {
        saldoDevedor -= valor;
        if(saldoDevedor < 0) saldoDevedor = 0;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}

