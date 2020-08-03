@fhcregister
Feature: FhcTrip Registration
  Scenario: fhcTrip registration test
    Given kullanici fhctrip sayfasindadir
    And kullanici “create a new account” butonuna tiklar
    And kullanici username girer
    And kullanici password girer
    And kullanici email girer
    And kullanici fullname girer
    And kullanici phone girer
    And kullanici SSN girer
    And kullanici Driven lisans girer
    And kullanici country dropdowndan secer
    And kullanici state dropdowndan secer
    And kullanici adress girer
    And kullanici working sector girer
    And kullanici birthday girer
    Then kullanici save butonuna tiklar
