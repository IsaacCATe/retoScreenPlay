package co.com.choucair.retoPractico01.Serenityweb.interactions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BotonSaveBussinessUnit implements Task {
    public static BotonSaveBussinessUnit guardarCampos() {
        return Tasks.instrumented(BotonSaveBussinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity.botonParentUnit));
        actor.attemptsTo(Click.on(PaginaSerenity.botonSelectParentUnit));
        actor.attemptsTo(Click.on(PaginaSerenity.botonSaveParentUnit));
    }
}
