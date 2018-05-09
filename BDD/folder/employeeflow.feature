Feature: employee flow
Scenario Outline: validate the employee creation
    Given launch the site
    Then enter the user id and password fields
    Then click on the employee button
    Then click on the new employee button and enter the employee creation details with "<row-index>" data set  
    And close the site
    Examples:
    |row-index|
    |1|
    |2|
    |3|