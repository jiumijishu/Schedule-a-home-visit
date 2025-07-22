package co.xiaoxiang.modules.shop.repository;

import co.xiaoxiang.modules.shop.domain.YxStoreProduct;
import co.xiaoxiang.modules.shop.domain.YxSystemStoreStaff;
import co.xiaoxiang.modules.shop.service.dto.YxSystemStoreStaffQueryCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
* @author hupeng
* @date 2020-03-22
*/
public interface YxSystemStoreStaffRepository extends JpaRepository<YxSystemStoreStaff, Integer>, JpaSpecificationExecutor<YxSystemStoreStaff> {

    @Query(value = "SELECT  * FROM yx_system_store_staff WHERE uid = ?1 AND spread_uid = ?2",nativeQuery = true)
    List<YxSystemStoreStaff> findByUid(Integer uid, Integer spreadUid);

    @Query(value = "SELECT  * FROM yx_system_store_staff WHERE uid = ?1 AND spread_uid = ?2",nativeQuery = true)
    YxSystemStoreStaff findByUids(Integer uid, Integer spreadUid);
}
