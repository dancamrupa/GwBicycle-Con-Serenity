package stepDefinitions;

import java.util.List;
import models.Producto;
import java.io.IOException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnGw;
import userInterface.GwUserInterface;
import variablesGlobales.VaribalesGlobales;


public class GWBuscadorBackgroundStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());//arrancar el actor del serenity
    }


    @When("^busco un producto en el buscador$")
    public void buscoUnProductoEnElBuscador(List<Producto> productos ) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnGw.on(productos.get(0).getNombreProducto()));

    }

    @Then("^podre ver el producto en pantalla$")
    public void podreVerElProductoEnPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(GwUserInterface.LBL_PRODUCTO_GW.of(VaribalesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VaribalesGlobales.nombreProductoAleatorio)));
    }
}
