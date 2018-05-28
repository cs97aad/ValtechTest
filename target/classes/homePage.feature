Feature: As a user,
  I want to be able to
  navigate to valtech homepage

  Scenario Outline: navigate to homaPage
    Given I am on the "homePage"
    And I confirm "Latest News" section is displayed
    When I click on "<pagetypes>" pages


    Examples: Pages
    | pagetypes | confirmpage     |
    | about     | confirmAbout    |
    | services  | confirmservices |
    | work      | confirmwork     |



