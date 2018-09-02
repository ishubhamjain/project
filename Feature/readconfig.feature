
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

Scenario: Read data from config file
	Given Read data from config
	
	Scenario: Read data from config files
	Given Read data from config
	
  Scenario: monoconic test
	Given monoconic test
