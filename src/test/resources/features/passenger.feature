# Created by Pattabhi A s
Feature: Passenger Policy
  Adding and Removing Passengers based on type in flight booking

  Scenario: # Economy flight, usual passenger
    Given there is an economy flight
    When we have a usual passenger
    Then you can add and remove him from economy flights

  Scenario: # Economy flight, usual passenger
    Given there is an business flight
    When we have a VIP passenger
    Then you can add but cannot remove him from economy flights