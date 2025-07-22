package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxStorePretype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author 雨神
* @date 2023-07-16
*/
public interface YxStorePretypeRepository extends JpaRepository<YxStorePretype, Integer>, JpaSpecificationExecutor<YxStorePretype> {
}
