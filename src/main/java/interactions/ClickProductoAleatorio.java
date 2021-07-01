package interactions;

import java.util.List;
import java.util.Random;
import userInterface.GwUserInterface;
import net.serenitybdd.screenplay.Actor;
import variablesGlobales.VaribalesGlobales;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.core.pages.WebElementFacade;


public class ClickProductoAleatorio implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();

        List<WebElementFacade> listaBotonesProductos = GwUserInterface.BTN_PRODUCTO_ALEATORIO_GW.resolveAllFor(actor);
        List<WebElementFacade> listaNombresProductos = GwUserInterface.LBL_NOMBRE_PRODUCTO_ALEATORIO_GW.resolveAllFor(actor);

        int numeroAleatorio = random.nextInt(listaBotonesProductos.size());
        VaribalesGlobales.nombreProductoAleatorio = listaNombresProductos.get(numeroAleatorio).getText();
        listaBotonesProductos.get(numeroAleatorio).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Performable on(){
        return Instrumented.instanceOf(ClickProductoAleatorio.class).withProperties();
    }
}
