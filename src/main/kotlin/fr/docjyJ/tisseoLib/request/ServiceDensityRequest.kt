package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.ServiceDensityResponse
import java.time.LocalDateTime

/**
 * The class builder to do a Service Density request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 * @property centerXY Address or place of departure or arrival.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property serviceNumber Number of distinct transport services we want to reach in the time slot .
 * @property beginDateTimeSlot Beginning date and time of time slot.
 * @property endDateTimeSlot Ending date and time of time slot.
 * @property networkList Transport operators list.
 * @property rollingStockList Transport mode list.
 * @property displayServices Displays the services found in the area covered.
 */

class ServiceDensityRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<ServiceDensityResponse>(
        "services_density",
        ServiceDensityResponse::class.java
) {
    @QueryName("centerXY")
    var centerXY:String? = null
    @QueryName("srid")
    var srid:String? = null
    @QueryName("serviceNumber")
    var serviceNumber:Int? = null
    @QueryName("beginDateTimeSlot")
    var beginDateTimeSlot:LocalDateTime? = null
    @QueryName("endDateTimeSlot")
    var endDateTimeSlot:LocalDateTime? = null
    @QueryName("networkList")
    var networkList:String? = null
    @QueryName("rollingStockList")
    var rollingStockList:String? = null
    @QueryName("displayServices")
    var displayServices:Boolean? = null
}
