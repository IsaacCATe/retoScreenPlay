package co.com.choucair.retoPractico01.Serenityweb.tasks;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {


    public static Login loginUsuario() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity.botonLogin));
    }
}
