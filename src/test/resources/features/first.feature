Feature: Поиск отеля

  Background:
    Given Browser is started
    Given Open page Booking Search

  Scenario Outline: Поиск отеля
    Given Search hotel "<hotelName>"
    When Hotel "<hotelName>" is displayed
    Then Score hotel "<hotelName>" is "<score>"
    Examples:
      | hotelName     | score |
      | Planeta Hotel | 8.0   |

  Scenario: Поиск отеля
    Given Search hotel "Planeta Hotel"
    When Hotel "Planeta Hotel" is displayed
    Then Score hotel "Planeta Hotel" is "8.0"



