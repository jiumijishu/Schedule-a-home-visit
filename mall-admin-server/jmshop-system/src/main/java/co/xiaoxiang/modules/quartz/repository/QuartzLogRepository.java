package co.xiaoxiang.modules.quartz.repository;

import co.xiaoxiang.modules.quartz.domain.QuartzLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Zheng Jie
 * @date 2019-01-07
 */
public interface QuartzLogRepository extends JpaRepository<QuartzLog,Long>, JpaSpecificationExecutor<QuartzLog> {

}
