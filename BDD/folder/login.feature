Feature: login

Scenario: validate the title home page
Given launch the site
When  check the title with "KEXIM Bank" data
Then  home page should be displayed with login fields
And  close the site

Scenario: validate the user id and password fields
Given launch the site
Then enter the user id and password fields
Then branch button has to displayed
And close the site 