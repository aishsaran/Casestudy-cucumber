Feature: TestmeApp registration
Scenario: Registeration for the test me app
Given user is on signup page
When user enters username as "aishusaran"
When user enters firstname as "aishwarya"
When user enters lastname as "saravanan"
When user enters password as "harrypotter"
When user enters confirmpass as "harrypotter"
And click on female button
When user enters email as "aishforever97@gmail.com"
When user enters mobilenum as "9962574133"
When user enters dob as "15/11/1997"
When user enters address as "No. 12,anna nagar, chennai-102"
When user selects security question
When user enters the answer as "aishu"
And user clicks register button
Then verify registeration success

