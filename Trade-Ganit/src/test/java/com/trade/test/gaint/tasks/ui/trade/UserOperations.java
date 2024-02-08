package com.trade.test.gaint.tasks.ui.trade;
import java.util.Map;
import java.util.logging.Logger;

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
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;

public class UserOperations extends UIInteractions implements Task{

	private static Logger logger = Logger.getLogger(UserOperations.class.getName());
	private static String usertype;
	private static String firstname;
	private static String lastname;
	private static String emailid;
	private static String phonenumber;
	private static String username;
	private static String password;
	
	public UserOperations(String usertype, String firstname, String lastname, String emailid, String phonenumber, String username, String password) {
		this.usertype = usertype;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
	}

	public static UserOperations fromUnderlineDetails(DataTable userinfo) {
		Map<String, String> userinfodata = ConvertCucumberDataTable.toMap(userinfo);
		usertype = userinfodata.get("UserType");
		firstname = userinfodata.get("FirstName");
		lastname = userinfodata.get("LastName");
		emailid = userinfodata.get("EmailId");
		phonenumber = userinfodata.get("PhoneNumber");
		username = userinfodata.get("UserName");
		password = userinfodata.get("Password");

		return new UserOperations(usertype, firstname, lastname, emailid, phonenumber, username, password);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(SelectFromOptions.byVisibleText(usertype).from(UserPage.USER_TYPE));
		
		actor.attemptsTo(Enter.keyValues(firstname).into(UserPage.FIRST_NAME));
		
		actor.attemptsTo(Enter.keyValues(lastname).into(UserPage.LAST_NAME));
		
		emailid = "usermail"+CommonUtil.generateRandomNumber()+"@gmail.com";
		waitABit(999);
		
		actor.attemptsTo(Enter.keyValues(emailid).into(UserPage.EMAIL_ID));
		
		phonenumber = CommonUtil.generateNineDigitNumber()+"2";
		waitABit(999);
		
		actor.attemptsTo(Enter.keyValues(phonenumber).into(UserPage.PHONE_NUMBER));
		
		username = "username"+CommonUtil.generateRandomNumber();
		waitABit(999);
		
		actor.attemptsTo(Enter.keyValues(username).into(UserPage.USER_NAME));
		
		actor.remember(Key.USER_NAME, username);
		waitABit(999);
		
		DataHelper.writeUserInfo(username);
		
		actor.attemptsTo(Enter.keyValues(password).into(UserPage.PASSWORD));
		waitABit(999);
		
		actor.attemptsTo(Click.on(UserPage.SUBMIT_BUTTON));
		
	}

}
