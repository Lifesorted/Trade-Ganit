package com.trade.test.gaint.questions.ui;

import com.trade.test.gaint.page_objects.HomePage;

import net.serenitybdd.screenplay.Question;


public class ApplicationEnquiryResult {
 
	HomePage homepage;
	private static final String statusval = "Verified";
    public static Question<String> hasApplicationNumber() {
        return (actor) -> HomePage.VERIFY_LOGIN_LABEL.resolveFor(actor).getText();
    }
    
    public static Question<String> hasVerificationStatus() {
        return (actor) -> statusval;
    }    
}
