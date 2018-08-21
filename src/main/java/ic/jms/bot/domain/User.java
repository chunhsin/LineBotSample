package ic.jms.bot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jamesliao
 * @since 2018/8/12
 */
@Entity
public class User {

    @Id
    private Integer id;

    private String userID;

    private String userName;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
