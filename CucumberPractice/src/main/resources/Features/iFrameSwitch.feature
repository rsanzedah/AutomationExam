Feature: Switching to iFrame

Scenario: Click Button inside iFrame
Given Frame Page I switch to sql frame
Then I click on SQL tab
Then I validate SQL Frame
Then I will switch to the main frame
Then click PHP link
Then validate PHP link