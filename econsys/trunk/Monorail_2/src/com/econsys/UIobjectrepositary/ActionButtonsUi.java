package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionButtonsUi {
	
	@FindBy(xpath="//input[@id='save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//input[@id='authorise']")
	private WebElement boardapprovebutton;
	
	@FindBy(xpath="//input[@id='reject']")
	private WebElement rejectbutton;
	
	@FindBy(xpath="//input[@id='dontProceed']")
	private WebElement donotproccedbutton;
	
	@FindBy(xpath="//input[@class='list_item_link_docs_multiple']")
	private WebElement linkFileCheckbox;
	public WebElement getLinkFileCheckbox() {
		return linkFileCheckbox;
	}
	@FindBy(linkText="Project Archive")
	private WebElement project_Archive;
	@FindBy(linkText="All Projects")
	private WebElement all_Projects;
	@FindBy(linkText="Quote Submit Status")
	private WebElement quote_Submit_Status;
	@FindBy(linkText="Executive Dash Board")
	private WebElement executive_Dash_Board;
	@FindBy(linkText="Review")
	private WebElement review;
	@FindBy(linkText="My Opportunities")
	private WebElement my_Opportunities;
	@FindBy(linkText="Home")
	private WebElement home;
	@FindBy(linkText="New RTQ")
	private WebElement RTQTab;
	@FindBy(linkText="Small Works")
	private WebElement smallWorks;
	@FindBy(linkText="RTQ")
	private WebElement newform;
	
	
	@FindBy(xpath="//td[@id='search_info1']/div")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getFind() {
		return find;
	}
	@FindBy(xpath="//a[@id='fbox_info1_search']")
	private WebElement find;
	
	@FindBy(xpath="//input[@id='jqg1']")
	private WebElement searchProjectname;
	
	public WebElement getSearchProjectname() {
		return searchProjectname;
	}

	public WebElement getRTQTab() {
		return RTQTab;
	}
	
	public WebElement getSmallWorks() {
		return smallWorks;
	}

	public WebElement getNewform() {
		return newform;
	}
	
	public WebElement getProject_Archive() {
		return project_Archive;
	}

	public WebElement getAll_Projects() {
		return all_Projects;
	}

	public WebElement getQuote_Submit_Status() {
		return quote_Submit_Status;
	}

	public WebElement getExecutive_Dash_Board() {
		return executive_Dash_Board;
	}

	public WebElement getReview() {
		return review;
	}

	public WebElement getMy_Opportunities() {
		return my_Opportunities;
	}

	public WebElement getHome() {
		return home;
	}
	@FindBy(xpath="//a[@class='addlink']")
	private WebElement add_LinkfilePopup;

	public WebElement getAdd_LinkfilePopup() {
		return add_LinkfilePopup;
	}	
	
	@FindBy(xpath="//a[@class='closelink']")
	private WebElement close_LinkfilePopup;
	
	public WebElement getClose_LinkfilePopup() {
		return close_LinkfilePopup;
	}
	
	@FindBy(xpath="//input[@id='cancel']")
	private WebElement cancelbutton;
	
	@FindBy(xpath="//textarea[@id='st_Comments']")
	private WebElement comments;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@value='To Monthly Review']")
	private WebElement mrbutton;

	@FindBy(xpath="//input[@value='Project Completed']")
	private WebElement projectCompletedbutton;
	
	@FindBy(xpath="//input[@value='Approve']")
	private WebElement reviewInvolveapprovebutton;
	
	
	@FindBy(xpath="//div[@id='gate2']/div/ul/li[1]/a")
	private WebElement reviewinvolvetasks;
	
	public WebElement getReviewinvolvetasks() {
		return reviewinvolvetasks;
	}
	@FindBy(xpath="//label[@id='myApprovals']")
	private WebElement bymeapprovals;
	
	@FindBy(xpath="//label[@id='groupApprovals']")
	private WebElement groupapprovals;
	
	@FindBy(xpath="//div[@id='gate1']/div/ul/li[1]/a")
	private WebElement viewalltasks;
	
	@FindBy(id="SRTQ")
	private WebElement savedRTQ;
	
	@FindBy(xpath="//input[@id='reset']")
	private WebElement resetButton;

	public WebElement getResetButton() {
		return resetButton;
	}

	public WebElement getSavedRTQ() {
		return savedRTQ;
	}
	
	@FindBy(linkText="Edit")
	private WebElement editLink;
	
	@FindBy(xpath="//div[5]/div[2]/a[2]")
	private WebElement donotproceed_allret_Ok;
    @FindBy(xpath="//div[5]/div[2]/a[1]")
    private WebElement donotproceed_allret_Cancel;
    
	public WebElement getDonotproceed_allret_Ok() {
		return donotproceed_allret_Ok;
	}

	public WebElement getDonotproceed_allret_Cancel() {
		return donotproceed_allret_Cancel;
	}
	
	

	public WebElement getEditLink() {
		return editLink;
	}

	public WebElement getBymeapprovals() {
		return bymeapprovals;
	}
	@FindBy(linkText="Delete")
	private WebElement deleteLink;

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public WebElement getGroupapprovals() {
		return groupapprovals;
	}

	public WebElement getViewalltasks() {
		return viewalltasks;
	}

	
	public WebElement getBoardapprovebutton() {
		return boardapprovebutton;
	}

	

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getRejectbutton() {
	return rejectbutton;
	}

	public WebElement getDonotproccedbutton() {
		return donotproccedbutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getMrbutton() {
		return mrbutton;
	}

	public WebElement getProjectCompletedbutton() {
		return projectCompletedbutton;
	}
	public WebElement getReviewInvolveapprovebutton() {
		return reviewInvolveapprovebutton;
	}

	
}
