package Pages;

import stepDefinition.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class BasePage {

    public void type(By locator, String data) {
        WebElement element = DriverWrapper.getDriver().findElement(locator);
        element.sendKeys(data);
    }

    public void clickOn(By locator) {
        WebElement element = DriverWrapper.getDriver().findElement(locator);
        element.click();
    }

    public void selectFromDropdownUsingVisibleText(By locator, String selectThis) {
        WebElement dropdownElement = DriverWrapper.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(selectThis);
    }

    public void selectFromDropdownUsingValue(By locator, String selectThis) {
        WebElement dropdownElement = DriverWrapper.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(selectThis);
    }

    public void selectFromDropdownUsingIndex(By locator, int selectThis) {
        WebElement dropdownElement = DriverWrapper.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(selectThis);
    }

    public boolean isElementSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    public boolean isElementSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean isElementDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    public boolean isElementEnabled(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isEnabled();
    }

    public String getTextFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public String getAttributeValueForWebElement(By locator, String attribute) {
        return DriverWrapper.getDriver().findElement(locator).getAttribute(attribute);
    }

    public void moveMouseToElement(By locator) {
        Actions act = new Actions(DriverWrapper.getDriver());
        WebElement element = DriverWrapper.getDriver().findElement(locator);
        act.moveToElement(element);
    }

    public void moveMouseToElement(WebElement element) {
        Actions act = new Actions(DriverWrapper.getDriver());
        act.moveToElement(element);
    }

    public void selectFromAutoSuggestion(By suggestionsLocator, String userChoice) {
        List<WebElement> allSuggestionsElements = DriverWrapper.getDriver().findElements(suggestionsLocator);
        for (WebElement suggestionElement : allSuggestionsElements) {
            String suggestion = suggestionElement.getText();
            if (suggestion.equals(userChoice)) {
                suggestionElement.click();
                break;
            }
        }
    }

    public void scrollByPixel(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor)DriverWrapper.getDriver();
        js.executeScript("scrollBy(0," + String.valueOf(pixels) + ");");
    }

    public void scrollUptoElement(By locator) {
        WebElement element = DriverWrapper.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)DriverWrapper.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollUptoElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)DriverWrapper.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor)DriverWrapper.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }






}
