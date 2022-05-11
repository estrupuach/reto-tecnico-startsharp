# Autor : Cristian Avendaño Cadavid
@stories
  Feature: StartSharp
    As a user, I want change the language to portuguese

    @portuguese
    Scenario: change language to portuguese
      Given that user log in in the StartSharp page
        |strUsername|strPassword|
        |  admin    |serenity   |
      When he user change the language of the page
      Then he can see the Painel de instrumentos
