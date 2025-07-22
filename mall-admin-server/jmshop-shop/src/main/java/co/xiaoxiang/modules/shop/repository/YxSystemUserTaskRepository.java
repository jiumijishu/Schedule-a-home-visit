package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxSystemUserTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-12-04
*/
public interface YxSystemUserTaskRepository extends JpaRepository<YxSystemUserTask, Integer>, JpaSpecificationExecutor {
}
