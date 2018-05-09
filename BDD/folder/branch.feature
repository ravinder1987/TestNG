Feature: branch
Scenario Outline: validate the Branch flow
    Given launch the site
    Then enter the user id and password fields
    Then click on the branch button
    Then click on the new branch and enter the branch details with "<row-index>" data set  
    And close the site
    Examples:
    |row-index|
    |1|
    |2|
    |3|
    
    
          
        
    