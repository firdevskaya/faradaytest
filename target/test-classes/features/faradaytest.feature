 Feature: US_001 SEARCHBUG

   ## yanlis bilgilerle test  // negative test
   @faraday
   Scenario: TC_01 SEARCH TEST
      Given go to faraday website
   And click contact button
     And enter the name
     And enter  mobilephonenumber
     And enter the   email
     And enter companyname
     And selectfirst
     And  selectsecond
     And send message
