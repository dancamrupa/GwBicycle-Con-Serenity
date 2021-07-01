Feature: HU-003 Buscador GW
         Yo como usuario de GW
         Quiero buscar en el buscador un producto
         Para ver el producto en la pagina

  Background:
    Given que me encuentro en la pagina de GW con la url https://gwbicycles.com/

  Scenario: Buscar el producto en el buscador de GW
    When busco un producto en el buscador
      |nombreProducto                       |
      |CARAMAÑOLA PLASTICA L-001L GW SHIMANO|
    Then podre ver el producto en pantalla

  Scenario: Buscar el producto en el buscador de GW
    When busco un producto en el buscador
      |nombreProducto       |
      |BICICLETA FIXIE GW   |
    Then podre ver el producto en pantalla

  Scenario: Buscar el producto en el buscador de GW
    When busco un producto en el buscador
      |nombreProducto                                        |
      |BICICLETA MTB 29 GW JACKAL 9.3 D/B HIDRAULICO 9 VEL.  |
    Then podre ver el producto en pantalla

  Scenario: Buscar el producto en el buscador de GW
   When busco un producto en el buscador
      |nombreProducto                              |
      |BICICLETA 700C GW LUMEN 9VEL.               |
    Then podre ver el producto en pantalla

