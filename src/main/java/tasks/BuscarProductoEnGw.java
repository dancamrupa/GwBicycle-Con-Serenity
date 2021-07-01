package tasks;

import interactions.Esperar;
import userInterface.GwUserInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import variablesGlobales.VaribalesGlobales;

public class BuscarProductoEnGw implements Task{

    private String producto;

    public BuscarProductoEnGw(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GwUserInterface.BTN1_BUSCADOR_GW),
                Enter.theValue(producto).into(GwUserInterface.TXT_BUSCADOR_GW),
                Click.on(GwUserInterface.BTN2_BUSCADOR_GW),
                Click.on(GwUserInterface.BTN3_PRODUCTO_GW.of(producto)),
                Esperar.estosSegundos(30)
                );
        VaribalesGlobales.nombreProductoAleatorio = GwUserInterface.LBL_PRODUCTO_GW.of(producto).resolveFor(actor).getText();

    }

    public static BuscarProductoEnGw on(String producto) {
        return Instrumented.instanceOf(BuscarProductoEnGw.class).withProperties(producto);
    }
}
