package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxSystemStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2020-03-03
*/
public interface YxSystemStoreRepository extends JpaRepository<YxSystemStore, Integer>, JpaSpecificationExecutor<YxSystemStore> {
}
