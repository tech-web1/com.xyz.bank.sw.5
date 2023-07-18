package com.xyz.bank.testbase.testsuite;

import com.xyz.bank.pages.AddCustomerPage;
import com.xyz.bank.pages.BankManagerLoginPage;
import com.xyz.bank.testbase.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AddCustomerPage addPage;
    BankManagerLoginPage bank;

    @BeforeMethod
    public void inIt()
    {
        addPage = new AddCustomerPage();
        bank = new BankManagerLoginPage();
    }


    @Test(groups = {"sanity"})
    public void bankManagerShouldAddCustomerSuccessfully()
    {
        addPage. login();
        addPage.setAddCustomer();
        addPage.setFirstName("Sita");
        addPage.setLastName("Ram");
        addPage. setPostCode("PT7896L");
        addPage.setButton();
        addPage. setPopUp();
    }

    @Test(groups = {"smoke"})
    public void bankManagerShouldOpenAccountSuccessfully()
    {
        bank. setBank();
        bank.setOpenAccount();
        bank.setCustomer("ram sita");
        bank.pound("pound");
        bank.setProcess();
        bank.setPopUp();
    }
}
