package co.com.choucair.retoPractico01.Serenityweb.tasks;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearBussinessUnit implements Task {
    public static CrearBussinessUnit llenarCampos() {
        return Tasks.instrumented(CrearBussinessUnit.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Acme unit").into(PaginaSerenity.inputOrganizationValue));
    }
}
