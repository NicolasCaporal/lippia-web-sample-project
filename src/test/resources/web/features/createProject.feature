@createProject
Feature: CrearProyecto
Background:
    Given me encuentro en la ventana de "Log in"
    And presiono "Log in manually"
    And ingreso email cuydufalma@gufum.com y contraseña tortugamaritima
    And presiono "Log in"
    And el sistema inicia sesión y redirige a la pantalla principal
    And estoy en la sección Create New Proyect

@crearProyectoExitoso @exitoso
Scenario: Creacion de nuevo proyecto exitoso
When ingreso un nombre de proyecto unico
And presiono el boton Create Project
Then el sistema crea el nuevo proyecto correctamente
