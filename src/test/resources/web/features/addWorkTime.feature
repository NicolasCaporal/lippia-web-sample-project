@addWorkTime @TP_Final
Feature: Añadir tiempo de trabajo
  Background:
    Given me encuentro en la ventana de "Log in"
    And presiono "Log in manually"
    And ingreso email cuydufalma@gufum.com y contraseña tortugamaritima
    And presiono "Log in"
    And el sistema inicia sesión y redirige a la pantalla principal


  @añadirTiempoDeTrabajoManual @exitoso
  Scenario: Añadir tiempo de trabajo Manual con Fecha y Hora
    Given estoy en la sección TimeTracker
    When presiono Manual Mode
    And ingreso una descripcion del trabajo
    And ingreso horario de inicio 09:30
    And ingreso horario de fin 12:00
    And ingreso fecha 05/06/2024
    And presiono el boton Add
    Then el sistema informa Time entry has been created
    And crea la entrada de trabajo correctamente

  @cancelarTiempoDeTrabajoTimer @exitoso
  Scenario: Añadir tiempo de trabajo con Timer
    Given estoy en la sección TimeTracker
    When presiono Timer Mode
    And presiono el boton Start
    And selecciono Discard
    Then el sistema informa Timer cancelled

  @modificarDatosTiempoTrabajo @exitoso
  Scenario: Modificar datos de tiempo de trabajo
    Given estoy en la sección TimeTracker
    And presiono Timer Mode
    And ingreso una descripcion del trabajo
    And presiono el boton Start
    And presiono el boton Stop
    And crea la entrada de trabajo correctamente
    
    When modifico la descripcion
    Then el sistema informa Successfully updated description
    When presiono el boton Billable
    Then el sistema informa Time entry successfully marked as billable
    When modifico la fecha de inicio y de fin
    Then el sistema informa Successfully updated date and time
    When asigno un proyecto nuevo
    Then el sistema informa Project has been updated
