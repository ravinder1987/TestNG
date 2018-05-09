Feature: role flow
Scenario Outline: validate the role creation
    Given launch the site
    Then enter the user id and password fields
    Then click on the role button
    Then click on the new role button and enter the role creation details with "<row-index>" data set  
    And close the site
    Examples:
    |row-index|
    |1|
    |2|
    |3|