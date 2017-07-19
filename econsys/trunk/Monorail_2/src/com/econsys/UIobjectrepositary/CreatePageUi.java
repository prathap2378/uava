package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePageUi {
	@FindBy(xpath="//span[contains(text(),'View Pages')]")
	private WebElement Viewpagestab;
	
	@FindBy(xpath="//span[contains(text(),'Add Page')]")
	private WebElement Addpage;
	
	@FindBy(xpath="//span[contains(text(),'Export')]")
	private WebElement Export;
	
	@FindBy(xpath="//span[contains(text(),'Import')]")
	private WebElement Import;
	
	//*****Add Page popup*****//
	@FindBy(xpath="//input[@id='_156_addLayoutName']")
	private WebElement PagenameEnter;
	
	public WebElement getPagenameEnter() {
		return PagenameEnter;
	}

	@FindBy(xpath="//input[@id='_156_addLayoutlayoutTemplateId1']")
	private WebElement Singlecolumnradio;
	
	@FindBy(xpath="//button[@id='addLayoutSubmit']")
	private WebElement addpagebutton;
	
	@FindBy(xpath="//button[@id='_156_cancelAddOperation']")
	private WebElement cancelbutton;
	
	//*****Add Page action*****//
	@FindBy(xpath="//a[@id='_156_lookAndFeelLink']")
	private WebElement lookandfeel;
	
	@FindBy(xpath="//button[@id='yui_patched_v3_11_0_1_1436792940592_5898']")
	private WebElement savebutton;
	
	@FindBy(css="input[value='monorail_pink_WAR_monorail_pinktheme']")
	private WebElement Pinkhemeradio;//css for pinktheme
	
	//css for blue theme
	@FindBy(css="input[value='monorail_blue_WAR_monorail_bluetheme']")
	private WebElement Bluetheme;
	
	//public pages
	@FindBy(xpath="//a[@id='undefined'][contains(text(),'Public Pages')]")
	private WebElement Publicpages;
	
	@FindBy(xpath="//span[contains(text(),'Permissions')]")
	private WebElement Permissions;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	private WebElement Deletepage;
	
	@FindBy(xpath="//span[contains(text(),'Add Child Page')]")
	private WebElement Addchildpage;
	
	
	//Select org for adding pages from list down arrow
	@FindBy(xpath="//i[@id='yui_patched_v3_11_0_1_1436795721759_5764']")
	private WebElement selectORGdownarrow;
	
	//guest view check box
	@FindBy(css="input[id='guest_ACTION_VIEW'][name='_86_2164_ACTION_VIEW']")
	private WebElement Guestviewcheckbox;
	
	//Monorail admin view checkbox
	@FindBy(xpath="//input[@id='monorail-admin_ACTION_VIEW']")
	private WebElement Monorailadminviewcheckbox;
	
	//organization director view checkbox
	@FindBy(xpath="//input[@id='organisation-director_ACTION_VIEW']")
	private WebElement Orgdirectorviewcheckbox;
	
	//power user view checkbox
	@FindBy(xpath="//input[@id='power-user_ACTION_VIEW']")
	private WebElement powerusercheckbox;
	
	//site member view checkbox
	@FindBy(xpath="//input[@id='site-member_ACTION_VIEW']")
	private WebElement Sitememberviewcheckbox;
	
	//Save button in permission page
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement Savebuttonpermissionspage;
	
	//Users and Org tab
	@FindBy(xpath="//span[contains(text(),'Users and Organizations')]")
	private WebElement UsrsandOrgstab;
	
	//Roles tab
	@FindBy(xpath="//span[contains(text(),'Roles')]")
	private WebElement Rolesection;
	
	@FindBy(xpath="//span[contains(text(),'Server Administration')]")
	private WebElement serveradministration;
	
	@FindBy(linkText="Add")
	private WebElement Addorgbutton;
	
	@FindBy(xpath="//ul[@class='dropdown-menu ']//span[contains(text(),'User')]")
	private WebElement user;
	
	public WebElement getPinkhemeradio() {
		return Pinkhemeradio;
	}

	public WebElement getUser() {
		return user;
	}

	@FindBy(xpath="//span[contains(text(),' Regular Organization ')]")
	private WebElement Regularorg;
	
	@FindBy(xpath="//input[@id='_125_name']")
	private WebElement Orgname;
	
	//Save button in org creation pagr
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveOrgpage;
	
	@FindBy(xpath="//input[@id='_125_siteCheckbox']")
	private WebElement CreateSitecheckBox;
	
	@FindBy(xpath="//span[contains(text(),'All Organizations')]")
	private WebElement Allorgs;
	
	@FindBy(xpath="//span[contains(text(),'All Users')]")
	private WebElement Allusers;
	
	//Search field
	@FindBy(xpath="//input[@id='toggle_id_users_admin_user_searchkeywords']")
	private WebElement Searchinputfield;
	
	//Search button
	@FindBy(xpath="//button[contains(text(),'Search')]")
	private WebElement Searchbutton;

	@FindBy(xpath="//input[ @type='checkbox']")
	private WebElement Checkbox;
	
	//Update association button
	@FindBy(xpath="//button[contains(text(),'Update Associations')]")
	private WebElement Updateassociationbutton;
	
	//Assigen User
	@FindBy(xpath="//span[contains(text(),'Assign Users')]")
	private WebElement Assigenuserlink;
	
	//Browse button orgpage
	@FindBy(xpath="//span[contains(text(),'Browse')]")
	private WebElement BrowsebuttonORGpage;
	
	@FindBy(xpath="//select[@id='_125_publicLayoutSetPrototypeId']")
	private WebElement publicpagesthemeselectatcreatesite;
	
	@FindBy(xpath="//a[@id='_125_organizationSiteLink']")
	private WebElement orgsitelikeorgcreationpage;
	
	@FindBy(xpath="//a[contains(text(),'Available')]")
	private WebElement Avilableuserbutton;
	
	@FindBy(xpath="//a[contains(text(),'Current')]")
	private WebElement currentusersbutton;
	
	public WebElement getAvilableuserbutton() {
		return Avilableuserbutton;
	}

	public WebElement getCurrentusersbutton() {
		return currentusersbutton;
	}

	
	
	public WebElement getOrgsitelikeorgcreationpage() {
		return orgsitelikeorgcreationpage;
	}

	public WebElement getPublicpagesthemeselectatcreatesite() {
		return publicpagesthemeselectatcreatesite;
	}

	public WebElement getViewpagestab() {
		return Viewpagestab;
	}

	public WebElement getAddpage() {
		return Addpage;
	}

	public WebElement getExport() {
		return Export;
	}

	public WebElement getImport() {
		return Import;
	}

	

	public WebElement getSinglecolumnradio() {
		return Singlecolumnradio;
	}

	public WebElement getAddpagebutton() {
		return addpagebutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getLookandfeel() {
		return lookandfeel;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getPinthemeradio() {
		return Pinkhemeradio;
	}

	public WebElement getBluetheme() {
		return Bluetheme;
	}

	public WebElement getPublicpages() {
		return Publicpages;
	}

	public WebElement getPermissions() {
		return Permissions;
	}

	public WebElement getDeletepage() {
		return Deletepage;
	}

	public WebElement getAddchildpage() {
		return Addchildpage;
	}

	public WebElement getSelectORGdownarrow() {
		return selectORGdownarrow;
	}

	public WebElement getGuestviewcheckbox() {
		return Guestviewcheckbox;
	}

	public WebElement getMonorailadminviewcheckbox() {
		return Monorailadminviewcheckbox;
	}

	public WebElement getOrgdirectorviewcheckbox() {
		return Orgdirectorviewcheckbox;
	}

	public WebElement getPowerusercheckbox() {
		return powerusercheckbox;
	}

	public WebElement getSitememberviewcheckbox() {
		return Sitememberviewcheckbox;
	}

	public WebElement getSavebuttonpermissionspage() {
		return Savebuttonpermissionspage;
	}

	public WebElement getUsrsandOrgstab() {
		return UsrsandOrgstab;
	}

	public WebElement getRolesection() {
		return Rolesection;
	}

	public WebElement getServeradministration() {
		return serveradministration;
	}

	public WebElement getAddorgbutton() {
		return Addorgbutton;
	}

	public WebElement getRegularorg() {
		return Regularorg;
	}

	public WebElement getOrgname() {
		return Orgname;
	}

	public WebElement getSaveOrgpage() {
		return SaveOrgpage;
	}

	public WebElement getCreateSitecheckBox() {
		return CreateSitecheckBox;
	}

	public WebElement getAllorgs() {
		return Allorgs;
	}

	public WebElement getAllusers() {
		return Allusers;
	}

	public WebElement getSearchinputfield() {
		return Searchinputfield;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getUpdateassociationbutton() {
		return Updateassociationbutton;
	}

	public WebElement getAssigenuserlink() {
		return Assigenuserlink;
	}

	public WebElement getBrowsebuttonORGpage() {
		return BrowsebuttonORGpage;
	}
}
