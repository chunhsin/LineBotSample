package ic.jms.bot.resource;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import ic.jms.bot.domain.LineMessage;
import ic.jms.bot.repository.LineMessageRepository;
import ic.jms.bot.util.DomainUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jamesliao
 * @since 2018/8/6
 */
@RestController
@LineMessageHandler
public class LineCallbackResource {

    @Autowired
    private LineMessageRepository lineMessageRepository;

    @RequestMapping("/")
    public ResponseEntity helloBot() {
        return ResponseEntity.ok("");
    }

    @EventMapping
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
        System.out.println("event: " + event);
        LineMessage message = DomainUtil.fromMessageEvent(event);
        String botReply = "You said : " + message.getMessage();
        message.setBotReply(botReply);
        lineMessageRepository.save(message);
        return new TextMessage(botReply);
    }

}
