package addpropertyDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import addpropertyAnnotation.addpropertyannotation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class addpropertydefination {
	WebDriver driver = addpropertyannotation .driver;
	@Given("admin is on Real Estate website")
	public void admin_is_on_Real_Estate_website() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
			
		
		System.out.println("You are on real estate website");
		}
		catch(Exception e)
		{
			System.out.println("Not able to get title of Real Estate website "+e);
		}
	    
	}
	@And("admin clicks on login")
	public void admin_clicks_on_login() {
		try
		{
	    driver.findElement(By.xpath("//*[@class='sign-in']")).click();
	    
		}
		catch(Exception e)
		{
			System.out.println("Admin is unable to login icon" +e);
		}
		}
	

	@When("admin enters username {string} and password {string}")
	public void admin_enters_username_and_password(String username, String password) {
		try {
		driver.findElement(By.name("log")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		}
		catch (Exception e)
		{
			System.out.println("Not able to enter credentials"+e);
		}
	    
	}

	@Then("clicks on Sign in button")
	public void clicks_on_Sign_in_button() {
		try {
		driver.findElement(By.name("login")).click();
		}
		catch (Exception e)
		{
			System.out.println("Not able to login"+e);
		}
	    
	}

	@Then("admin navigates to dashboard")
	public void admin_navigates_to_dashboard() {
		try {
			boolean b = driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
			Thread.sleep(2000);
			System.out.println("Admin is on dashboard page: "+b);
		
		}
		catch (Exception e)
		{
			System.out.println("Not able to navigate"+e);
			
		}
		
	    
	}
	
	
	@Then("admin hovers on Properties then clciks on Add New field")
	public void admin_hovers_on_Properties_then_clciks_on_Add_New_field() {
		try {
			 
					Actions actions = new Actions(driver);
					actions.moveToElement(driver.findElement(By.xpath("//*[text()='Properties']"))).build().perform();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[@href='post-new.php?post_type=property']")).click();
		}
		catch (Exception e){
			System.out.println("Not able to navigate to properties hence can't click on add new" +e);
			Assert.fail();
		}
	    
	}
	


	@And("admin is on add new page")
	public void admin_is_on_add_new_page() {
		try 
		{
			boolean check = driver.findElement(By.xpath("//*[@id='wpbody-content']/div[3]/h1")).isDisplayed();
	
		System.out.println("Admin is on add new page " +check);
		}
		catch (Exception e)
		{
			System.out.println("Admin is not on Add new Page! "+e);
		}
	    
	}

	@Then("clicks on enter title here {string}")
	public void clicks_on_enter_title_here(String title) {
		try {
			WebElement obj = driver.findElement(By.name("post_title"));
					obj.sendKeys(title);
					Thread.sleep(3000);
					System.out.println("Neral launch Mumbai" +title);
					obj.sendKeys(Keys.ENTER);
					//obj.click();
			}
	    catch (Exception e)
		{
	    	System.out.println("no tiltle"+e);}
		//Assert.fail();
		}

    @Then("url is generated")
	public void url_is_generated() {
    	try {
    		boolean check1 = driver.findElement(By.xpath("//strong[normalize-space()='Permalink:']")).isDisplayed();
    		
		System.out.println("Done "+check1);
    	}
    	catch(Exception e)
    	{
    		System.out.println("URL is not present! "+e);
    	}
		
	}
   /* @Then("admin clicks on Publish button")
	public void admin_clicks_on_Publish_button() {
	    try {
	    	//System.out.println(driver.findElement(By.xpath("//*[@id='submitdiv']/button")));
	    	if(driver.findElement(By.xpath("//*[@id='submitdiv']/button")).getAttribute("aria-expanded")=="false")
	    		driver.findElement(By.xpath("//*[@id='submitdiv']/button")).click();	
	    	driver.findElement(By.xpath("//input[@id='publish']")).click();
	    }
	    catch (Exception e)
	    {
    	System.out.println("Not able to click on publish button"+e);
	    }
    }*/
    
   @Then("admin clicks on Visual button")
    public void admin_clicks_on_Visual_button() {
	   try 
	   {
       driver.findElement(By.cssSelector("#content-tmce")).click();
    }
	   catch (Exception e)
	   {
		   System.out.println("Admin is not able to clcik on Visual! "+e);
	   }
	   }
   
	
	@And("admin clicks on add media button")
	public void admin_clicks_on_add_media_button() {
	try {
	    driver.findElement(By.xpath("//button[@id='insert-media-button']")).click();
	    }
	    catch (Exception e)
	    {
	    System.out.println("Admin unable to clcik on add media button"+e);
	    }
	}

	@Then("Media pop up gets display")
	public void media_pop_up_gets_display() {
		try {

	    driver.findElement(By.xpath("//*[@id='__wp-uploader-id-0']/div[2]/h1")).isDisplayed();
		}
		catch (Exception e)
		{
			System.out.println("No any media popup"+e);
		}
	}
	
	@And("admin clicks on upload files")
	public void admin_clicks_on_upload_files() {
		try {
			
	    driver.findElement(By.xpath("//*[text()='Upload Files']")).click();
		}
		catch (Exception e)
		{
			System.out.println("Admin is not able to click on upload button");
			
		}
	}

	@Then("admin click on media library")
	public void admin_click_on_media_library() {
		try
		{
			driver.findElement(By.xpath("//*[text()='Media Library']")).click();
		}
		catch (Exception e)
		{
			System.out.println("Not able to click on media library"+e);
		}
	    
	}

	@Then("admin selects all media items drop down menu")
	public void admin_selects_all_media_items_drop_down_menu() {
		try 
		{
			Select mediaitem = new Select(driver.findElement(By.xpath("//select[@id='media-attachment-filters']")));
			mediaitem.selectByVisibleText("Images");
			
		}
		catch (Exception e)
		{
			System.out.println("Not able to select"+e);
		}
	    
	}

	

	@Then("selects required date")
	public void selects_required_date() throws InterruptedException{
		try {
		Select date1 = new Select(driver.findElement(By.xpath("//select[@id='media-attachment-date-filters']")));
		Thread.sleep(3000);
		date1.selectByVisibleText("All dates");
		Thread.sleep(3000);
		System.out.println("Admin can select the date,yes!");
		}
		catch (Exception e)
		{
			System.out.println("Oops Not able to select date"+e);
		
		}
	    
	}
		@Then("admin clicks on close button")
		public void admin_clicks_on_close_button() {
			try {
				driver.findElement(By.xpath("//button[@class='media-modal-close']")).click();
				Thread.sleep(3000);
		    
		}
			catch (Exception e)
			{
				System.out.println("Admin is not able to click on close icon "+e);
				
			}
			
	   
	}
		

		/*@And("admin verifies image")
		public void admin_verifies_image() {
			driver.findElement(By.xpath("//ul[@id='__attachments-view-345']//li[@aria-label='Image1']//div[@class='thumbnail']")).click();
		}
		@Then("image is dispayed")
		public void image_is_dispayed() {
			System.out.println("Image is displayed on screen");
		    
		    
		}
		
		@Then("click on Insert post")
		public void click_on_Insert_post() {
			try {
				driver.findElement(By.xpath("//button[contains(text(),'Insert into post')]")).click();
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println("Admin not able to insert image"+e);
			}
			
		}
		
		@Then("image is displayed on given box")
		public void image_is_displayed_on_given_box() {
		    try {
		    	driver.findElement(By.xpath("//iframe[@id='content_ifr']")).isDisplayed();
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Image is not displayed on screen"+e);
		    }
		}
		
		
		}*/

	    
		
		// floorplans
		
		@When("admin clicks on floorplans")
		public void admin_clicks_on_floorplans() {
			try {
				if(driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[22]/button[1]/span[2]")).getAttribute("aria-expanded")=="false")
					driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[22]/button[1]/span[2]")).click();
				
				driver.findElement(By.xpath("//*[@id='_floorplans_metabox']/h2")).click();
				Thread.sleep(5000);
				
				System.out.println("Floorplans is clickable ");
				
			}
			catch (Exception e)
			{
				System.out.println("Can't click on floorplans" +e);
				Assert.fail();
			}
		    
		}

		@Then("Floorplans field is visible")
		public void floorplans_field_is_visible() throws InterruptedException {
			System.out.println("it's visible");
			Thread.sleep(2000);
		    
		}
		
		@Then("admin enters {string}, {string}, {string}")
		public void admin_enters(String title, String area, String description) {
			
			try
			{
				System.out.println(driver.findElement(By.xpath("//*[@id='_floorplans_0_floorplan_title']")));
				driver.findElement(By.cssSelector("#_floorplans_0_floorplan_title")).sendKeys(title);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#_floorplans_0_floorplan_area")).sendKeys(area);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#_floorplans_0_floorplan_desc")).sendKeys(description);
				Thread.sleep(2000);
				
			}
			catch ( Exception e)
			{
				System.out.println("Cannot enter floorplan details"+e);
				
			}
		    
		}
		
		
		
		@Then("admin clicks on add another editor")
		public void admin_clicks_on_add_another_editor() {
			try {
				//if(driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[22]/button[1]/span[2]")).getAttribute("aria-expanded")=="false")
					//driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[22]/button[1]/span[2]")).click();
				
				
				driver.findElement(By.xpath("//button[contains(text(),'Add another Editor')]")).click();
				Thread.sleep(2000);
				
			}
			catch (Exception e)
			{
				System.out.println("Admin can't click on add another editor" +e);
			}
		    
		}

		@Then("enters {string}, {string}, {string}")
		public void enters(String title1, String area1, String description1) {
			
			try
			{
				driver.findElement(By.xpath("//input[@id='_floorplans_1_floorplan_title']")).sendKeys(title1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='_floorplans_1_floorplan_area']")).sendKeys(area1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@id='_floorplans_1_floorplan_desc']")).sendKeys(description1);
				Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				System.out.println("Can not enter your req. details" +e);
			}
		    
		}

		/*@Then("admin clicks on add another editor option")
		public void admin_clicks_on_add_another_editor_option() {
		    try
		    {
		    	driver.findElement(By.xpath("//button[contains(text(),'Add another Editor')]")).click();
		    	Thread.sleep(2000);
		    	System.out.println("added editor");
		    	
		    }
		    catch (Exception e)
		    {
		    	System.out.println("cant clcik "+e);
		    	Assert.fail();
		    }
		}*/

		@Then("removes that added editor")
		public void removes_that_added_editor() throws InterruptedException {
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[22]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/button[1]")).click();
			Thread.sleep(2000);
		    System.out.println("Removed editor");
		}
		
		
		@When("admin selects dropdown menu")
		public void admin_selects_dropdown_menu() throws InterruptedException {
			try {
			Select author = new Select(driver.findElement(By.xpath("//select[@id='post_author_override']")));
			Thread.sleep(5000);
			author.selectByVisibleText("Indira Shivanna (PreethiKS)");
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("Admin is unable to select Author");
			}
		    
		}

		@Then("admin selects  author name")
		public void admin_selects_author_name() {
			System.out.println("Author is Indira Shivanna (PreethiKS)");
		    
		}
		
		@When("admin selects checkbox of discussion")
		public void admin_selects_checkbox_of_discusiion() {
			
			try {
				//if(driver.findElement(By.xpath("//input[@id='comment_status']")).getAttribute("checked")== null) // if Checked 
					//Thread.sleep(5000);
					//driver.findElement(By.xpath("//input[@id='comment_status']")).click();
				//driver.findElement(By.xpath("//input[@id='comment_status']")).isSelected();
				WebElement option1 = driver.findElement(By.xpath("//input[@id='comment_status']"));
				option1.click();
				if(option1.isSelected())
					{System.out.println("Check box is selected");
					}
					
				else
				{
					System.out.println("checkbox is off");
				}
				option1.click();  // it selects checkbox
				
				Thread.sleep(5000);
				System.out.println("its checked now");
				
			}
			catch (Exception e)
			{
				System.out.println("Not able to select "+e);
			}
		    
		}
		
		
		@When("admin clicks on Screen Options")
		public void admin_clicks_on_Screen_Options() {
			try
			{
				if(driver.findElement(By.xpath("//button[@id='show-settings-link']")).getAttribute("aria-expanded")=="false")
		    		driver.findElement(By.xpath("//button[@id='show-settings-link']")).click();
				driver.findElement(By.id("show-settings-link")).click();
				Thread.sleep(9000);
				
				//driver.findElement(By.xpath("//button[@id='show-settings-link']")).click();
			}
			catch(Exception e)
			{
				System.out.println("Not able to click on Screen Options");
				Assert.fail();
			}
				
			
		    
		}

		@Then("admin should see all screen options")
		public void admin_should_see_all_screen_options() {
			try {
				boolean box = driver.findElement(By.xpath("//legend[text()='Boxes']")).isDisplayed();
				System.out.println("Admin can see boxes option " +box);
				boolean layout = driver.findElement(By.xpath("//legend[text()='Layout']")).isDisplayed();
				System.out.println("Admin can see layout option " +layout);
				boolean additional = driver.findElement(By.xpath("//legend[text()='Additional settings']")).isDisplayed();
				System.out.println("Admin can see additional settings " +additional);
			}
			catch(Exception e)
			{
				System.out.println("Can't see Screen Options"+e);
				
			}
		    
		}

		@And("admin should uncheck the already checked boxes")
		public void admin_should_uncheck_the_already_checked_boxes() {
			try {
				
				driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[1]/label[2]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[1]/label[17]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//label[@for='acf-group_5a8d73cab63e0-hide']")).click();
				Thread.sleep(2000);
				
			}
				catch (Exception e)
				{
					System.out.println("Yes it workded , Regions are invisible now" +e);
					Assert.fail();
				}
		    
		}
		
		@Then("admin clicks on first radio button")
		public void admin_clicks_on_first_radio_button() {
			try 
			{
				driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[2]/label[1]/input")).click();
				Thread.sleep(3000);
				System.out.println("Admin can click on 1 column option");
			
				/*String str = driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[2]/label[1]/input")).getAttribute("checked");
				if (str.equalsIgnoreCase("true"))
				{
				    System.out.println("Radio button is selected");
				}
				else
				{
					driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[2]/label[1]/input")).click();
				}*/
				
				}
			catch (Exception e)
			{
				System.out.println("Not able to select radio button"+e);
				Assert.fail();
			}
		    
		}
		
		@Then("admin clicks on second radio button")
		public void admin_clicks_on_second_radio_button() {
			
			try 
			{
				if(driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[2]/label[2]")).getAttribute("checked")=="false")
driver.findElement(By.xpath("//*[@id='adv-settings']/fieldset[2]/label[2]")).click();
				System.out.println("Admin can click on 2 columns option");
				
				
				}
			catch (Exception e)
			{
				System.out.println("Not able to select radio button"+e);
				Assert.fail();
			}
		   
		}
		
		

		@Then("admin selects checkbox")
		public void admin_selects_checkbox() {
			try
			{
				driver.findElement(By.xpath("//legend[contains(text(),'Additional settings')]")).isDisplayed();
				WebElement check = driver.findElement(By.xpath("//*[@id='editor-expand-toggle']"));
		// Check if radio button is selected by default
		if (check.isSelected()) {
		        // Print message to console
			System.out.println("Check box of Screen Option is selected");
		} else {
			// Click the radio button
			check.click();
		}
			}
			catch (Exception e)
			{
				System.out.println("Checkbox is not clickable"+e);
			}
		    
		}
		
		@Then("Admin verifies changes are made or not")
		public void admin_verifies_changes_are_made_or_not() {
			try
			{
				boolean a = driver.findElement(By.xpath("//*[@id='regiondiv']/h2/span")).isDisplayed();
				System.out.println(a);
				
				boolean b = driver.findElement(By.xpath("//span[normalize-space()='Amenities']")).isDisplayed();
				System.out.println(b);
				
				boolean c = driver.findElement(By.xpath("//span[normalize-space()='Price Table']")).isDisplayed();
				System.out.println(c);
				
			}
			catch (Exception e)
			{
				System.out.println("Changes are not made yet! "+e);
			}
		    
		}
		
		
		
		@Given("admin is on Add New page")
		public void admin_is_on_Add_New_page() {
			try {
				boolean bl = driver.findElement(By.xpath("//h1[@class='wp-heading-inline']")).isDisplayed();
				
				
		    System.out.println("Admin is on Add New Page " +bl);
			}
			catch (Exception e)
			{
				System.out.println("Admin is not on Add New Page! "+e);
			}

		}

		@Given("admin enters title of property {string}")
		public void admin_enters_title_of_property(String title) {
			try {
				WebElement obj = driver.findElement(By.name("post_title"));
						obj.sendKeys(title);
						Thread.sleep(3000);
						System.out.println("Neral launch Mumbai :" +title);
						obj.sendKeys(Keys.ENTER);
						//obj.click();
				}
		    catch (Exception e)
			{
		    	System.out.println("no tiltle"+e);}
			//Assert.fail();
			}

		
		@Given("admin enters text in given field {string}")
		public void admin_enters_text_in_given_field(String text) {
		    try
		    {
		    	driver.findElement(By.xpath("//*[@id='content_ifr']")).sendKeys(text);
		    	Thread.sleep(3000);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Admin is not able to enter text in Text-Box");
		    }
		}

		@Given("admin changed heading style")
		public void admin_changed_heading_style() {
			
			try {
				
				driver.findElement(By.xpath("//*[@id='mceu_0-open']/i")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@id='mceu_133-text']")).click();
				Thread.sleep(3000);
				
				}
				catch(Exception e)
				{
					System.out.println("Admin is unable to select heading");
				}
		    
		}

		@Given("admin aligns text at center")
		public void admin_aligns_text_at_center() {
		    try {
		    	driver.findElement(By.cssSelector("#mceu_7-button")).click();
		    	Thread.sleep(3000);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Not able to align"+e);
		    }
		}

		

		@Given("admin clicks on edit button of status option of Publish Field")
		public void admin_clicks_on_edit_button_of_status_option_of_Publish_Field() {
		    try {
		    	boolean edit1 = driver.findElement(By.xpath("//*[@id='submitdiv']/h2/span")).isDisplayed();
		    	System.out.println(" Publish Icon is visible " +edit1);
		    	driver.findElement(By.xpath("//a[@class='edit-post-status hide-if-no-js']//span[@aria-hidden='true'][normalize-space()='Edit']")).click();
		    	System.out.println("edit-draft selected");
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Not able to selct edit button of status "+e);
		    }
		}

		@Given("admin selects status as Draft from dropdown")
		public void admin_selects_status_as_Draft_from_dropdown() {
			try {
				
				WebElement ddown= driver.findElement(By.id("post_status"));
				
				Select select = new Select(ddown);
				select.selectByVisibleText("Draft");
				Thread.sleep(3000);
				System.out.println("draft selected");
				select.selectByValue("pending");
				System.out.println("pending is clicked");
				Thread.sleep(5000);
				
				//Select s1 = new Select(driver.findElement(By.xpath("//*[@id='post_status']/option[1]")));
				//Thread.sleep(3000);
				//s1.selectByVisibleText("Draft");
				//Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println("Admin is unable to select Draft");
					//Assert.fail();
				}
		}

		@Given("admin clicks on Ok button")
		public void admin_clicks_on_Ok_button() {
			
			try {
				driver.findElement(By.xpath("//a[@class='save-post-status hide-if-no-js button']")).click();
			}
			catch (Exception e)
			{
				System.out.println("Not able to Click on OK button"+e);
			}
		}
		

		@Given("admin clicks on edit of Visibility")
		public void admin_clicks_on_edit_of_Visibility() {
			
			try {
		    	boolean edit1 = driver.findElement(By.xpath("//*[@id='submitdiv']/h2/span")).isDisplayed();
		    	System.out.println(" Publish Icon is visible " +edit1);
		    	driver.findElement(By.xpath("//*[@id='visibility']/a/span[1]")).click();
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Not able to selct edit button of visibility "+e);
		    }
		}

		@Given("admin clicks on radio button of visibility option")
		public void admin_clicks_on_radio_button_of_visibility_option() {
		    try {
		    	WebElement radio1=driver.findElement(By.xpath("//input[@id='visibility-radio-password']"));
		    	WebElement radio2 = driver.findElement(By.xpath("//input[@id='visibility-radio-public']"));
		    	
		    	radio1.click();
		    	Thread.sleep(3000);
		    	System.out.println("Password protected Radio button is selected");
		    	
		    	radio2.click();
		    	Thread.sleep(3000);
		    	System.out.println("Public Radio Button is selected");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Canot select radio1 or radio2");
		    }
		    
		}

		@Given("admin clicks on ok")
		public void admin_clicks_on_ok() {
			try
			{
				driver.findElement(By.xpath("//*[@id='post-visibility-select']/p/a[1]")).click();
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println("Not able to Select visibility " +e);
			}
		    
		}

		@Then("admin clicks on publish button")
		public void admin_clicks_on_publish_button() {
			
			try {	
		    	driver.findElement(By.xpath("//input[@id='publish']")).click();
		    }
		    catch (Exception e)
		    {
	    	System.out.println("Not able to click on publish button"+e);
		    }
		}
		
		
		@Given("admin clicks on edit button of Publish option")
		public void admin_clicks_on_edit_button_of_Publish_option() {
			try
			{
				driver.findElement(By.xpath("//*[@id='misc-publishing-actions']/div[3]/a/span[1]")).click();
				Thread.sleep(3000);
				System.out.println("Admin can edit when to publish property");
			}
			catch (Exception e)
			{
				System.out.println("Admin can not click on edit-publish"+e);
				Assert.fail();
			}
		    
			
		}

		@Given("admin clicks on cancel button")
		public void admin_clicks_on_cancel_button() {
			try
			{
				driver.findElement(By.xpath("//*[@id='timestampdiv']/p/a[2]")).click();
				Thread.sleep(3000);
				System.out.println("Admin can click on camcel button now!");
			}
		    catch (Exception e)
			{
		    	System.out.println("Admin can't click on canel now"+e);
		    	Assert.fail();
			}
		}

		@Given("admin clicks on edit option agian of publish button")
		public void admin_clicks_on_edit_option_agian_of_publish_button() {
			try
			{
				driver.findElement(By.xpath("//*[@id='misc-publishing-actions']/div[3]/a/span[1]")).click();
				Thread.sleep(3000);
				System.out.println("Admin can edit when to publish property");
			}
			catch (Exception e)
			{
				System.out.println("Admin can not click on edit of publish option"+e);
				Assert.fail();
			}
		    
		}

		@Given("admin selects month from dropdown")
		public void admin_selects_month_from_dropdown() {
			try
			{
				WebElement ddown= driver.findElement(By.id("mm"));
				
				Select select = new Select(ddown);
				select.selectByValue("10");
				Thread.sleep(3000);
				System.out.println("dropdown is clicked");
				
			}
		    catch (Exception e)
			{
		    	System.out.println("Admin can't select dropdown of month"+e);
		    	Assert.fail();
			}
		}

		@Given("admin enters {string}, {string}")
		public void admin_enters(String date, String year) {
			
			try
			{
				driver.findElement(By.name("jj")).sendKeys(date);
				Thread.sleep(3000);
				driver.findElement(By.name("aa")).click();
				Thread.sleep(3000);
				System.out.println("Admin can enter year and date,yes!");
			}
			catch (Exception e)
			{
				System.out.println("Afmin is unable to enter year and month"+e);
				Assert.fail();
			}
		    
		}

		@Given("clicks on OK")
		public void clicks_on_OK() {
			try 
			{
				driver.findElement(By.xpath("//*[@id='timestampdiv']/p/a[1]")).click();
				Thread.sleep(3000);
				
			}
			catch (Exception e)
			{
				System.out.println("Can't"+e);
				Assert.fail();
			}
		}
		
		
		
		@Then("admin clicks on Main Publish button")
		public void admin_clicks_on_Main_Publish_button() {
			
			try 
			{
				driver.findElement(By.xpath("//input[@id='publish']")).click();
				Thread.sleep(3000);
				
			}
			catch (Exception e)
			{
				System.out.println("Not able to Publish My Property "+e);
			}
		}
		
		@Then("verifies displayed message")
		public void verifies_displayed_message() {
			try
			{
				boolean message1= driver.findElement(By.xpath("//*[@id='message']")).isDisplayed();
				System.out.println("Post published meassage is displayed"+message1);
				
			}
			catch (Exception e)
			{
				System.out.println("OOps can't see verification meassage"+e);
			}
		    
		}
		
		
		
		@Then("clicks on View_Post")
		public void clicks_on_View_Post() {
		    try
		    {
		    	driver.findElement(By.xpath("//*[text()='View post']")).click();
		    	Thread.sleep(3000);
		    	System.out.println("Admin clicks on View Post , Yes!");
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Cannt click on View Post "+e);
		    	Assert.fail();
		    }
		}
		
		@Then("admin navigates to post")
		public void admin_navigates_to_post() {
			try {
				boolean post = driver.findElement(By.xpath("//a[@title='Real Estate']")).isDisplayed();
				Thread.sleep(3000);
				System.out.println("Admin is navigated to Published Post :" +post);
			}
			catch (Exception e)
			{
				System.out.println("Admin is unable to View Published Post! "+e);
				Assert.fail();
			}
		}

		@Then("admin navigates to previous page")
		public void admin_navigates_to_previous_page() {
			try
			{
				driver.navigate().back();
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println("Admin is not able to navigate on previous page! " +e);
			
			}
		    
		}

		@Then("deletes a letter from title")
		public void deletes_a_letter_from_title() {
			try
			{
				WebElement text = driver.findElement(By.xpath("//input[@id='title']"));
				text.sendKeys(Keys.BACK_SPACE);
				Thread.sleep(3000);
			}
		    catch (Exception e)
			{
		    	System.out.println("Admin is not able to delete a letter " +e);
			}
		}

		@Then("clicks on update")
		public void clicks_on_update() {
			try
			{
				driver.findElement(By.xpath("//input[@id='publish']")).click();
				Thread.sleep(3000);
			}
		    catch (Exception e)
			{
		    	System.out.println("Admin is not able to click on Update Button "+e);
			}
		    
		}

		@Then("clicks on view post")
		public void clicks_on_view_post() {
			try
			{
				driver.findElement(By.xpath("//*[text()='View post']")).click();
		    	Thread.sleep(3000);
		    	System.out.println("Admin clicks on View Post , Yes!");
			}
		    catch (Exception e)
			{
		    	System.out.println("Admin is not able to clcik on View Post "+e);
			}
		    
		}
		
		@Then("navigates to post")
		public void navigates_to_post() {
			
			try {
				boolean post = driver.findElement(By.xpath("//a[@title='Real Estate']")).isDisplayed();
				Thread.sleep(3000);
				System.out.println("Admin is navigated to Published Post :" +post);
			}
			catch (Exception e)
			{
				System.out.println("Admin is unable to View Published Post! "+e);
				Assert.fail();
			}

		}
		
		@Then("Navigates back on previous page")
		public void navigates_back_on_previous_page() {
		    try
		    {
		    	driver.navigate().back();
		    	Thread.sleep(3000);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Admin is not able to Navigate On Previous Page! " +e);
		    }
		}

		@Then("clciks on Add New button")
		public void clciks_on_Add_New_button() {
		    try
		    {
		    	driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
		    	Thread.sleep(3000);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Admin is not able to click on Add New Button! " +e);
		    }
		}

		@Then("admin verifies title field to add new property")
		public void admin_verifies_title_field_to_add_new_property() {
		    try
		    {
		    	boolean t1 = driver.findElement(By.xpath("//*[@id='title-prompt-text']")).isDisplayed();
		    	System.out.println(t1);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Admin is not able to varify title field! "+e);
		    	
		    }
		}
		
		@Given("admin is on Properties Add New page")
		public void admin_is_on_Properties_Add_New_page() {
			
			try {
				boolean t2 = driver.findElement(By.xpath("//h1[@class='wp-heading-inline']")).isDisplayed();
				
				
		    System.out.println("Admin is on Add New Page " +t2);
			}
			catch (Exception e)
			{
				System.out.println("Admin is not on Add New Page! "+e);
			}
		}

		@Given("admin enters {string}")
		public void admin_enters(String title) {
			try
			{
				WebElement obj = driver.findElement(By.name("post_title"));
				obj.sendKeys(title);
				Thread.sleep(3000);
				System.out.println(title);
				
			}
			catch (Exception e)
			{
				System.out.println("Admin is not able to enter title "+e);
				
			}
		    
		}

		@Given("admin clicks on publish")
		public void admin_clicks_on_publish() {
		   
		    	try {	
			    	driver.findElement(By.xpath("//input[@id='publish']")).click();
			    	Thread.sleep(3000);
			    }
			    catch (Exception e)
			    {
		    	System.out.println("Not able to click on publish button"+e);
			    }
		    
		    
		}

		@Given("admin clicks on move to trash link")
		public void admin_clicks_on_move_to_trash_link() {
			
			try
		    {
		    	driver.findElement(By.xpath("//a[@class='submitdelete deletion']")).click();
		    	Thread.sleep(3000);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Not able to click on Trash Link! "+e);
		    	
		    }
		}

		@Then("admin navigates to properties page")
		public void admin_navigates_to_properties_page() {
			try
		    {
		    	boolean p1 = driver.findElement(By.xpath("//h1[@class='wp-heading-inline']")).isDisplayed();
		    	System.out.println(p1);
		    }
		    catch (Exception e)
		    {
		    	System.out.println("Not on Properties page! " +e);
		    }
		    
		}
		

		@Then("alert message appears on screen")
		public void alert_message_appears_on_screen() {
			try
		    {
				if(driver.getPageSource().contains("You can’t edit this item because it is in the Trash. Please restore it and try again.")){
					System.out.println("Text is present");
					}else{
					System.out.println("Text is absent");
					}

		    }
		    catch (Exception e)
		    {
		    	System.out.println("Message Not verified " +e);
		    }
		    
		}

		@Then("admin navigates back again")
		public void admin_navigates_back_again() {
			try
		    {
				driver.navigate().back();
		    	
		    }
		    catch (Exception e)
		    {
		    	System.out.println("No navigation "+e);
		    }
		    
		}

		@Then("admin is again ready to Add New Property on Real Estate website")
		public void admin_is_again_ready_to_Add_New_Property_on_Real_Estate_website() {
			
			try
		    {
				System.out.println("Finally done!");
		    }
		    catch (Exception e)
		    {
		    	System.out.println("not yet done!" +e);
		    	Assert.fail();
		    }
		    
		}
		
		

		

	

		
		
		
		 
	
	
	
	

}
