package com.trade.test.gaint.tasks.ui.common;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.trade.test.gaint.page_objects.CommonObjects;
import com.trade.test.gaint.page_objects.HomePage;
import com.trade.test.gaint.utils.CommonUtil;

public class NavigateTo {
	
    public static Performable theLoginPage() {
        return Task.where("{0} opens the login page",
                Open.browserOn().the(HomePage.class));
    }
    
    public static Performable userPage() {
        return Task.where("{0} opens the user page",
                (actor) -> {
                    actor.attemptsTo(
                            Click.on(CommonObjects.USERS_MENU)
                                    .then(WaitUntil.the(CommonObjects.ADD_USER, isVisible()))
                    );
                    actor.attemptsTo(
                            Click.on(CommonObjects.ADD_USER)
                    );
                    CommonUtil.staticWaitFor(2000L);
                }
        );
    }
    
    public static Performable accountsPage() {
        return Task.where("{0} opens the user page",
                (actor) -> {
                    actor.attemptsTo(
                            Click.on(CommonObjects.ACCOUNTS_MENU)
                                    .then(WaitUntil.the(CommonObjects.ADD_ACCOUNT, isVisible()))
                    );
                    actor.attemptsTo(
                            Click.on(CommonObjects.ADD_ACCOUNT)
                    );
                    CommonUtil.staticWaitFor(2000L);
                }
        );
    }
}
