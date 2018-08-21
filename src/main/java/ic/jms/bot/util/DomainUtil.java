package ic.jms.bot.util;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import ic.jms.bot.domain.LineMessage;
import ic.jms.bot.type.LineMessageType;

import java.time.LocalDateTime;

/**
 * @author jamesliao
 * @since 2018/8/11
 */
public class DomainUtil {
    public static LineMessage fromMessageEvent(MessageEvent<TextMessageContent> event) {
        LineMessage lineMessage = new LineMessage();
        lineMessage.setMessage(event.getMessage()
                                    .getText());
        lineMessage.setSendDate(LocalDateTime.now());
        lineMessage.setSenderId(event.getSource()
                                     .getSenderId());
        lineMessage.setUserId(event.getSource()
                                   .getUserId());
        lineMessage.setLineMessageType(LineMessageType.TEXT);
        return lineMessage;
    }
}
