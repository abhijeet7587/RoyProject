package objectRepository;

public class LoginRegistrationPage 
{
	public String SignatoryFirmXpath="//input[@placeholder='Name of authorised signatory for the firm']";
	public String FirmNameXpath="//input[@placeholder='Firm Name']";
	public String RoleXpath="//*[@id=\"container-3\"]/content/gbc-consultant-firm-registration/div/mat-card/mat-card-content/form/div/mat-form-field[3]/div/div[1]/div[3]";
	public String RoleCEOXpath="//span[@class='mat-option-text']";
	public String RoleCEO1Xpath="(//span[contains(text(),'ceo')])[2]";
	public String WebsiteXpath="//input[@placeholder='Website']";
	public String LinkdinXpath="//input[@placeholder='LinkedIn']";
	public String NOEXpath="//*[@id=\"container-3\"]/content/gbc-consultant-firm-registration/div/mat-card/mat-card-content/form/div/mat-form-field[6]/div/div[1]/div[3]";
	public String NOE2150Xpath="//span[contains(text(),'21 - 50')]";
	public String Method2RegisterXpath="//li[contains(text(),'scrum certified')]";
	public String NOYXpath="//mat-select[@placeholder='Number of years since incorporation']";
	public String NOY3Xpath="//*[@id=\"mat-option-14\"]/span[contains(text(),'3')]";
	public String RepresentativeSectorXpath="//li[contains(text(),' it consulting')]";
	public String CityXpath="//li[contains(text(),'bengaluru, ka, in')]";
	public String ConsultingFirmXpath="//*[@id=\"mat-radio-3\"]/label";
	
	public String SubmitBtnXpath="//button[@class='btn-submit']";
	public String ContinueBtnXpath="//*[@id=\"mat-dialog-0\"]/gbc-cf-success-dialog/div/div[2]/button";
	
}
