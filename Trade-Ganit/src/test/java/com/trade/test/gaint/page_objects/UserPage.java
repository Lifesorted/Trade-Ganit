package com.trade.test.gaint.page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject{

	public static Target USER_TYPE = Target.the("User type").locatedBy("//div[contains(text(),'User Type')]/following::select");
    public static Target FIRST_NAME = Target.the("First Name").locatedBy("//input[@placeholder='First Name']");
    public static Target LAST_NAME = Target.the("Last Name").locatedBy("//input[@placeholder='Last Name']");
    public static Target EMAIL_ID = Target.the("Email Id").locatedBy("//input[@placeholder='Email Id']");
    public static Target PHONE_NUMBER = Target.the("Phone Number").locatedBy("//input[@placeholder='Phone Number']");
    public static Target USER_NAME = Target.the("User Name").locatedBy("//input[@placeholder='Username']");
    public static Target PASSWORD = Target.the("Password").locatedBy("//input[@placeholder='Password']");
    public static Target SUBMIT_BUTTON = Target.the("Submit").locatedBy("//button[@type='submit']");
    
}
