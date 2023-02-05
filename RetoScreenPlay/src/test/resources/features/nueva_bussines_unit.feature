#Autor Aaron
@bussinessUnit
Feature: Create a bussines Unit
  As i user i want to create a new bussiness unit in the serenity web demo


  @CreateBussiness
  Scenario: Create a Bussines Unit
    Given : Aaron search in ProFeatures for a Business Unit
    When  : he created a new  Bussines Unit
    And : fill the camps to created a new one
    Then  : i would see the new bussines unit created in the table
