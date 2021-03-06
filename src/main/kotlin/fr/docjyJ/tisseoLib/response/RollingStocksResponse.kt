package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.rollingStock.RollingStock
import java.time.LocalDateTime

/**
 * The response class of a rolling stocks request.
 *
 * @property expirationDate The expiration date of the content.
 * @property rollingStocks Contains Rolling Stocks.
 */

data class RollingStocksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("rollingStocks")
    val rollingStocks: List<RollingStock>
) : ResponseTemplate
