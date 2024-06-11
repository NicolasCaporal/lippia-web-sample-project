@createWorkspace
Feature: CrearWorkspace
Background:
  Given me encuentro en la ventana de "Log in"
  And presiono "Log in manually"
  And ingreso email cuydufalma@gufum.com y contraseña tortugamaritima
  And presiono "Log in"
  And el sistema inicia sesión y redirige a la pantalla principal

@crearWorkspaceExitoso @exitoso
Scenario: Creacion de nuevo workspace exitoso
When ingreso un nombre de workspace unico
And presiono el boton Create Workspace
Then el sistema crea el nuevo workspace correctamente
