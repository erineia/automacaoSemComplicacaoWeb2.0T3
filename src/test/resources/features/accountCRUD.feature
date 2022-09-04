#language:pt
Funcionalidade: Account CRUD

  @CadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos do cadastro estiverem preenchido com
    | username | chronosTeste|
    | email    | erineiavs@gmail.com|
    |password | Senha123            |
    |country | Brasil               |
    Entao deve ser possivel logar no sistema apos o cadastro