Feature: add property feature
 
    Background: Verify sign in page 
    Given admin is on Real Estate website
    Then admin clicks on login
    Then admin enters username "amit92luthra" and password "admin@987654321"
    And clicks on Sign in button
    #Then admin navigates to dashboard
    And admin hovers on Properties then clciks on Add New field 
    
    Scenario Outline: Verify Add property Field-Auto
      Given admin is on add new page
      And clicks on enter title here "<title>"
      When url is generated
      
      Examples:
      
      | title             |
      | neral_2           |
      | neral@city123     |
      |                   |
      
      
      Scenario: Verify Add Media  
      Then admin clicks on Visual button
      And admin clicks on add media button
      Then Media pop up gets display
      And admin clicks on upload files
      Then admin click on media library
      Then admin selects all media items drop down menu
      Then admin clicks on All dates
      And selects required date
      #And admin verifies image
      #Then image is dispayed
      #Then click on Insert post
      #And image is displayed on given box
      And admin clicks on close button
      
      
      
      
      Scenario Outline: Verify floorplans
      When admin clicks on floorplans
      Then Floorplans field is visible
      Then admin enters "<title>", "<area>", "<description>"
      
      
      
      Examples:
      | title | area        | description     |
      | hall  | 690 sq.feet | Glimpse of hall! |    
      
      Scenario Outline: Verify Add another floorplan
      
      Then admin clicks on add another editor
      And enters "<title>", "<area>", "<description>"
      Then removes that added editor
      
      Examples:
      | title    | area        | description        |
      | balcony  | 690 sq.feet | Glimpse of balcony |
      
      Scenario: Verify Author field
      
      When admin selects dropdown menu
      Then admin selects  author name
      
      Scenario: To verify Discussion feild
      When admin selects checkbox of discussion
      Then checkbox is selected
      
      
      Scenario: Automated Verification of Screen Option
      When admin clicks on Screen Options
      Then admin should see all screen options
      And admin should uncheck the already checked boxes
      And admin clicks on first radio button
      And admin clicks on second radio button
      And admin selects checkbox
      Then Admin verifies changes are made or not
      
      Scenario Outline: Automated verification of Publish field and Update Button
      Given admin is on Add New page
      And admin enters title of property "<title>"
      And admin enters text in given field "<text>"
      And admin changed heading style
      And admin aligns text at center
      And admin clicks on edit button of status option of Publish Field 
      And admin selects status as Draft from dropdown
      And admin clicks on Ok button
      And admin clicks on edit of Visibility 
      And admin clicks on radio button of visibility option
      And admin clicks on ok
      And admin clicks on edit button of Publish option
      And admin clicks on cancel button
      And admin clicks on edit option agian of publish button
      And admin selects month from dropdown
      And admin enters "<date>", "<year>"
      And clicks on OK 
      And verifies displayed message
      And admin clicks on Main Publish button
      Then clicks on View_Post
      And admin navigates to post
      And admin navigates to previous page
      And deletes a letter from title
      And clicks on update 
      Then clicks on view post
      And navigates to post
      And Navigates back on previous page
      And clciks on Add New button
      Then admin verifies title field to add new property
      
      Examples:
      
      | title            | text             | date | year |
      | New_launch_View_1|   New Property   | 14   | 2021 |
      
      Scenario Outline: Automated verification move to trash link
      Given admin is on Properties Add New page
      And admin enters "<title>"
      And admin clicks on publish
      And admin clicks on move to trash link
      Then admin navigates to properties page
      And admin navigates to previous page
      But alert message appears on screen
      Then admin navigates back again
      And admin is again ready to Add New Property on Real Estate website
      
      Examples:
      | title          |
      | Mumbai_@_launch | 
      
      
       
       
      
      
      
      
      
      
      
      
    
      
      
      
      
      
      
      
      
      



    
