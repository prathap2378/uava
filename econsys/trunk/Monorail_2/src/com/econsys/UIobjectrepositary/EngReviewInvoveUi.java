package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EngReviewInvoveUi {
	
	//***********Engg Review********
	
	@FindBy(id="st_product")
	private WebElement reviewProduct;
	
	@FindBy(id="st_endUser")
	private WebElement reviewEnduserindustrysector;
	
	@FindBy(id="st_buildingType")
	private WebElement reviewBuldingtype;
	
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
	@FindBy(id="productCheckBox")
	private WebElement involveProduct;
	
	@FindBy(id="endUserCheckBox")
	private WebElement involveEndUserindustrysector;
	
	@FindBy(id="buildingTypeCheckBox")
	private WebElement involveBuldingtype;

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
