package Principal;

import Models.Cliente;
import Models.Conta;
import Models.Endereco;
import Models.Filme;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua Major Armando de Souza Melo", "116", "apto 403",
                "Boa Viagem", "Recife", "PE", "51030180");
        Endereco e2 = new Endereco("Rua Sá e Souza", "526", "bloco B", "Boa Viagem",
                "Recife", "PE", "51130300");
        Endereco e3 = new Endereco("Rua Teodoro da Fonseca", "895", "Apto 504", "Torre",
                "Recife", "PE", "51405900");

        Cliente cliente1 = new Cliente("Juliana Pacheco", "81993126785", "11917486421", e1);
        Conta conta1 = new Conta(cliente1, 854);
        Cliente cliente2 = new Cliente("Danilo Farias", "8199545684", "1111111111", e2);
        Conta conta2 = new Conta(cliente2, 855);
        Cliente cliente3 = new Cliente("Ercilia Pelozo", "81991329908", "93783850878", e3);
        Conta conta3 = new Conta(cliente3, 856);

        Filme f1 = new Filme("Salt", 2010, "Ação", 7.0);
        Filme f2 = new Filme("X-Men First Class", 2011, "Ação", 5.0);
        Filme f3 = new Filme("Inception", 2010, "Sci-Fi", 6.5);
        Filme f4 = new Filme("Avatar", 2009, "Aventura", 8.0);
        Filme f5 = new Filme("Titanic", 1997, "Romance", 4.5);
        Filme f6 = new Filme("Matrix", 1999, "Sci-Fi", 6.0);
        Filme f7 = new Filme("Avengers", 2012, "Ação", 7.5);
        Filme f8 = new Filme("Frozen", 2013, "Animação", 5.0);
        Filme f9 = new Filme("Shrek", 2001, "Animação", 4.0);
        Filme f10 = new Filme("Gladiator", 2000, "Ação", 6.0);

        Filme[] filmes1 = {f1, f2};
        Filme[] filmes2 = {f3, f4, f5};
        Filme[] filmes3 = {f6};
        Filme[] filmes4 = {f7, f8, f9, f10};

        conta1.locarFilmes(filmes1);
        conta1.locarFilmes(filmes2);

        conta2.locarFilmes(filmes3);
        conta2.locarFilmes(filmes4);

        conta3.locarFilmes(filmes1);
        conta3.locarFilmes(filmes3);
        conta3.locarFilmes(filmes4);

        System.out.println(conta1.extratoHistorico());
        System.out.println(conta2.extratoHistorico());
        System.out.println(conta3.extratoHistorico());

    }
}
