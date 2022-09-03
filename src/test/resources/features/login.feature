#language:pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @FecharModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada

  @FecharModalIcone
  Cenario: Fechar a modal ao clicar no ícone fechar
    Quando for realizado um clique no ícone de fechar
    Entao a janela modal deve ser fechada

  @CreateNewAccount
  Cenario: Link Create New Account
    Quando for realizado um clique no link Create New Account
    Entao a pagina Create Account deve ser exibida

    @LoginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | login   | password | remember |
      | todos os campos     | chronos | Senha123 | false    |
      | campos obrigatórios | chronos | Senha123 | true     |

      @LoginInvalido
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login    | password | remember |
      | usuário inválido | invalido | Senha123 | false    |
      | senha inválida   | chronos  | invalido | false    |

  @DadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>     |
      | password | <password>> |
      | remember | <remember>  |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | login   | password | remember |
      | usuário em branco |         | Senha123 | false    |
      | senha em branco   | chronos |          | false    |