package com.trade.test.gaint.steps.ui;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;

import java.util.logging.Logger;

import com.trade.test.gaint.page_objects.HomePage;
import com.trade.test.gaint.tasks.ui.common.Login;
import com.trade.test.gaint.tasks.ui.common.NavigateTo;
import com.trade.test.gaint.tasks.ui.dm.UserOperations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.di.SerenityInfrastructure;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.model.util.EnvironmentVariables;

public class TradeUserSteps extends UIInteractionSteps{

	private static Logger logger = Logger.getLogger(TradeUserSteps.class.getName());
	static EnvironmentVariables environmentVariables = SerenityInfrastructure.getEnvironmentVariables();

	private Actor appAdmin;
		private HomePage homepage;
	
	@Before(order = 2)
	public void setup() {
		appAdmin = OnStage.theActor("AA");
	}
	
	@Given("{word} is on Home page of application and login")
	public void user_is_on_home_page_of_application_and_login(String role) {
		appAdmin.assignName(role);
		givenThat(appAdmin).attemptsTo(Login.withAgencyAdminCredentials());
	}
	
	@When("{word} clicks on logout option")
	public void clicks_on_logout_option(String role) {
		waitABit(1000);
		then(appAdmin).attemptsTo(Click.on(homepage.DOWN_ARROW));
		waitABit(1000);
		then(appAdmin).attemptsTo(Click.on(homepage.LOGOUT));
	}
	
	@Then("{word} should logout from application and navigate to login screen")
	public void should_logout_from_application_and_navigate_to_login_screen(String role) {
		waitABit(1000);
		then(appAdmin).attemptsTo(Ensure.that(homepage.VERIFY_LOGIN_LABEL).isDisplayed());
	}
	
	@Given("Navigate to respective screen")
	public void Navigate_to_respective_screen() {
		givenThat(appAdmin).attemptsTo(NavigateTo.userPage());
	}
	
	@When("attempts to add new user with details as")
	public void attempts_to_add_new_user_with_details_as(DataTable userinfo) {
		givenThat(appAdmin).attemptsTo(UserOperations.fromUnderlineDetails(userinfo));
	}
	
	@Then("Verify Added user on list screen")
	public void Verify_Added_user_on_list_screen() {
		
	}
}
