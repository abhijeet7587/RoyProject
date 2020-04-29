package objectRepository;

public class registartionPage 
{

	public String ConsultingFirmXpath="//*[contains(text(),'Consulting Firm')]";
	public String SignUpXpath="//div[contains(text(),'Sign Up')]";
	//public String ConsltingFirmXpath="//span[@class='active']";
	public String FirstNameXpath="(//*[@placeholder='First Name'])";
	public String LastNameXpath="(//*[@placeholder='Last Name'])";
	public String EmailIDXpath="//*[@id=\"mat-input-2\"]";
	public String PasswordXpath="//input[@id='mat-input-3']";
	public String PhoneXpath="//input[@id='mat-input-4']";
	public String TermConnditionCheckBoxXpath="//div[@class='mat-checkbox-inner-container']";
	public String AcceptBoxXpath="//mat-checkbox[@id='mat-checkbox-2']//div[@class='mat-checkbox-inner-container']";
	public String DoneBtnXpath="//button[contains(text(),'Done')]";
	public String NextBtnXpath="//div[@class='mat-tab-body-content ng-trigger ng-trigger-translateTab']//div//div[3]//button[1]";
	public String OTPFieldXpath="//input[@id='partitioned']";
	public String SubmitBtnXpath="//button[@class='btn btn-border']";
}
