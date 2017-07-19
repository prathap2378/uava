package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EngReviewInvoveUi {
	
	//***********Engg Review********
	@FindBy(id="Type_of_Project")
	private WebElement reviewProjectType;
	
	@FindBy(id="Product_Specified")
	private WebElement reviewProduct;
	
	@FindBy(id="_End_User_Industry_Sector")
	private WebElement reviewEnduserindustrysector;
	
	@FindBy(id="Type_of_Building")
	private WebElement reviewBuldingtype;
	
	public WebElement getReviewProjectType(){
		return reviewProjectType;
	}
	public WebElement getReviewProduct() {
	return reviewProduct;
	}

	public WebElement getReviewEnduserindustrysector() {
		return reviewEnduserindustrysector;
	}

	public WebElement getReviewBuldingtype() {
		return reviewBuldingtype;
	}
	
	///*********Engg Involvement********
	@FindBy(id="Product_Specified")
	private WebElement involveProduct;
	
	@FindBy(id="_End_User_Industry_Sector")
	private WebElement involveEndUserindustrysector;
	
	@FindBy(id="Type_of_Building")
	private WebElement involveBuldingtype;
	
	@FindBy(id="Type_of_Project")
	private WebElement involveProjectType;

	public WebElement getInvolveProjectType() {
		return involveProjectType;
	}
	public WebElement getInvolveProduct() {
		return involveProduct;
	}

	public WebElement getInvolveEndUserindustrysector() {
		return involveEndUserindustrysector;
	}

	public WebElement getInvolveBuldingtype() {
		return involveBuldingtype;
	}
	
	
	}
