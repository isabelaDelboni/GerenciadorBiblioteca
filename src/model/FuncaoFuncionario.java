public enum FuncaoFuncionario implements DescricaoEnum{
    BIBLIOTECARIO("Bibliotecario"),
    ASSISTENTE("Assistente"),
    ADMINISTRADOR("Adminstrador");

    String descricao;

    FuncaoFuncionario(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}

