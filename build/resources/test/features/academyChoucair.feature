#Autor: Juan Esteban Olaya

  @stories

  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Chocair Academy with the automation course

  @scenario1
  Scenario: Search for an automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser | strPassword |
    | TuUsuario  | TuClave  |
    When he search for the course on the choucair academy platform
    | strCourse   |
    | Metodologia Bancolombia |
    Then he fins the course called resources
    | strCourse   |
    | Metodologia Bancolombia |