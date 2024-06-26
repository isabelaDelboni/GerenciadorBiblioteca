public enum CategoriaLivro implements DescricaoEnum{
    CLASSICO("Classico"),
    TRAGEDIA("Tragedia"),
    FICCAO_CIENTIFICA("Ficcao Cientifica"),
    ACAO_AVENTURA("Acao/Aventura"),
    MISTERIO("Misterio"),
    ROMANCE("Romance"),
    HUMOR("Humor"),
    TERROR("Terror"),
    HQ("HQ"),
    BIOGRAFIA("Biografia"),
    RECEITAS("Receita(s)"),
    AUTO_AJUDA("Auto-ajuda"),
    RELIGIOSO_ESPIRITUAL("Religioso/Espiritual"),
    HISTORIA("Historia"),
    CIENTIFICO("Cientifico"),
    INFANTIL("Infantil"),
    DIDATICO("Didatico");

    String descricao;

    CategoriaLivro(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
    
}