# Autor : Cristian Avendaño
  @stories
  Feature: StartSharp
    As a user, I want automate the StartSharp create new meeting
    Background:
      Given that Admin log in in the StartSharp page
      |strUsername|strPassword|
      |  admin    |serenity   |

    @createBusinessUnit
    Scenario Outline: sign in startSharp and create business unit
      When he create the business unit
        | strNameBusiness   | strParentUnit   |
        | <strNameBusiness> | <strParentUnit> |
      Then new meeting is created
        | strNameBusiness   |
        | <strNameBusiness> |

      Examples:
        | strNameBusiness | strParentUnit |
        | business-prueba1   | Administration  |

    @createMeeting
    Scenario Outline: Create new meeting that asociate with the new business Unit
      When he create the new meeting
        | strNameBusiness   | strParentUnit   | NameMeeting   | NumberMeeting   | type     | fechaInicio   | hourStart   | endDate    | endHour   | location   | organizedBy  | reporter   | attendee     |
        | <strNameBusiness> | <strParentUnit> | <NameMeeting> | <NumberMeeting> | <type>   | <fechaInicio> | <hourStart> | <endDate>  | <endHour> | <location> | <organizedBy>| <reporter> | <attendee>   |
      Then new meeting is created and validate
        | NameMeeting   | strNameBusiness    |
        | <NameMeeting> | <strNameBusiness>  |

      Examples:
        | strNameBusiness | strParentUnit  | NameMeeting | NumberMeeting | type     | fechaInicio | hourStart | endDate    | endHour | location | organizedBy  | reporter   | attendee     |
        | business-prueba1   | Administration | MeetingTestt | abc123asd     | Customer | 05/10/2022  | 14:20     | 05/10/2022 | 15:40   | HQ-01    | Brian Morgan | Jose Hayes | Alexis Lopez |


