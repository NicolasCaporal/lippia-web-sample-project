@login
Feature: Login

@manual @manualExitoso @exitoso
Scenario: Ingreso de sesion manual exitoso
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email cuydufalma@gufum.com y contraseña tortugamaritima
And presiono "Log in"
Then el sistema inicia sesión y redirige a la pantalla principal


@manual @manualFallido @fallido
Scenario Outline: Ingreso de sesion manual fallido por <causa>
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email <email> y contraseña 123456
And presiono "Log in"
Then el sistema informa Invalid email or password

Examples:
| causa                 | email                               |
| email no registrado   | usuario_no_registrado951@gmail.com  |
| contraseña incorrecta | nicolascaporal@gmail.com            |



@manual @manualFallido @fallido
Scenario Outline: Ingreso de sesion manual fallido por formato de email invalido
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email <email> y contraseña 123456
Then el sistema informa Email format is not valid

Examples:
| email         |
| abc@.com      |
| @gmail.com    |
| abc123        |
| nicolas@gmail |

@manual @manualFallido @fallido
Scenario: Ingreso de sesion manual fallido por formato de contraseña corta
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email cuydufalma@gufum.com y contraseña 12345
And presiono en cualquier lado
Then el sistema informa Password is not valid

@manual @manualCuentaBloqueada @fallido
Scenario: Ingreso de sesion manual fallido por cuenta bloqueada
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email tiltubaspa@gufum.com y contraseña 123456
And presiono "Log in"
Then el sistema informa Your account is temporarily locked. Check your email to proceed.


@manual @manualCuentaSinContraseña @fallido
Scenario: Ingreso de sesion manual fallido por cuenta sin contraseña
Given me encuentro en la ventana de "Log in"
When presiono "Log in manually"
And ingreso email nicolascaporal.unlp@gmail.com y contraseña 123456
And presiono "Log in"
Then el sistema informa This account doesn't have a password.
