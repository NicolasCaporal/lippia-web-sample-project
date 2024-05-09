@createProject
Feature: CrearProyecto
Background:
    Given tengo la sesion iniciada
    And estoy en la sección Create New Proyect

@crearProyectoExitoso @exitoso
Scenario: Creacion de nuevo proyecto exitoso
When ingreso un nombre de proyecto unico
And presiono el boton Create Project
Then el sistema crea el nuevo proyecto correctamente
