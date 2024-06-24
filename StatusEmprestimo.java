public enum StatusEmprestimo implements DescricaoEnum{
    EM_EMPRESTIMO("Em emprestimo"),
    RETORNADO("Retornado"),
    ATRASADO("Atrasado");
    
    private String descricao;

    StatusEmprestimo(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}