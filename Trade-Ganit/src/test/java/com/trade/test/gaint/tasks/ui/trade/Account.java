package com.trade.test.gaint.tasks.ui.trade;

import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.Keys;

import com.trade.test.gaint.page_objects.AccountPage;
import com.trade.test.gaint.page_objects.UserPage;
import com.trade.test.gaint.utils.CommonUtil;
import com.trade.test.gaint.utils.ConvertCucumberDataTable;
import com.trade.test.gaint.utils.DataHelper;
import com.trade.test.gaint.utils.Key;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Account extends UIInteractions implements Task {

	private static Logger logger = Logger.getLogger(UserOperations.class.getName());
	private static String username;
	private static String category;
	private static String accounttype;
	private static String name;
	private static String ucc;
	private static String brokercode;
	private static String address;
	private static String pannumber;
	private static String portfoliosize;

	public Account(String username, String category, String accounttype, String name, String ucc,
			String brokercode, String address, String pannumber, String portfoliosize) {
		this.username = username;
		this.category = category;
		this.accounttype = accounttype;
		this.name = name;
		this.ucc = ucc;
		this.brokercode = brokercode;
		this.address = address;
		this.pannumber = pannumber;
		this.portfoliosize = portfoliosize;
	}

	public static Account fromUnderlineDetails(DataTable userinfo) {
		Map<String, String> userinfodata = ConvertCucumberDataTable.toMap(userinfo);
		username = userinfodata.get("UserName");
		category = userinfodata.get("Category");
		accounttype = userinfodata.get("AccountType");
		name = userinfodata.get("Name");
		ucc = userinfodata.get("UCC");
		brokercode = userinfodata.get("BrokerCode");
		address = userinfodata.get("Address");
		pannumber = userinfodata.get("PanNumber");
		portfoliosize = userinfodata.get("PortfolioSize");

		return new Account(username, category, accounttype, name, ucc, brokercode, address, pannumber, portfoliosize);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		waitABit(1500);
		actor.attemptsTo(Enter.keyValues(DataHelper.getRecord("Account", 1, 0)).into(AccountPage.USER_NAME));
		waitABit(2500);
		
		actor.attemptsTo(Click.on(AccountPage.SELECT_USERNAME));
		waitABit(900);
		
		actor.attemptsTo(SelectFromOptions.byVisibleText(category).from(AccountPage.CATEGORY));
		
		actor.attemptsTo(SelectFromOptions.byVisibleText(accounttype).from(AccountPage.ACCOUNT_TYPE));

		actor.attemptsTo(Enter.keyValues(name).into(AccountPage.NAME));

		actor.attemptsTo(Enter.keyValues(ucc).into(AccountPage.UCC));
		
		actor.attemptsTo(SelectFromOptions.byVisibleText(brokercode).from(AccountPage.BROKER_CODE));

		actor.attemptsTo(Enter.keyValues("25th jhon street").into(AccountPage.ADDRESS));
		waitABit(999);

		actor.attemptsTo(Enter.keyValues(pannumber).into(AccountPage.PANNUMBER));
		
		actor.attemptsTo(Enter.keyValues(portfoliosize).into(AccountPage.PORTFOLIO_SIZE).thenHit(Keys.TAB));
		
		actor.attemptsTo(Scroll.to(AccountPage.SUBMIT_BUTTON).andAlignToTop());

		actor.attemptsTo(Click.on(AccountPage.SUBMIT_BUTTON));

	}

}
