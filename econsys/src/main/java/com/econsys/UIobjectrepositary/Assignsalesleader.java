package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assignsalesleader {
	
	@FindBy(id="st_salesleader")
	private WebElement Salesleader;
	
	@FindBy(id="st_salesleader")
	private String saleslead;
	
	@FindBy(css="input[value='View Work load']")
	private WebElement Viewworkload;
	
	@FindBy(id="st_Comments")
	private WebElement Comments;
	
	@FindBy(id="save")
	private WebElement Savebutton;
	
	@FindBy(id="allocate")
	private WebElement Allocate; 
	
	@FindBy(id="cancel")
	private WebElement Cancelbutton;

	public WebElement getSalesleader() {
		return Salesleader;
	}

	public String getSaleslead() {
		return saleslead;
	}

	public WebElement getViewworkload() {
		return Viewworkload;
	}

	public WebElement getComments() {
		return Comments;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}

	public WebElement getAllocate() {
		return Allocate;
	}

	public WebElement getCancelbutton() {
		return Cancelbutton;
	}

}
