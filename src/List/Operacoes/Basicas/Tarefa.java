package List.Operacoes.Basicas;

public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao) {
            this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Descrição da Tarefa" + "=" + "(" + descricao + ")";
    }
}
