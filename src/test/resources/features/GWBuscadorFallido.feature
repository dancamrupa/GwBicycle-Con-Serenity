Feature: HU-004 Buscador GW
  Yo como usuario de GW
  Quiero buscar en el buscador dos productos
  uno que exista y el otro no

  Scenario: Buscar el producto en el buscador de GW
    Given que me encuentro en la pagina de GW con la url https://gwbicycles.com/
    When busco un producto en el buscador
      |nombreProducto                       |
      |CARAMAÑOLA PLASTICA L-001L GW SHIMANO|
    Then podre ver el producto en pantalla

  Scenario: Buscar el producto en el buscador de GW
    Given que me encuentro en la pagina de GW con la url https://gwbicycles.com/
    When busco un producto en el buscador
      |nombreProducto       |
      |BICICLETA CON ALAS   |
    Then podre ver el producto en pantalla








