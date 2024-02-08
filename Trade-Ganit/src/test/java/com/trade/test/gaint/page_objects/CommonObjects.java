package com.trade.test.gaint.page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author dhiraj662364
 * @created 23/08/2022
 **/

public class CommonObjects extends PageObject {
    public static Target USERS_MENU = Target.the("users menu").locatedBy("(//p[contains(text(),'Users')])[1]");
    public static Target ADD_USER = Target.the("add user").locatedBy("//p[contains(text(),'Add User')]");
    public static Target GLOBAL_SEARCH = Target.the("Global search").locatedBy("//input[@name='quickSearchValue']");
    public static Target ACCOUNTS_MENU = Target.the("Accounts menu").locatedBy("(//p[contains(text(),'Accounts')])[1]");
    public static Target ADD_ACCOUNT = Target.the("add account").locatedBy("//p[contains(text(),'Add Account')]");
}
