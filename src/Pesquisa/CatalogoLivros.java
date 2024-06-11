package Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class CatalogoLivros {
    //Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDeFabricacao){
        livroList.add(new Livro(titulo, autor, anoDeFabricacao));
    }

    public List<Livro> pesquisarPeloAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro a: livroList){
                if(a.getAnoPublicacao() >= anoFinal && a.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(a);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro t : livroList){
                if(t.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = t;
                    break;
                }
            }
        }
        return  livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);


        System.out.println(catalogoLivros.pesquisarPeloAutor("Robert C." +
                " Martin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2021));
        System.out.println(catalogoLivros.livroList.size());
    }
}
