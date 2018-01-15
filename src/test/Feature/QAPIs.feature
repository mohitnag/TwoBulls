Feature: API Testing
  Scenario: To test the Post request API
    Given user post the request to the EndPoint "http://passwordutility.net:80/api/password/generate" with userId "70f3fc6beac4412b82db266b4796b" and password "123456"
    Then I verify the status code 200

  Scenario: TO test the Get request API
    Given user do Get request to the EndPoint "https://od-api-demo.oxforddictionaries.com:443/api/v1/domains/es/es" with appId "!no1me2digas!" and appKey "0clave42"
    Then I verify the status code 200
