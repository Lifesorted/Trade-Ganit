package com.trade.test.gaint.tasks.ui.common;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.core.di.SerenityInfrastructure;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;

import static com.trade.test.gaint.page_objects.CommonObjects.*;
import static com.trade.test.gaint.page_objects.HomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import com.trade.test.gaint.questions.ui.Landing;
import com.trade.test.gaint.utils.CommonUtil;

import net.serenitybdd.screenplay.questions.Displayed;

public class Login implements Task {

    private EnvironmentVariables environmentVariables;

    private String username;

    private String pwd;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(NavigateTo.theLoginPage());

        actor.attemptsTo(
                WaitUntil.the(USERNAME, isClickable()).forNoMoreThan(5).seconds(),
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(pwd).into(PASSWORD),
                WaitUntil.the(LOGIN_BTN, isClickable()),
                Click.on(LOGIN_BTN)
        );
               
        CommonUtil.staticWaitFor(1500L);
        
        actor.should("Verify Landing on Home Page", seeThat(Landing.isComplete()));
                        
    }

    public Login(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public static Login withAgencyAdminCredentials() {
    	EnvironmentVariables environmentVariables = SerenityInfrastructure.getEnvironmentVariables();
        String username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("default.admin.username");
        String pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("default.admin.password");
        return new Login(username, pwd);
    }
}
