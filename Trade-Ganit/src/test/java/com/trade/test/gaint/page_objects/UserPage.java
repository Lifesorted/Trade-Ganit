package com.trade.test.gaint.page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject{

	public static Target USER_TYPE = Target.the("User type").locatedBy("//select[@class='form-input mt-4 fullwidth ng-pristine ng-star-inserted ng-invalid ng-touched']");
    public static Target FIRST_NAME = Target.the("First Name").locatedBy("//input[@placeholder='First Name']");
}
