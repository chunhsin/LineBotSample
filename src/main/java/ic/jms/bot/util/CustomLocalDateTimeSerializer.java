package ic.jms.bot.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jamesliao
 * @since 2018/8/10
 */
public class CustomLocalDateTimeSerializer extends JsonSerializer {

    @Override
    public void serialize(Object value,
                          JsonGenerator generator,
                          SerializerProvider serializers) throws IOException {

        if (value instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) value;
            generator.writeString(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        }
        else{
            throw new IOException("Class "+value.getClass().getName()+" cannot be converted");
        }
    }
}
