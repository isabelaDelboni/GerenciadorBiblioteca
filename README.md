# Sistema de Biblioteca em Java


## Informações Gerais sobre o Projeto
O Sistema de Biblioteca em Java é uma aplicação desenvolvida para gerenciar o acervo de uma biblioteca. Ele permite realizar operações como adicionar, modificar, buscar e emprestar diversos tipos de materiais de leitura. Os dados são armazenados de forma segura em arquivos para garantir que as informações estejam sempre disponíveis e íntegras.

## Informações sobre as Classes e suas Relações
O projeto é composto por várias classes distribuídas em diferentes pacotes:

### Pacote `controller`
- **AtualizarEmprestimo:** Responsável por atualizar o status dos empréstimos.
- **BuscarLivro:** Encarregado de buscar livros na biblioteca.
- **Gerenciador:** Classe principal que coordena e controla as operações do sistema.
- **GerenciadorFuncionario:** Gerencia operações relacionadas aos funcionários da biblioteca.
- **GerenciadorMembros:** Gerencia operações relacionadas aos membros cadastrados na biblioteca.
- **GerenciadorLivros:** Gerencia operações relacionadas aos livros no acervo da biblioteca.
- **GerenciadorEmprestimo:** Gerencia operações de empréstimo e devolução de materiais.

### Pacote `model`
- **Audiobook, CategoriaLivro, Ebook:** Representam diferentes tipos de materiais disponíveis na biblioteca.
- **Emprestimo:** Representa um empréstimo de material para um membro.
- **Evento:** Classe para representar eventos relacionados à biblioteca.
- **FuncaoFuncionario, Funcionario:** Representam os funcionários da biblioteca e suas funções.
- **Historico:** Armazena o histórico de operações realizadas no sistema.
- **Livraria:** Classe principal que mantém o registro do acervo da biblioteca.
- **Livro:** Representa um livro específico no acervo da biblioteca.
- **Membro:** Representa um membro cadastrado na biblioteca.
- **RelatorioLivros, RelatorioPessoas:** Classes para gerar relatórios sobre livros e membros.
- **StatusEmprestimos:** Enumeração para representar os diferentes estados de um empréstimo.

### Pacote `util`
- **Busca:** Utilitário para realizar buscas no sistema.
- **CriadorIdUnico:** Gera IDs únicos para novos registros no sistema.
- **DescricaoEnums:** Descrição das enumerações utilizadas no projeto.
- **Inputs:** Utilitário para captura de entrada de dados.

### Pacote `view`
- **Menu, MenuFuncionarios, MenuLivro, MenuEmprestimo, MenuMembro:** Classes que definem menus e interfaces de interação com o usuário.

### Pacote `data`
- **Arquivos .txt:** Todos os dados persistidos do sistema, como informações de livros, membros, funcionários, empréstimos, etc., são armazenados em arquivos de texto (.txt) dentro deste pacote. Isso garante a integridade e a disponibilidade das informações mesmo após o encerramento da aplicação.

As classes estão estruturadas para facilitar o gerenciamento e a manipulação dos dados relacionados ao acervo da biblioteca, interagindo entre si através de associações e agregações conforme necessário.

## Como Executar o Projeto
Para executar o projeto, você pode escolher entre duas opções:

### Utilizando o VS Code
1. Clone o repositório do GitHub localmente usando o comando:
git clone https://github.com/isabelaDelboni/GerenciadorBiblioteca.git 
2. Abra o VS Code e selecione a pasta do projeto.
3. Certifique-se de ter a extensão adequada para desenvolvimento Java instalada no VS Code, como o "Java Extension Pack".
4. Navegue até a classe principal do projeto e execute-a diretamente no VS Code.

### Utilizando o IntelliJ IDEA
1. Clone o repositório do GitHub localmente usando o comando:
git clone https://github.com/isabelaDelboni/GerenciadorBiblioteca.git 
2. Abra o IntelliJ IDEA e selecione a opção para abrir um projeto existente.
3. Selecione a pasta onde você clonou o repositório.
4. O IntelliJ deve reconhecer automaticamente o projeto como um projeto Java.
5. Localize e execute a classe principal do projeto dentro do IntelliJ.

Certifique-se de ter o JDK (Java Development Kit) instalado em seu ambiente local para compilar e executar o projeto.

## Uso do ChatGPT
Durante o desenvolvimento deste projeto, o ChatGPT foi utilizado como uma ferramenta auxiliar para:
- Organização do código e estrutura do projeto.
- Correção de erros que não eram facilmente identificados.
- Esclarecimento de dúvidas sobre a implementação de funcionalidades específicas.
- Verificação se a implementação estava alinhada com os requisitos e especificações do projeto.

O ChatGPT provou ser útil ao proporcionar insights rápidos e ajudar a garantir que o desenvolvimento do sistema de biblioteca estivesse conforme o planejado, economizando tempo e melhorando a compreensão do projeto.

## Referências e Recursos
Durante o desenvolvimento deste projeto, foram utilizados diversos recursos para auxiliar no entendimento e implementação:
- **Vídeo sobre Persistência de Dados e Exceções:** Um vídeo indiano específico que abordou conceitos de persistência de dados e tratamento de exceções, fornecendo insights valiosos para o desenvolvimento robusto do sistema.
- **Stack Overflow:** Utilizado para pesquisar soluções para problemas específicos e obter detalhes de implementação de funções e bibliotecas que não eram familiares à equipe de desenvolvimento.
- **Outros Sites de Referência:** Diversos sites foram consultados para informações adicionais sobre soluções de problemas e implementações específicas, ajudando a expandir o conhecimento técnico e a eficiência na resolução de desafios.

Esses recursos foram fundamentais para a conclusão bem-sucedida do projeto, oferecendo suporte valioso para a implementação de funcionalidades e a compreensão de boas práticas de desenvolvimento.

