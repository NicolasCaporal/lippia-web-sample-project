@editarWorkspace
Feature: editWorkspace
  Background:
    Given me encuentro en la ventana de "Log in"
    And presiono "Log in manually"
    And ingreso email cuydufalma@gufum.com y contraseña tortugamaritima
    And presiono "Log in"
    And el sistema inicia sesión y redirige a la pantalla principal

  @crearWorkspaceExitoso @exitoso
  Scenario: Creacion de nuevo workspace exitoso
    Given estoy en la seccion Workspace Setings
    When modifico el nombre del Workspace
    And presiono en cualquier lugar
    Then el sistema actualiza el nombre del Workspace
