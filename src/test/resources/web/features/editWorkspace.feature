@editarWorkspace
Feature: editWorkspace
  Background:
    Given tengo la sesion iniciada

  @crearWorkspaceExitoso @exitoso
  Scenario: Creacion de nuevo workspace exitoso
  Given estoy en la seccion Workspace Setings
  When modifico el nombre del Workspace
  And presiono en cualquier lugar
  Then el sistema actualiza el nombre del Workspace
