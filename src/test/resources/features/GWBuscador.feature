Feature: HU-001 Buscador GW
         Yo como usuario de GW
         Quiero buscar en el buscador un producto
         Para ver el producto en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de GW con la url <Url>
    When busco el proudcto <Producto> en el buscador
    Then podre ver el producto <Producto> en pantalla

    Examples:
      | Escenario                                    | Producto                                     | Url                    |
      | Buscar palabra en el buscador de GW exitoso  | SIMULADOR ELITE NOVO MAG SPEED               | https://gwbicycles.com |
      | Buscar palabra en el buscador de GW exitoso  | BICICLETA RIN12 BUGS                         | https://gwbicycles.com |
      | Buscar palabra en el buscador de GW exitoso  | BICICLETA PLEGABLE ALUMINIO 20P MONTREAL GW  | https://gwbicycles.com |
      | Buscar palabra en el buscador de GW exitoso  | CARAMAÑOLA PLASTICA S-114 GW SHIMANO         | https://gwbicycles.com |
      | Buscar palabra en el buscador de GW exitoso  | BICICLETA 700C GW LUMEN 9VEL.                | https://gwbicycles.com |
