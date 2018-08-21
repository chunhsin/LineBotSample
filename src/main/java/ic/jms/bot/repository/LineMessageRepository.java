package ic.jms.bot.repository;

import ic.jms.bot.domain.LineMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jamesliao
 * @since 2018/8/11
 */
@Repository
public interface LineMessageRepository extends JpaRepository<LineMessage, Long> {
}
