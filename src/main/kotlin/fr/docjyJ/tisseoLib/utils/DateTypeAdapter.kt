package fr.docjyJ.tisseoLib.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


internal class DateTypeAdapter : JsonDeserializer<Date> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): Date {
        val code = json.asString
        return try {
            SimpleDateFormat("yyyy-MM-dd HH:mm").parse(code)!!
        } catch (e: ParseException){
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(code)!!
        }
    }
}
