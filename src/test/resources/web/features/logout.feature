@logout
Feature: logout
  Background:
    Given tengo la sesion iniciada

  @logout @exitoso
  Scenario: Logout exitoso
    When abro el menu de mi foto de perfil
    And presiono el boton Logout
    Then el sistema cierra la sesion
