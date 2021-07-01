Feature: HU-002 Buscador GW
         Yo como usuario de GW
         Quiero buscar en el buscador un producto
         Para ver el producto en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de GW con la url <Url>
    When busco el producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples:
      | Escenario                                            | Url                    |
      | Buscar un producto aleatorio en la pagina GW exitoso | https://gwbicycles.com |

