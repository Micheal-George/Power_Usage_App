# Power_Usage_App
cognitive cloud assignment

user flow

add user
{
  "display_name": "Sam",
  "emailId": "sammanual@gmail.com",
  "id": 0,
  "mobileNumber": "7907304335",
  "password": "callme",
  "username": "Sam"
}


login user
{
  "id": 0,
  "mobileNumber": "7907304335",
  "password": "callme"
}

    response 
     UserSession(id=9, userId=8, username=Sam, uuid=yLPU0s, localDateTime=2022-11-17T15:59:47.380739100)


add usage
{
  "applianceType": "low-power",
  "fromTime": "2022-11-17 01:02:00",
  "toTime": "2022-11-17 03:02:00"
}
  
   reponse
    {
  "id": 10,
  "fromTime": "2022-11-17 01:02:00",
  "toTime": "2022-11-17 03:02:00",
  "unitConsumed": 4,
  "duration": "02:00:00",
  "applianceType": "low-power"
   }


getlist power usage
{
  "fromTime": "2022-10-16 00:02:00",
  "toTime": "2022-11-17 10:02:00"
}

 response
  [
  {
    "id": 4,
    "fromTime": "2022-11-17 06:06:20",
    "toTime": "2022-11-17 08:06:20",
    "unitConsumed": 4,
    "duration": "02:00:00",
    "applianceType": "low-power"
  },
  {
    "id": 5,
    "fromTime": "2022-11-17 05:38:48",
    "toTime": "2022-11-17 08:38:46",
    "unitConsumed": 11.933333333333334,
    "duration": "02:59:00",
    "applianceType": "high-power"
  },
  {
    "id": 6,
    "fromTime": "2022-11-17 08:20:39",
    "toTime": "2022-11-17 08:43:39",
    "unitConsumed": 1.1500000000000001,
    "duration": "00:23:00",
    "applianceType": "mid-power"
  },
  {
    "id": 10,
    "fromTime": "2022-11-17 01:02:00",
    "toTime": "2022-11-17 03:02:00",
    "unitConsumed": 4,
    "duration": "02:00:00",
    "applianceType": "low-power"
  }
 ]

get day wise usage
{
  "fromTime": "2022-10-16 00:02:00",
  "toTime": "2022-11-17 10:02:00"
}

  reponse
   {
  "day": 32,
  "unitconsumed": 20
   }


logout
  
   

