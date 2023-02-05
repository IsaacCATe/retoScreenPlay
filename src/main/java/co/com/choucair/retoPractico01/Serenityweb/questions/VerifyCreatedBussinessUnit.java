package co.com.choucair.retoPractico01.Serenityweb.questions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyCreatedBussinessUnit implements Question {
    public static VerifyCreatedBussinessUnit resultado() {
        return new VerifyCreatedBussinessUnit();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaSerenity.txtoNewBussinesUnit).answeredBy(actor);
    }
}
