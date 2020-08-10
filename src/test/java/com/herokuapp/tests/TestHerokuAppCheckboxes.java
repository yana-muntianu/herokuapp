package com.herokuapp.tests;

import com.herokuapp.pages.HerokuappCheckboxesPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHerokuAppCheckboxes extends TestSetup {

    final static Logger LOG = LoggerFactory.getLogger(TestHerokuAppInputs.class);

    @Test(testName = "Tick unchecked checkbox")
    public void tickUncheckedCheckbox() throws InterruptedException {

        LOG.info("Start: Tick unchecked checkbox ");

        HerokuappCheckboxesPage checkboxesPage = new HerokuappCheckboxesPage(getDriver());
        checkboxesPage.navigateToCheckboxesPage().tickCheckbox();

        Assert.assertTrue(checkboxesPage.isCheckboxChecked(), "Checkbox is not checked");

        LOG.info("Finish: Tick unchecked checkbox ");
    }
}
