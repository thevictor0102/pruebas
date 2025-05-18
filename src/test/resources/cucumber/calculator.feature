Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself
  
  	Background: Precondicion general
		Given I have a calculator
  
  	@add
    Scenario: Add two numbers
    When I add 2 and 3
    Then the result should be 5

	  @subtract
	  Scenario: Subtract two numbers
    When I subtract 4 and 3
    Then the result should be 1
    
    @multiply
    Scenario: Multiply two numbers
    When I multiply 2 and 3
    Then the result should be 6
    
    @divide
    Scenario: Divide two numbers
    When I divide 6 and 2
    Then the result should be 3
    
    @elevar
    Scenario: Elevar un numero a otro numero
    When Yo elevo 2 con exponente 3
    Then the result should be 8
