package co.com.choucair.retoPractico01.Serenityweb.tasks;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login2 implements Task {
    public static Login2 loginUsuario()  {
        return Tasks.instrumented(Login2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity2.botonLogin));
    }
}
