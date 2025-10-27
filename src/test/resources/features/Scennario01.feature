Feature: Envío de correo desde Gmail

  Scenario Outline: Enviar correo a destinatario parametrizado
    Given el usuario accede a Gmail
    And inicia sesión con credenciales válidas
    When redacta un correo a "<destinatario>" con asunto y mensaje
    Then el correo se envía correctamente

    Examples:
      | destinatario            |
      | voidself@gmail.com      |
