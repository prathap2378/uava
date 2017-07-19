package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RtqFormUi {
	
	@FindBy(linkText="RTQ")
	private WebElement newform;
	
	@FindBy(linkText="RTQ")
	private WebElement rtqLink;
	
	@FindBy(linkText="Project")
	private WebElement projectLink;

	public WebElement getNewform() {
		return newform;
	}
	@FindBy(linkText="Small Works")
	private WebElement smallWorks;
	
	public WebElement getSmallWorks() {
		return smallWorks;
	}
	@FindBy(xpath="//select[@id='st_smallWorkType']")
	private WebElement smallWorksType;

	public WebElement getSmallWorksType() {
		return smallWorksType;
	}

	@FindBy(id="st_ProjectName")
	private WebElement ProjectName;
	
	@FindBy(id="st_Customer")
	private WebElement CustomerName;
	
	@FindBy(id="st_Consultant")
	private WebElement ConsultantName;
	
	@FindBy(id="st_ProjectAddress")
    private WebElement ProjectAddres;
	
	@FindBy(id="float_EstimatedSize")
	private WebElement EstimatedSize;
	
	@FindBy(id="in_EstimatedPoints")
	private WebElement Points;
	
	@FindBy(id="st_ProductSpecified")
	private WebElement ProductSpecifieddd;
	
	@FindBy(id="st_TypeofBuilding")
	private WebElement TypeofBuildingdd;
	
	@FindBy(id="st_EndUserIndustrySector")
	private WebElement EndUserIndustrySectordd;
	
	@FindBy(id="st_TypeofProject")
	private WebElement TypeofProjectdd;
	 
	@FindBy(id="st_EnquiryFormat")
    private WebElement EnquiryFormatdd;
	
	@FindBy(id="st_DocumentationReceived")
	private WebElement DocumentationReceiveddd;
	
	@FindBy(id="st_GANamed")
	private WebElement GANameddd;
	@FindBy(xpath="//select[@id='st_Location']")
	private WebElement Locationdd;
	
	@FindBy(xpath="//input[@id='st_location']")
	private WebElement locationUkas;
	
	@FindBy(id="st_PreviousExperienceAtSite")
	private WebElement PreviousExperienceAtSitedd;
	
	@FindBy(id="st_TermsConditionsAdvised")
	private WebElement TermsConditionsAdviseddd;
	
	@FindBy(id="st_PCG")
	private WebElement PCGdd;
	
	@FindBy(xpath="//label[@id='SRTQ']")
	private WebElement saved_RTQ_Link;
	
	public WebElement getSaved_RTQ_Link() {
		return saved_RTQ_Link;
	}
	
	@FindBy(id="st_PerformanceBond")
	private WebElement PerformanceBond;
	
	@FindBy(id="st_enquiryOpenToAll")
	private WebElement isenqueryopentoall;
	
	@FindBy(xpath="//div[@id='rtqForm-dropzone']")
	private WebElement uploaddocument;
	
	@FindBy(id="st_Comments")
	private WebElement Comments;
	
	@FindBy(id="save")
	private WebElement save;
	
	@FindBy(id="reset")
	private WebElement Reset;
	
	@FindBy(id="btnsubmit")
	private WebElement Submit;
	
	@FindBy(id="cancel")
	private WebElement cancel;
	
	@FindBy(xpath="//select[@id='st_damagesAdviced']")
	private WebElement damages_Advised;
	
	public WebElement getDamages_Advised() {
		return damages_Advised;
	}

	public WebElement getRetention_Advised() {
		return retention_Advised;
	}

	@FindBy(xpath="//select[@id='st_retentionAdvised']")
	private WebElement retention_Advised;
	
	//ukas rtq fields
		@FindBy(xpath="//select[@id='st_productType']")
		private WebElement product_Type;

		@FindBy(xpath="//select[@id='st_projectCategory']")
		private WebElement ctegory_of_Project;
		
		@FindBy(xpath="//select[@id='st_typeOfBuilding']")
		private WebElement type_Of_Building;
		
		@FindBy(xpath="//select[@id='st_hasQuoteSubmitted']")
		private WebElement has_Quote_Submitted;
		
		@FindBy(xpath="//select[@id='st_contractValueType']")
		private WebElement contract_Value_Type;
		
		public WebElement getProduct_Type() {
			return product_Type;
		}

		public WebElement getCtegory_of_Project() {
			return ctegory_of_Project;
		}

		public WebElement getType_Of_Building() {
			return type_Of_Building;
		}

		public WebElement getHas_Quote_Submitted() {
			return has_Quote_Submitted;
		}

		public WebElement getContract_Value_Type() {
			return contract_Value_Type;
		}
		
	public WebElement getRtqLink() {
		return rtqLink;
	}

	public WebElement getProjectLink() {
		return projectLink;
	}

	public WebElement getProjectName() {
		return ProjectName;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getConsultantName() {
		return ConsultantName;
	}

	public WebElement getProjectAddres() {
		return ProjectAddres;
	}

	public WebElement getEstimatedSize() {
		return EstimatedSize;
	}

	public WebElement getPoints() {
		return Points;
	}

	public WebElement getProductSpecifieddd() {
		return ProductSpecifieddd;
	}

	public WebElement getTypeofBuildingdd() {
		return TypeofBuildingdd;
	}

	public WebElement getEndUserIndustrySectordd() {
		return EndUserIndustrySectordd;
	}

	public WebElement getTypeofProjectdd() {
		return TypeofProjectdd;
	}

	public WebElement getEnquiryFormatdd() {
		return EnquiryFormatdd;
	}

	public WebElement getDocumentationReceiveddd() {
		return DocumentationReceiveddd;
	}

	public WebElement getGANameddd() {
		return GANameddd;
	}

	public WebElement getLocationdd() {
		return Locationdd;
	}
	
	public WebElement getLocationUkas() {
		return locationUkas;
	}
	
	public WebElement getPreviousExperienceAtSitedd() {
		return PreviousExperienceAtSitedd;
	}

	public WebElement getTermsConditionsAdviseddd() {
		return TermsConditionsAdviseddd;
	}

	public WebElement getPCGdd() {
		return PCGdd;
	}

	public WebElement getPerformanceBond() {
		return PerformanceBond;
	}

	public WebElement getIsenqueryopentoall() {
		return isenqueryopentoall;
	}

	public WebElement getUploaddocument() {
		return uploaddocument;
	}

	public WebElement getComments() {
		return Comments;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getReset() {
		return Reset;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getCancel() {
		return cancel;
	}

	}
