package tasks;

import userInterface.GwUserInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import interactions.ClickProductoAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.actions.Click;


public class BuscarProductoAleatorioEnGw implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GwUserInterface.BTN4_ACCESORIOS_GW),
                ClickProductoAleatorio.on()
                );
    }

    public static BuscarProductoAleatorioEnGw on() {
        return Instrumented.instanceOf(BuscarProductoAleatorioEnGw.class).withProperties();
    }
}
