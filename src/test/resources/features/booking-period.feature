Feature: Flight Ticket Booking Period Service
  As a user I want to set advance booking period to current month-1 so that I can book my ticket

  Scenario Outline: set the advance booking period
    Given I have a flight ticket booking with booking period
    When  I provide the <bookingDate>
    Then  Advance booking date should be <advanceBookingDate>
    Examples:
      | bookingDate | advanceBookingDate |
      | 22-10-2019  | 22-09-2019           |



