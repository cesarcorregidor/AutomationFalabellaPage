Feature: validate elements

  Background:
    Given He is on the page of https://www.falabella.com.co/falabella-co

    Scenario Outline: <Scene>

      When he add a random item to the cart
      Then he validates that he is already on the home page

      Examples:
        | Scene                                      | url                                       |
        | add product to cart and validate home page | https://www.falabella.com.co/falabella-co |