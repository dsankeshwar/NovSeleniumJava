package Interfaces_dummySelenium_Day16.dummySelenium;

public interface WebDriver extends SearchContext
{
    WebDriver get(String url); //Launch the application

    WebDriver getTitle();

    WebDriver pageSource();

    WebDriver getCurrentURL();
}