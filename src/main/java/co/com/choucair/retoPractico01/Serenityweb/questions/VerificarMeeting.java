package co.com.choucair.retoPractico01.Serenityweb.questions;


import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarMeeting implements Question {
    public static VerificarMeeting resultado() {
        return new VerificarMeeting();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaSerenity2.leerMeetings).answeredBy(actor);
    }
}
