package co.com.choucair.retoPractico01.Serenityweb.tasks;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirBrowser implements Task {

    private PaginaSerenity paginaSerenity;

    public static AbrirBrowser urlApp() {
        return Tasks.instrumented(AbrirBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSerenity));
    }
}
