Feature: Cash Withdrawl
Scenario: Sucessfull withdrawl from a account in credit
Given I have deposit 1000 NOK in my account 
When I withdraw 200 NOK
Then 200 NOK shoul be dispensed
