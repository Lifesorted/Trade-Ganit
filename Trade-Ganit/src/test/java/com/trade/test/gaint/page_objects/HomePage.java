package com.trade.test.gaint.page_objects;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {
    public static Target DASHBOARD_LINK = Target.the("Dashboard Link").locatedBy("//span[contains(text(),'Dashboard')]");
    public static Target DOWN_ARROW = Target.the("Down Arrow Link").locatedBy("//span[contains(text(),'Welcome Root')]//parent::a");
    public static Target LOGOUT = Target.the("Logout Link").locatedBy("//span[contains(text(),'Logout')]//ancestor::button");
    public static Target VERIFY_LOGIN_LABEL = Target.the("Verify Login Label").locatedBy("//div[contains(text(),'Login')]");
    public static Target USERNAME = Target.the("username").locatedBy("//input[@placeholder='Username']");
    public static Target PASSWORD = Target.the("password").locatedBy("//input[@placeholder='Password']");
    public static Target LOGIN_BTN = Target.the("submit").locatedBy("//button[@type='submit']");
        
    public boolean isLandingComplete(Actor actor) {

        double startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() < startTime + getWaitForTimeout().getSeconds() * 1000) {
            String previousState = BrowseTheWeb.as(actor).getDriver().getPageSource();
            waitABit(1500);
            if (previousState.equals(BrowseTheWeb.as(actor).getDriver().getPageSource())) {
                break;
            }
        }

        BrowseTheWeb.as(actor).waitFor(DASHBOARD_LINK.getCssOrXPathSelector());
        return DASHBOARD_LINK.isVisibleFor(actor);
    }
    
	/*
	 * 
	 * public List<String> getAscaMenu() { return findAll(ASCA_MENU).stream()
	 * .map(WebElementFacade::getText) .collect(Collectors.toList()); }
	 */
}