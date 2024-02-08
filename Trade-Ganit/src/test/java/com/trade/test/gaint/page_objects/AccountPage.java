package com.trade.test.gaint.page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountPage extends PageObject {

	public static Target USER_NAME = Target.the("User Name").locatedBy("//input[@name='username']");
	public static Target CATEGORY = Target.the("Category").locatedBy("(//div[contains(text(),' Category ')]/following::select)[1]");
    public static Target ACCOUNT_TYPE = Target.the("Account type").locatedBy("(//div[contains(text(),'Account Type')]/following::select)[1]");
    public static Target NAME = Target.the("Name").locatedBy("//input[@placeholder='Name']");
    public static Target UCC = Target.the("Ucc").locatedBy("//input[@placeholder='UCC']");
    public static Target BROKER_CODE = Target.the("Broker code").locatedBy("(//div[contains(text(),'Broker Code')]/following::select)[1]");
    public static Target ADDRESS = Target.the("Address").locatedBy("//input[@placeholder='Address']");
    public static Target PANNUMBER = Target.the("Pan number").locatedBy("//input[@placeholder='PAN Number']");
    public static Target PORTFOLIO_SIZE = Target.the("Portfolio size").locatedBy("//input[@placeholder='Portfolio Size']");
    public static Target SUBMIT_BUTTON = Target.the("Submit").locatedBy("//button[@type='submit']");
    public static Target SELECT_USERNAME = Target.the("User name").locatedBy("//span[@class='mdc-list-item__primary-text']");
    
}
