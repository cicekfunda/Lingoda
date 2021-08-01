Feature: User joins JavaScript tab

  Background:
    Given User is on the TodoMVC page
    When User should click on "JavaScript" tab
    And User should click on "Polymer" link


  Scenario Outline: User should be add Todo items
    And User adds "<Todo>" item
    Then User should see the created "<Todo>" item
    Examples:
      | Todo       |
      | Todo1 item |
      | Todo2 item |


  @wip
  Scenario: User should be edit Todo items
    And User adds "Todo1 item" as a Todo item1
    And User adds "Todo2 item" as a Todo item2
    Then User edits the content of the "Todo2 item" Todo item2







