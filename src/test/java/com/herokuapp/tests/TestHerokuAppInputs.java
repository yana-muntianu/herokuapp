package com.herokuapp.tests;

import com.herokuapp.pages.HerokuappInputPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHerokuAppInputs extends TestSetup {

    final static Logger LOG = LoggerFactory.getLogger(TestHerokuAppInputs.class);

    @Test(testName = "Test input field on /inputs page")
    public void inputValidDataIntoInputFieldTest() {

        LOG.info("Start: Test input field on /inputs page ");

        HerokuappInputPage inputPage = new HerokuappInputPage(getDriver());
        inputPage.navigateToInputsPage()
                .setInputText("1234");

        Assert.assertEquals(inputPage.getTextFromInput(), "1234", "Text is different:");

        LOG.info("Finished: Test input field on /inputs page ");
    }
}
