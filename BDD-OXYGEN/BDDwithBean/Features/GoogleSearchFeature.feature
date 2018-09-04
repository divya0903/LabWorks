Feature: Google search feature
Using this feature user can search website available in the internet

@google
Scenario: user wants to search information about 'Agile Methodology' by entering valid set of words

Given user is on google home page

When user searches for 'Agile Methodology' term
Then all the pages linked with 'Agile Methodology' must be displayed