Feature:Login 
Scenario Outline: login with registered username
Given user is on login page
When user enters valid username as"<un>"
When user enters valid password as"<pass>"

And clicks onlogin button
Then verify login successful

Examples:
|un||pass|
|lalitha| |password123|      
|aishsaran||aishusaran|
|aishusaran||harrypotter|


