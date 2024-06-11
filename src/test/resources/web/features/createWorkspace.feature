@createWorkspace
Feature: CrearWorkspace
Background:
  Given tengo la sesion iniciada con mail cuydufalma@gufum.com y contraseña tortugamaritima

@crearWorkspaceExitoso @exitoso
  Scenario: Creacion de nuevo workspace exitoso
    When ingreso un nombre de workspace unico
    And presiono el boton Create Workspace
    Then el sistema crea el nuevo workspace correctamente
