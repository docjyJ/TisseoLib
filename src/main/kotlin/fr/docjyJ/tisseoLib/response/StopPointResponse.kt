package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.stopPoint.PhysicalStops
import java.time.LocalDateTime

/**
 * The response class of a stop points request.
 *
 * @property expirationDate The expiration date of the content.
 * @property physicalStops Contains Stops.
 */

data class StopPointResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("physicalStops")
    val physicalStops: PhysicalStops
) : ResponseTemplate
