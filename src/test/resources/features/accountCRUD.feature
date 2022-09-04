#language:pt
Funcionalidade: Account CRUD

  @CadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos do cadastro estiverem preenchido com
      | username | neiasilva           |
      | email    | erineiavs@gmail.com |
      | password | Senha123            |
      | country  | Brasil              |
    Entao deve ser possivel logar no sistema apos o cadastro

  @RealizarLogin
  Cenario: Realizar login crud
    Dado que a modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | neiasilva |
      | password | Senha123  |
      | remember | false     |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

    @AlterarContaCRUD
    Cenario: Realizar Alteracao conta
      Dado que esteja logado no sistema com
        | login    | neiasilva |
        | password | Senha123  |
        | remember | false     |