Feature: Login to MagentoTrial.com
  Scenario: user navigate to Magento home page and login with invalid user name and password
    Given user go to url "http://enterprise-demo.user.magentotrial.com"
    When user sign in with the userid "test@pixafy.com" and password "123456"
    And user see an error message
