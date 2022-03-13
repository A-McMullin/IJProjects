package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*

        GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.openBrowser();
        fireFox.loadPage("www.google.com");
        fireFox.testThePage();
        fireFox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closeBrowser();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage("www.google.com");
        ie.testThePage();
        ie.closeBrowser();
       */
        Browser browser=(new GoogleChrome(), new FireFox(), new Safari());
        for (Browser b : browser) {
            b.openBrowser();
            b.loadPage();
            b.testThePage();
            b.closeBrowser();
        }
    }
}
