package org.example.PageObjecPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends DriverFactory {
    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Toys')]")
    WebElement toys ;
    @FindBy (css = "body.page-toys.pageType-ContentPage.template-pages-addon--customstorefrontaddon-pages-custom-customLandingPageTemplate.pageLabel--toys.language-en:nth-child(2) section.hidden-xs.hidden-sm div.container-fluid.head_bg div.container div.row:nth-child(2) div.col-md-12 div.content nav.navbar.navbar-default div.collapse.navbar-collapse.js-navbar-collapse ul.nav.navbar-nav li.col-md-15.col-sm-15.mega-dropdown.open:nth-child(1) ul.dropdown-menu.mega-dropdown-menu.row li.col-sm-3:nth-child(1) ul:nth-child(1) li:nth-child(4) > a:nth-child(1)")
    WebElement pokemon;

    public void Country() throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(toys).perform();
        action.moveToElement(pokemon).click().perform();
    }
}
