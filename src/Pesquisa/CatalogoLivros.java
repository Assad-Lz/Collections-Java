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
                if(l.getAutor().equalsIgnoreCase()){
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
}
