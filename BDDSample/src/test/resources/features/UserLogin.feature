Feature: User Login Feature

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Success Msg

#"tomsmith"
#"SuperSecretPassword!"

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Success Msg

#Examples:

# | username | password |
# | tomsmith | SuperSecretPassword! |
# | testuser1 | welcome123 |
# | testuser2 | welcome123 |

Scenario: Valid Login
Given User is on Login Page
When User enters credentials
 | tomsmith | SuperSecretPassword! |
 
Then Should display Success Msg