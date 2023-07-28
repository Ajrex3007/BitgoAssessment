Feature:
  Testcases for Blazedemo for atmosol Assignment

  Background:
    Given I launch the application

    Scenario Outline: Purchase Flight Tickets in Blazedemo
      And I validate the title of the page
      Then I validate the destination of the week
      Given I enter the "<srcCity>" and "<DestinationCity>"
      Then I Click on the ChooseThisFlight Button for the lowest price
      Then I validate the Total cost is present
      Then I click on the purchaseFlight button
      Then the ID should be displayed

      Examples:
        | srcCity     | DestinationCity |
        | Mexico City | London          |







