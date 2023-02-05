package co.com.choucair.retoPractico01.Serenityweb.interactions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchProfeatures implements Interaction {

    public static SearchProfeatures selectBusinessUnit() {
        return Tasks.instrumented(SearchProfeatures.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity.botonOrganization));
        actor.attemptsTo(Click.on(PaginaSerenity.botonBussinesUnits));
    }
}
