package co.com.choucair.retoPractico01.Serenityweb.interactions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BotonCrearBussinessUnit implements Task {

    public static BotonCrearBussinessUnit crearNueva() {
        return Tasks.instrumented(BotonCrearBussinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity.botonNewBusinessUnit));
    }
}
