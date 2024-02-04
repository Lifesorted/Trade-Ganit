package com.trade.test.gaint.tasks.ui.dm;
import java.util.Map;
import java.util.logging.Logger;

import com.trade.test.gaint.utils.ConvertCucumberDataTable;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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
		password = userinfodata.get("password");

		return new UserOperations(usertype, firstname, lastname, emailid, phonenumber, username, password);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
	
	}

}
