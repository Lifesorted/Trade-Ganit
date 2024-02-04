package com.trade.test.gaint.questions.ui;

import com.trade.test.gaint.page_objects.HomePage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @author dhiraj662364
 * @created 11/04/2022
 **/

public class Landing extends UIInteractionSteps implements Question<Boolean> {

    private HomePage homePage;

    public static Landing isComplete() {
        return new Landing();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return homePage.isLandingComplete(actor);
    }

}
