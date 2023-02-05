package co.com.choucair.retoPractico01.Serenityweb.tasks;


import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirBrowser2 implements Task {

    private PaginaSerenity2 paginaSerenity2;

    public static AbrirBrowser2 urlApp() {
        return Tasks.instrumented(AbrirBrowser2.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSerenity2));
    }
}
