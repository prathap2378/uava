package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class smallWorkPageElements {
	
@FindBy(xpath="//label[text()='Project Info']")
private WebElement proInfo_accordion;
@FindBy(xpath="//label[text()='Engineering']")
private WebElement engineering_accordion;
@FindBy(xpath="//label[text()='Commercial']")
private WebElement commercial_accordion;
@FindBy(xpath="//label[text()='Quote Info']")
private WebElement quoteInfo_accordion;
@FindBy(xpath="//div[@id='ui-accordion-sw_ProjectInfo-panel-0']")
private WebElement proInfoPanel;
@FindBy(xpath="//div[@id='ui-accordion-sw_engineering_AccorG2G3-panel-0']")
private WebElement eng_panel;
@FindBy(xpath="//div[@id='ui-accordion-sw_commercial_AccorG2G3-panel-0']")
private WebElement comm_panel;
@FindBy(xpath="//div[@id='ui-accordion-sw_quote_info-panel-0']")
private WebElement quote_info_panel;
@FindBy(xpath="//input[@value='Submit']")
private WebElement submitBtn;
@FindBy(xpath="//a[text()='OK']")
private WebElement mandatory_alert;

@FindBy(id="description")
private WebElement description;  //Sales to Operation Description element
public WebElement getDescription() {
	return description;
}
@FindBy(xpath="//a[text()='Upload Documents']")//Upload document link in Sales to operation
private WebElement upload_sales;

@FindBy(xpath="//input[@value='Link to File']")//Common for all page where this element being displayed as single
private WebElement linkTofilebtn;

@FindBy(xpath="//input[@class='icon comments-icon']")//Sales to operation comment bubble
private WebElement commentBubble;

public WebElement getCommentBubble() {
	return commentBubble;
}
public WebElement getLinkTofilebtn() {
	return linkTofilebtn;
}
public WebElement getUpload_sales() {
	return upload_sales;
}
public WebElement getMandatory_alert() {
	return mandatory_alert;
}
public WebElement getSubmitBtn() {
	return submitBtn;
}
public WebElement getProInfoPanel() {
	return proInfoPanel;
}
public WebElement getEng_panel() {
	return eng_panel;
}
public WebElement getComm_panel() {
	return comm_panel;
}
public WebElement getQuote_info_panel() {
	return quote_info_panel;
}

public WebElement getProInfo_accordion() {
	return proInfo_accordion;
}
public WebElement getEngineering_accordion() {
	return engineering_accordion;
}
public WebElement getCommercial_accordion() {
	return commercial_accordion;
}
public WebElement getQuoteInfo_accordion() {
	return quoteInfo_accordion;
}



}
