Feature: To validate the Login Functionality of Target.com WebApplication

Background:
#Given  To launch the browser and maximize window

@Sanity
Scenario: To validate the Login Fuctionality with invalid values

When   To launch the target.com Webapplication
And    To Click the account Icon
And    To Click Signin link 
And    To pass invalid EmailId in Email address field
And    To pass invalid Password in password field
And    To click a Login button
Then   To validate the Login button navigate to HomePage


@Regression @Smoke
Scenario Outline: To validate the login Functionality of target.com WebApplication

When  To launch the application
And   To click the SignIn icon in webpage
And   To click SignIn Link in webpage
And   To enter the user name "<emaildata>" in email field
And   To enter the password "<passworddata>"in password field
And   To click signIn button
Then  To validate the entered values

Examples:
      |emaildata|passworddata|
      |sathish  |ghj8765     |
      |priya    |pru8766     |
      |dheeva   |Dhe6558$    |