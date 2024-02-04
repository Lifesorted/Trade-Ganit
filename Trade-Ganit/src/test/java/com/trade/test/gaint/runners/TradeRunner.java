package com.trade.test.gaint.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/Admin_Login/admin_login.feature"},
        plugin = {"pretty"},
        glue = {"com.trade.test.gaint"},
        tags = "@SmokeTest",
        dryRun = false)

public class TradeRunner {

}
