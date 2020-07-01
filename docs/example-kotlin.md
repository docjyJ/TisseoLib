```kotlin
import fr.docjyJ.tisseoLib.request.*
import java.time.LocalDateTime

private const val API_KEY = "null-api-key" // Insert your api key

fun stopArea() = StopAreaRequest(API_KEY) //Create request object
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request

fun stopPoint() = StopPointRequest(API_KEY) //Create request object
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
        displayDestinations = true
        displayLines = true
    }
    .execute() //Execute request

//TODO PLACES

fun networks() = NetworksRequest(API_KEY) //Create request object
    .execute() //Execute request

fun lines() = LinesRequest(API_KEY)
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayTerminus = true
    }
    .execute() //Execute request

fun stopSchedules()= StopSchedulesRequest(API_KEY) //Create request object
    .apply { //Set parameters
        stopsList = "1970324837184892,3377699720882831"
        datetime = LocalDateTime.now()
    }
    .execute() //Execute request

//TODO ROLLING_STOCKS

//TODO ROLLING_STOCKS

fun journeys() = JourneysRequest(API_KEY)//Create request Object
        .apply { //set parameters
            departurePlace = "basso cambo "
            arrivalPlace = "françois verdier toulouse"
            firstDepartureDatetime = LocalDateTime.now()
        }
        .execute() //Execute request

fun messages() = MessagesRequest(API_KEY) //Create request object
    .execute() //Execute request

//TODO SERVICE_DENSITY

```
[SOURCE](https://github.com/docjyJ/TisseoLib/blob/master/src/test/kotlin/Example.kt)