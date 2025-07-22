package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxSystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-10-10
*/
public interface YxSystemConfigRepository extends JpaRepository<YxSystemConfig, Integer>, JpaSpecificationExecutor {
    YxSystemConfig findByMenuName(String str);
}
