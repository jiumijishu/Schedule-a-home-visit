package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxStoreOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-11-02
*/
public interface YxStoreOrderStatusRepository extends JpaRepository<YxStoreOrderStatus, Integer>, JpaSpecificationExecutor {
}
