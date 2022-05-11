# Autor : Cristian Avendaño Cadavid
@stories
  Feature: StartSharp
    As a user, I want change the language to spanish and portuguese
    Background:
      Given that user log in in the StartSharp page
        |strUsername|strPassword|
        |  admin    |serenity   |

    @Spanish
    Scenario: change language Spanish
      When he user change the language of the page
      Then he can see the plataform in spanish

    @portuguese
    Scenario: change language portuguese
      When he user change the language of the page
      Then he can see the plataform in spanish
