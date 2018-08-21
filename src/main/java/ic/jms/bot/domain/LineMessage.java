package ic.jms.bot.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ic.jms.bot.type.LineMessageType;
import ic.jms.bot.util.CustomLocalDateTimeDeserializer;
import ic.jms.bot.util.CustomLocalDateTimeSerializer;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author jamesliao
 * @since 2018/8/10
 */
@Entity
public class LineMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    @Column(nullable = false)
    private String senderId;

    @Type(type = "java.time.LocalDateTime")
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    @Column(name = "sendDate",
            nullable = false)
    private LocalDateTime sendDate;

    @Column(name = "message",
            length = Integer.MAX_VALUE)
    private String message;

    @Column(name = "botReply",
            length = Integer.MAX_VALUE)
    private String botReply;

    @Column(name = "messageType")
    private LineMessageType lineMessageType;

    @Column(name = "userId")
    private String userId;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LineMessageType getLineMessageType() {
        return lineMessageType;
    }

    public String getBotReply() {
        return botReply;
    }

    public void setBotReply(String botReply) {
        this.botReply = botReply;
    }

    public void setLineMessageType(LineMessageType lineMessageType) {
        this.lineMessageType = lineMessageType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
