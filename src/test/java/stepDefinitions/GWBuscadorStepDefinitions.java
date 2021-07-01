package stepDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import cucumber.api.java.Before;
import tasks.BuscarProductoEnGw;
import userInterface.GwUserInterface;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import java.io.IOException;

public class GWBuscadorStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que me encuentro en la pagina de GW con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeGWConLaUrlHttpsWwwGwBicyclesCom(String url) {
		OnStage.theActorCalled("Danny").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on("https://gwbicycles.com")));
	}

	@When("^busco el proudcto (.*) en el buscador$")
	public void buscoElProudctoEnElBuscador(String producto) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnGw.on(producto));
	}

	@Then("^podre ver el producto (.*) en pantalla$")
	public void podreVerElProductoEnPantalla(String producto) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(GwUserInterface.LBL_PRODUCTO_GW.of(producto)), WebElementStateMatchers.containsText(producto)));
	}
}
