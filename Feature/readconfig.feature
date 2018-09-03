
Feature: code-breaker submits guess
  The code-breaker submits a guess of four colored
  pegs. The mastermind game marks the guess with black
  and white "marker" pegs.
  For each peg in the guess that matches color
  and position of a peg in the secret code, the
  mark includes one black peg. For each additional
  peg in the guess that matches the color but not
  the position of a color in the secret code, a
  white peg is added to the mark.

Background: User is Logged In
	Given I navigate to the login page

@testtag1
Scenario: Read data from config file
	Given Read data from config
	
@testtag2
Scenario: Read data from config files
	Given Read data from config
	
@ui
Scenario: Read data from config files
	Given Read data from config
	
  #Scenario: monoconic test
#	Given monoconic test
	
#Scenario Outline: Looking up the definition of fruits
    #Given the user is on the Wikionary home page
    #When the user <name> looks up the definition of the word <name>
    #Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
    #Examples:
    #| name |
    #| pear |
    
    Scenario Outline: Looking up the definition of fruits
    Given the user <name> looks up the definition of the word <name> and <test> and <test> and <name>
    Examples:
    | name | test     |
    | pear | shuhbham |
