Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initilize browser with Chrome
And Navigate to "https://vl.avtosushi.ru/" site
And Click on Login link in home page to land on secure sign in page
When User eneters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And close browsers

Examples:
|username				|password	|
|renat.tat@mail.ru		|123123		|
|123renat.tat@mail.ru	|654987    	|
|345renat.tat@mail.ru	|2343212   	|