Feature: product validation

  Background:
    Given He is on the page of https://www.falabella.com.co/falabella-co

    Scenario Outline: Select and Validate

      When He refresh the home page and He verify that the logo has loaded
      And He clicked on the fourth product and saved the name
      Then He validates that the product has the same name

      Examples:
        | url                           |
        | https://www.falabella.com.co/ |

