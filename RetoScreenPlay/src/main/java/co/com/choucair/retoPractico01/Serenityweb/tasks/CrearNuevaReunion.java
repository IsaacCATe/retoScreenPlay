package co.com.choucair.retoPractico01.Serenityweb.tasks;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearNuevaReunion implements Task {
    public static CrearNuevaReunion llenarCampos() {
        return Tasks.instrumented(CrearNuevaReunion.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Reunion Año 2").into(PaginaSerenity2.meetingName));
        actor.attemptsTo(Enter.theValue("2020261").into(PaginaSerenity2.meetingNumber));

    }
}
