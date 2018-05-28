Feature: As a user,
  I want to be able to
  navigate to valtech homepage

  Scenario Outline: navigate to homaPage
    Given I am on the "homePage"
    And I confirm "Latest News" section is displayed
    When I click on "<pagetypes>" pages
    And I verify the "<confirmpage>" are displayed
    And I navigate to contact pages to count the numbers of offices
    Then the number of offices are displayed.

    Examples: Pages
    | pagetypes | confirmpage     |
    | about     | confirmAbout    |
    | services  | confirmservices |
    | work      | confirmwork     |



