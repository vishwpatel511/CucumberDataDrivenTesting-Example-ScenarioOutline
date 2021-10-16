Feature: sign up feature for facebook

Scenario Outline: account registeration for new user

Given user is on the facebook homepage
Then user clicks on the create new account
And a new model shows up
Then user enters "<fname>" in fname
And user enters "<lname>" in lname
And user enters "<email>" in email
And user enters "<password>" in password
And user selects "<dayofBirth>" as a day of birth
And user selects "<monthofBirth>" as a month of bith
And user selects "<yearofBirth>" as a year of birth
And user selects "<gender>" as a gender
And user clicks the sign up button.

Examples:
|fname|lname|email|password|dayofBirth|monthofBirth|yearofBirth| gender|
| Micheal | Bluffers | michealbluffs8484512@yahoo.com| MeMicheal!007| 23 | Mar | 1987 | Male| 
| Justine | Bush | jbush889512@yahoo.com| MeJbush!001| 13 | Oct | 1990 | Custom |
| Countney | Hazelwood | chazel8484512@yahoo.com| MeCourtnet!173| 10 | Nov | 1978 | Female|
| Hillary | Cook | hcook8404512@hotmail.com| MeHillary@987| 21 | Jan | 2001 | Female|
| Steve | Biden | sbiden41512@yahoo.com| MeTheBiden!001| 16 | Dec | 1981 | Male|
