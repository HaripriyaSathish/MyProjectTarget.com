Feature:  To Validate the SignUp functionality in Webapplication
@Regression
Scenario: To Create an Account in target.com Application
#Given   To launch browser and maximize
When    To launch the target.com WebApplication 
And     To Click signin icon in the homepage
And     To Click create account link 
#One dimensional list
And     To enter the values in emailId field
      |priya|kavi@|Vinu@|

 #Two dimensional list
And     To enter the values in create password field
  
       |priya@123|sathish@123|gayu@345|
       |dheeva@678|anu@456|ramu@567|
       |lily@345|jasmine@789|meera@678| 
 
And     To enter the mobile number in mobile number field      
Then    To validate the credentials create the account    

@Sanity @Smoke
Scenario: To validate the signup functionality
#Given     To Launch the browser and Maximize
When      To Launch the Application
And       To click the signin icon present in homepage
And       To click Create Account link 

#One dimensional map
And       To pass the values in first name field
               |First one  |Dheeva|
               |First two  |Ramu|
               |First three|Seetha|
               |First four |Geetha|
 
 #Two dimensional map              
And       To pass the values in last name field
              |Last one|Last two|Last three|Last four |Last five |
              |Jack    | Ken    |Sathish   |   Y      |   N      |
              |Kamal   |Hari    |P         |Gopal     |Mani      |
              |Kiran   |Charan  |D         |T         |Ram       |
              
Then      To validate the values create account
      





