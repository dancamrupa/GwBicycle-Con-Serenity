package stepDefinitions;

import java.io.IOException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import userInterface.GwUserInterface;
import tasks.BuscarProductoAleatorioEnGw;
import variablesGlobales.VaribalesGlobales;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;


public class GWBuscadorAleatorioStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^busco el producto aleatorio en la pagina$")
    public void buscoElProductoAleatorioEnLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioEnGw.on());
    }

    @Then("^podre ver un producto aleatorio en pantalla$")
    public void podreVerUnProductoAleatorioEnPantalla(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(GwUserInterface.LBL_PRODUCTO_GW.of(VaribalesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VaribalesGlobales.nombreProductoAleatorio)));

    }

}
