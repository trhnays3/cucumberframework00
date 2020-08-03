@testcase1
Feature: Automation Practise 1
  Scenario: Automation practice create account
    Given user web sayfasinda
    And user sign in linkine tiklar
    And user Create an account bolumune  email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olusturuldugunu dogrulayin
