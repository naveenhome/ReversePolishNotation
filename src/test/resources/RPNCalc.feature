Feature: RPN calculator

  Scenario: Addition
    Given user enter "2,2,+"
    Then result should be "4"

  Scenario: Complex calculation adding mutliple operator
    Given user enter "2,3,4,+,-"
    Then result should be "-5"

    #collaboration steps, during product backlog refinement (PO + DT)