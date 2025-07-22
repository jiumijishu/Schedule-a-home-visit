package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxCityRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author ys
* @date 2023-08-13
*/
public interface YxCityRegionRepository extends JpaRepository<YxCityRegion, Long>, JpaSpecificationExecutor<YxCityRegion> {
}
